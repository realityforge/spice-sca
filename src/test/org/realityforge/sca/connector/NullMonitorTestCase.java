/*
 * Copyright (C) The Spice Group. All rights reserved.
 *
 * This software is published under the terms of the Spice
 * Software License version 1.1, a copy of which has been included
 * with this distribution in the LICENSE.txt file.
 */
package org.realityforge.sca.connector;

import junit.framework.TestCase;

/**
 * @author Peter Donald
 * @version $Revision: 1.1 $ $Date: 2004/06/21 05:54:29 $
 */
public class NullMonitorTestCase
    extends TestCase
{
    public void testNullMonitor()
        throws Exception
    {
        final NullMonitor monitor = new NullMonitor();
        monitor.attemptingConnection();
        monitor.attemptingValidation();
        monitor.connectionEstablished();
        monitor.errorConnecting( null );
        monitor.errorDisconnecting( null );
        monitor.errorValidatingConnection( null );
        monitor.skippingConnectionAttempt();
        monitor.attemptingDisconnection();
    }
}
