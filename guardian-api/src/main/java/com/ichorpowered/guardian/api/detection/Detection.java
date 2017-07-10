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
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.ichorpowered.guardian.api.detection;

import com.ichorpowered.guardian.api.Guardian;

import javax.annotation.Nonnull;

/**
 * Represents a type of cheat or illegal
 * operation that may contain many checks
 * scan on players.
 *
 * @param <E> the detection owner type
 * @param <F> the detection owner configuration type
 */
public interface Detection<E extends Guardian, F> {

    /**
     * Returns the plugin that owns this detection.
     *
     * @return the detection owner
     */
    E getOwner();

    /**
     * Returns the permission node for the associated target.
     *
     * @param permissionTarget the permission target
     * @return the permission node
     */
    String getPermission(@Nonnull String permissionTarget);

    /**
     * Returns the detections configuration.
     *
     * @return the detection configuration
     */
    F getConfiguration();

    /**
     * Returns the state of readiness the module is in.
     *
     * @return the state of readiness
     */
    State getState();

    /**
     * Sets the state of readiness the module is in.
     *
     * @param state the state of readiness
     */
    void setState(@Nonnull State state);

    enum State {

        /**
         * Represents the state in which modules have been initialized
         * and must carry out procedures to get ready for active checking.
         *
         * References must be initialized before {@code State.STARTED} or
         * else checks may reference non-initialized or unready fields.
         */
        STARTING,

        /**
         * Represents the state in which modules have carried out procedures
         * and have been enlisted to undertake active checking.
         *
         * References should be initialized before switching to this state.
         */
        STARTED,

        /**
         * Represents the state in which new active checking is stopped and
         * some ending procedures may take place.
         */
        FINISHING,

        /**
         * Represents the state in which the module has no more active checks
         * and is ready to be removed.
         */
        FINISHED,

        /**
         * Represents the default state when the module has not been initialized
         * or what is set before the module is removed.
         */
        UNDEFINED

    }

}
