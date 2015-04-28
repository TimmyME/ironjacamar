/*
 * IronJacamar, a Java EE Connector Architecture implementation
 * Copyright 2015, Red Hat Inc, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the Eclipse Public License 1.0 as
 * published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the Eclipse
 * Public License for more details.
 *
 * You should have received a copy of the Eclipse Public License 
 * along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.ironjacamar.core.tx.narayana;

import org.ironjacamar.core.spi.transaction.recovery.XAResourceRecovery;

/**
 * An XAResourceRecoveryRegistry implementation
 */
public class XAResourceRecoveryRegistryImpl
   implements org.ironjacamar.core.spi.transaction.recovery.XAResourceRecoveryRegistry
{
   /** Delegator */
   private org.jboss.tm.XAResourceRecoveryRegistry delegator;

   /**
    * Constructor
    * @param delegator The delegator
    */
   public XAResourceRecoveryRegistryImpl(org.jboss.tm.XAResourceRecoveryRegistry delegator)
   {
      this.delegator = delegator;
   }

   /**
    * {@inheritDoc}
    */
   public void addXAResourceRecovery(XAResourceRecovery recovery)
   {
      if (!(recovery instanceof org.jboss.tm.XAResourceRecovery))
         throw new IllegalArgumentException("Recovery is not a org.jboss.tm.XAResourceRecovery instance");

      delegator.addXAResourceRecovery((org.jboss.tm.XAResourceRecovery)recovery);
   }

   /**
    * {@inheritDoc}
    */
   public void removeXAResourceRecovery(XAResourceRecovery recovery)
   {
      if (!(recovery instanceof org.jboss.tm.XAResourceRecovery))
         throw new IllegalArgumentException("Recovery is not a org.jboss.tm.XAResourceRecovery instance");

      delegator.removeXAResourceRecovery((org.jboss.tm.XAResourceRecovery)recovery);
   }
}
