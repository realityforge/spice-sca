/*
 * Copyright (C) The Spice Group. All rights reserved.
 *
 * This software is published under the terms of the Spice
 * Software License version 1.1, a copy of which has been included
 * with this distribution in the LICENSE.txt file.
 */
package org.realityforge.sca.selector.impl;

import junit.framework.TestCase;

/**
 * @author Peter Donald
 * @version $Revision: 1.1 $ $Date: 2004/06/21 05:54:30 $
 */
public class NullSelectorEventHandlerTestCase
    extends TestCase
{
    public void testNullSelectorEventHandler()
        throws Exception
    {
        NullSelectorEventHandler.HANDLER.handleSelectorEvent( null, null );
    }
}
