/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.workflow;

import com.liferay.portal.model.Group;
import com.liferay.portal.model.Portlet;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portlet.AdministratorControlPanelEntry;

/**
 * @author Renato Rego
 */
public class ControlPanelWorkflowControlPanelEntry
	extends AdministratorControlPanelEntry {

	@Override
	public boolean hasAccessPermission(
			PermissionChecker permissionChecker, Group group, Portlet portlet)
		throws Exception {

		if (!super.hasAccessPermission(permissionChecker, group, portlet)) {
			return false;
		}

		return _workflowControlPanelEntry.hasAccessPermission(
			permissionChecker, group, portlet);
	}

	private final WorkflowControlPanelEntry _workflowControlPanelEntry =
		new WorkflowControlPanelEntry();

}