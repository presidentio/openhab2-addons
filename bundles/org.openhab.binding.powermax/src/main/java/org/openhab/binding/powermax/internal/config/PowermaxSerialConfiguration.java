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
package org.openhab.binding.powermax.internal.config;

/**
 * The {@link PowermaxSerialConfiguration} is responsible for holding
 * configuration informations associated to a Powermax serial thing type
 *
 * @author Laurent Garnier - Initial contribution
 */
public class PowermaxSerialConfiguration {

    public String serialPort;
    public Integer motionOffDelay;
    public Boolean allowArming;
    public Boolean allowDisarming;
    public String pinCode;
    public Boolean forceStandardMode;
    public String panelType;
    public Boolean autoSyncTime;

}
