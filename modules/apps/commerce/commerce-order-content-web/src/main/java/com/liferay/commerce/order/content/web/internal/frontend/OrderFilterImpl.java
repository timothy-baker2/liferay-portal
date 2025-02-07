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

package com.liferay.commerce.order.content.web.internal.frontend;

import com.liferay.frontend.taglib.clay.data.Filter;

/**
 * @author Alessio Antonio Rendina
 */
public class OrderFilterImpl implements Filter {

	public long getAccountId() {
		return _accountId;
	}

	public long getCommerceOrderId() {
		return _commerceOrderId;
	}

	@Override
	public String getKeywords() {
		return _keywords;
	}

	public void setAccountId(long accountId) {
		_accountId = accountId;
	}

	public void setCommerceOrderId(long commerceOrderId) {
		_commerceOrderId = commerceOrderId;
	}

	public void setKeywords(String keywords) {
		_keywords = keywords;
	}

	private long _accountId;
	private long _commerceOrderId;
	private String _keywords;

}