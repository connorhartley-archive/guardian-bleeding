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
package com.ichorpowered.guardian.event.sequence;

import com.ichorpowered.guardian.api.event.origin.Origin;
import com.ichorpowered.guardian.api.event.sequence.SequenceStartEvent;
import com.ichorpowered.guardian.api.report.Summary;
import com.ichorpowered.guardian.api.sequence.Sequence;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.Cancellable;

public class SpongeSequenceStartEvent<E, F> implements SequenceStartEvent<E, F, Player>, Cancellable {

    private final Origin origin;
    private final Sequence<E, F, Player> sequence;
    private final Player player;
    private final Summary<E, F> summary;

    private boolean cancelled = false;

    public SpongeSequenceStartEvent(Origin origin, Sequence<E, F, Player> sequence,
                                    Player player, Summary<E, F> summary) {
        this.origin = origin;
        this.sequence = sequence;
        this.player = player;
        this.summary = summary;
    }

    @Override
    public Sequence<E, F, Player> getSequence() {
        return this.sequence;
    }

    @Override
    public Player getPlayer() {
        return this.player;
    }

    @Override
    public Summary<E, F> getSummary() {
        return this.summary;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    @Override
    public Origin getOrigin() {
        return this.origin;
    }

}
