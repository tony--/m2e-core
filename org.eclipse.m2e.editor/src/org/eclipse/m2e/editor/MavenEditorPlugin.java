/*******************************************************************************
 * Copyright (c) 2008-2010 Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *      Sonatype, Inc. - initial API and implementation
 *******************************************************************************/

package org.eclipse.m2e.editor;

import org.osgi.framework.BundleContext;

import org.eclipse.ui.plugin.AbstractUIPlugin;


/**
 * @author Eugene Kuleshov
 */
public class MavenEditorPlugin extends AbstractUIPlugin {

  public static final String PLUGIN_ID = "org.eclipse.m2e.editor"; //$NON-NLS-1$

  // This used to be in org.eclipse.m2e.editor.xml and it must not change in order to keep
  // backwards compatibility with the mojoParameterMetadata extension point from that bundle
  public static final String MvnIndex_PLUGIN_ID = "org.eclipse.m2e.editor.xml"; //$NON-NLS-1$

  private static MavenEditorPlugin instance;

  public MavenEditorPlugin() {
  }

  @Override
  public void start(BundleContext context) throws Exception {
    super.start(context);
    instance = this;
  }

  @Override
  public void stop(BundleContext context) throws Exception {
    super.stop(context);
    instance = null;
  }

  public static MavenEditorPlugin getDefault() {
    return instance;
  }

}
