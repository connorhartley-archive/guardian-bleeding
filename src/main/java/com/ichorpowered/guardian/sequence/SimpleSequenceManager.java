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
package com.ichorpowered.guardian.sequence;

import com.ichorpowered.guardian.api.Guardian;
import com.ichorpowered.guardian.api.sequence.SequenceManager;
import com.ichorpowered.guardian.api.util.ImplementationException;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.Event;

public final class SimpleSequenceManager implements SequenceManager<Player, Event> {

    private Guardian plugin;

    public SimpleSequenceManager(Guardian plugin) {
        this.plugin = plugin;
    }

    @Override
    public void invoke(Player player, Event event) throws ImplementationException {

    }

    @Override
    public void clean(boolean force) {

    }

    @Override
    public void clean(Player player, boolean force) throws ImplementationException {

    }
}
