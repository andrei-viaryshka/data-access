/*
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
 * Foundation.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 * or from the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * Copyright 2008 - 2009 Pentaho Corporation.  All rights reserved.
 *
 *
 * Created December 08, 2011
 * @author Ezequiel Cuellar
 */
package org.pentaho.platform.dataaccess.datasource.ui.importing;

import org.pentaho.ui.xul.binding.BindingFactory;
import org.pentaho.ui.xul.components.XulButton;
import org.pentaho.ui.xul.components.XulTextbox;
import org.pentaho.ui.xul.containers.XulTree;
import org.pentaho.ui.xul.impl.AbstractXulEventHandler;

public class MetadataImportDialogController extends AbstractXulEventHandler implements IImportPerspective {

	private BindingFactory bf;
	private XulButton addButton;
	private XulButton removeButton;
	private XulTree localizedBundlesTree;
	private XulTextbox domainIdText;

	public void init() {

		addButton = (XulButton) document.getElementById("addButton"); //$NON-NLS-1$
		removeButton = (XulButton) document.getElementById("removeButton"); //$NON-NLS-1$
		localizedBundlesTree = (XulTree) document.getElementById("localizedBundlesTree"); //$NON-NLS-1$
		domainIdText = (XulTextbox) document.getElementById("domainIdText"); //$NON-NLS-1$
	}

	public void processImport() {
	}

	public void setBindingFactory(final BindingFactory bf) {
		this.bf = bf;
	}

	public String getName() {
		return "metadataImportDialogController";
	}
}