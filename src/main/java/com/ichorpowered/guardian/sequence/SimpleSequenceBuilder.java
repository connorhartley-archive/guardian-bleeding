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

import com.ichorpowered.guardian.api.detection.Check;
import com.ichorpowered.guardian.api.sequence.SequenceBuilder;
import com.ichorpowered.guardian.api.sequence.action.Action;
import com.ichorpowered.guardian.api.sequence.action.ActionBlueprint;
import com.ichorpowered.guardian.sequence.action.SimpleActionBuilder;
import org.spongepowered.api.entity.living.player.Player;

public class SimpleSequenceBuilder implements SequenceBuilder<Player> {

    @Override
    public <T> SimpleActionBuilder action(Class<T> clazz) {
        return null;
    }

    @Override
    public <T> SimpleActionBuilder action(ActionBlueprint<T, Player> blueprint) {
        return null;
    }

    @Override
    public <T> SimpleActionBuilder action(Action<T, Player> action) {
        return null;
    }

    @Override
    public <E, F> AbstractSequenceBlueprint<E, F> build(Check<E, F> check) {
        return null;
    }

}
