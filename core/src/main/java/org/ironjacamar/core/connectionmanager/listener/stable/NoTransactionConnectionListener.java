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

package org.ironjacamar.core.connectionmanager.listener.stable;

import org.ironjacamar.core.connectionmanager.ConnectionManager;
import org.ironjacamar.core.connectionmanager.Credential;
import org.ironjacamar.core.connectionmanager.listener.AbstractConnectionListener;

import javax.resource.ResourceException;
import javax.resource.spi.ManagedConnection;

/**
 * The NoTransaction connection listener
 * 
 * @author <a href="jesper.pedersen@ironjacamar.org">Jesper Pedersen</a>
 */
public class NoTransactionConnectionListener extends AbstractConnectionListener
{
   /**
    * Constructor
    * @param cm The connection manager
    * @param mc The managed connection
    * @param credential The credential
    */
   public NoTransactionConnectionListener(ConnectionManager cm, ManagedConnection mc, Credential credential)
   {
      super(cm, mc, credential);
   }

   /**
    * {@inheritDoc}
    */
   public boolean isEnlisted()
   {
      return false;
   }

   /**
    * {@inheritDoc}
    */
   public void enlist() throws ResourceException
   {
   }
}
