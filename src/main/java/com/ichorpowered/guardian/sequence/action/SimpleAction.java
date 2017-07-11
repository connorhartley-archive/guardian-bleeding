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
package com.ichorpowered.guardian.sequence.action;

import com.ichorpowered.guardian.api.sequence.action.Action;
import com.ichorpowered.guardian.api.sequence.condition.Condition;
import org.spongepowered.api.entity.living.player.Player;

import javax.annotation.Nonnull;

public class SimpleAction<T> implements Action<T, Player> {

    @Override
    public void addCondition(@Nonnull Condition<T, Player> condition) {

    }

    @Override
    public void setDelay(int time) {

    }

    @Override
    public void setExpire(int time) {

    }

    @Override
    public boolean apply(Player player, T event, long lastActionTime) {
        return false;
    }

    @Override
    public boolean succeed(Player player, T event, long lastActionTime) {
        return false;
    }

    @Override
    public boolean fail(Player player, T event, long lastActionTime) {
        return false;
    }

    @Override
    public int getDelay() {
        return 0;
    }

    @Override
    public int getExpire() {
        return 0;
    }

    @Override
    public Class<? extends T> getEvent() {
        return null;
    }

}
