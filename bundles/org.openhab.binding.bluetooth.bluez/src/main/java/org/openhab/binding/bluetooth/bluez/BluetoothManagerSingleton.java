/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.bluetooth.bluez;

import tinyb.BluetoothManager;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
/**
 * The {@link BluetoothManagerSingleton} is responsible for providing an instance of BluetoothManager
 * and overcome an issue with version mismatch
 *
 * @author Vitaliy Gergel
 */
public class BluetoothManagerSingleton {

    private static BluetoothManager bluetoothManager;

    public static BluetoothManager getInstance() {
        if (bluetoothManager == null) {
            Constructor<BluetoothManager> constructor = (Constructor<BluetoothManager>) BluetoothManager.class.getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            try {
                bluetoothManager = constructor.newInstance();
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
        return bluetoothManager;
    }

}
