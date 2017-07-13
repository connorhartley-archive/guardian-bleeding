/*
 * MIT License
 *
 * Copyright (c) 2017 Connor Hartley
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.ichorpowered.guardian;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.ichorpowered.guardian.api.Guardian;
import com.ichorpowered.guardian.api.detection.DetectionRegistry;
import com.ichorpowered.guardian.api.event.GuardianEvent;
import com.ichorpowered.guardian.api.event.GuardianListener;
import com.ichorpowered.guardian.api.heuristic.HeuristicRegistry;
import com.ichorpowered.guardian.api.module.ModuleRegistry;
import com.ichorpowered.guardian.api.penalty.PenaltyRegistry;
import com.ichorpowered.guardian.api.sequence.SequenceManager;
import com.ichorpowered.guardian.api.util.ImplementationException;
import com.ichorpowered.guardian.sequence.SimpleSequenceManager;
import net.kyori.event.EventBus;
import net.kyori.event.SimpleEventBus;
import org.bstats.MetricsLite;
import org.slf4j.Logger;
import org.spongepowered.api.config.ConfigDir;
import org.spongepowered.api.plugin.Dependency;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.plugin.PluginContainer;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.format.TextColors;

import java.nio.file.Path;

@Plugin(
        id = PluginInfo.ID,
        name = PluginInfo.NAME,
        version = PluginInfo.VERSION,
        description = PluginInfo.DESCRIPTION,
        authors = {
                "Connor Hartley (vectrix)",
                "Matthew Miller (me4502)"
        },
        dependencies = {
                @Dependency(
                        id = "precogs",
                        version = PluginInfo.PRECOGS_VERSION
                ),
                @Dependency(
                        id = "elderguardian",
                        version = PluginInfo.ELDER_VERSION,
                        optional = true
                ),
                @Dependency(
                        id = "nucleus",
                        optional = true
                )
        }
)
@Singleton
public class GuardianBootstrap implements Guardian {

    public static Text GUARDIAN_PREFIX = Text.of(TextColors.DARK_AQUA, "[", TextColors.AQUA, "Guardian",
            TextColors.DARK_AQUA, "] ", TextColors.RESET);

    /* Injection Fields */

    @Inject @ConfigDir(sharedRoot = false) private Path configDir;
    @Inject private PluginContainer pluginContainer;
    @Inject private MetricsLite metrics;
    @Inject private Logger logger;

    public GuardianBootstrap() {}

    @Override
    public <T extends Guardian> T getInstance(Class<T> clazz) throws ImplementationException {
        if (this.getClass() != clazz) throw new ImplementationException(String.format("Invalid implementation reference for '%s'!", clazz.getName()));
        return (T) this;
    }

    @Override
    public SimpleEventBus<GuardianEvent, GuardianListener> getEventBus() {
        return null;
    }

    @Override
    public DetectionRegistry getDetectionRegistry() {
        return null;
    }

    @Override
    public HeuristicRegistry getHeuristicRegistry() {
        return null;
    }

    @Override
    public ModuleRegistry getModuleRegistry() {
        return null;
    }

    @Override
    public PenaltyRegistry getPenaltyRegistry() {
        return null;
    }

    @Override
    public SequenceManager getSequenceManager() {
        return new SimpleSequenceManager(this);
    }

}
