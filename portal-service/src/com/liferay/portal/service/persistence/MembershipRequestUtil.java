/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.model.MembershipRequest;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the membership request service. This utility wraps {@link MembershipRequestPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MembershipRequestPersistence
 * @see MembershipRequestPersistenceImpl
 * @generated
 */
public class MembershipRequestUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(MembershipRequest membershipRequest) {
		getPersistence().clearCache(membershipRequest);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MembershipRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MembershipRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MembershipRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static MembershipRequest remove(MembershipRequest membershipRequest)
		throws SystemException {
		return getPersistence().remove(membershipRequest);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static MembershipRequest update(
		MembershipRequest membershipRequest, boolean merge)
		throws SystemException {
		return getPersistence().update(membershipRequest, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static MembershipRequest update(
		MembershipRequest membershipRequest, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(membershipRequest, merge, serviceContext);
	}

	/**
	* Caches the membership request in the entity cache if it is enabled.
	*
	* @param membershipRequest the membership request to cache
	*/
	public static void cacheResult(
		com.liferay.portal.model.MembershipRequest membershipRequest) {
		getPersistence().cacheResult(membershipRequest);
	}

	/**
	* Caches the membership requests in the entity cache if it is enabled.
	*
	* @param membershipRequests the membership requests to cache
	*/
	public static void cacheResult(
		java.util.List<com.liferay.portal.model.MembershipRequest> membershipRequests) {
		getPersistence().cacheResult(membershipRequests);
	}

	/**
	* Creates a new membership request with the primary key. Does not add the membership request to the database.
	*
	* @param membershipRequestId the primary key for the new membership request
	* @return the new membership request
	*/
	public static com.liferay.portal.model.MembershipRequest create(
		long membershipRequestId) {
		return getPersistence().create(membershipRequestId);
	}

	/**
	* Removes the membership request with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param membershipRequestId the primary key of the membership request to remove
	* @return the membership request that was removed
	* @throws com.liferay.portal.NoSuchMembershipRequestException if a membership request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.MembershipRequest remove(
		long membershipRequestId)
		throws com.liferay.portal.NoSuchMembershipRequestException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(membershipRequestId);
	}

	public static com.liferay.portal.model.MembershipRequest updateImpl(
		com.liferay.portal.model.MembershipRequest membershipRequest,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(membershipRequest, merge);
	}

	/**
	* Finds the membership request with the primary key or throws a {@link com.liferay.portal.NoSuchMembershipRequestException} if it could not be found.
	*
	* @param membershipRequestId the primary key of the membership request to find
	* @return the membership request
	* @throws com.liferay.portal.NoSuchMembershipRequestException if a membership request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.MembershipRequest findByPrimaryKey(
		long membershipRequestId)
		throws com.liferay.portal.NoSuchMembershipRequestException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(membershipRequestId);
	}

	/**
	* Finds the membership request with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param membershipRequestId the primary key of the membership request to find
	* @return the membership request, or <code>null</code> if a membership request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.MembershipRequest fetchByPrimaryKey(
		long membershipRequestId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(membershipRequestId);
	}

	/**
	* Finds all the membership requests where groupId = &#63;.
	*
	* @param groupId the group ID to search with
	* @return the matching membership requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.MembershipRequest> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Finds a range of all the membership requests where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID to search with
	* @param start the lower bound of the range of membership requests to return
	* @param end the upper bound of the range of membership requests to return (not inclusive)
	* @return the range of matching membership requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.MembershipRequest> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Finds an ordered range of all the membership requests where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID to search with
	* @param start the lower bound of the range of membership requests to return
	* @param end the upper bound of the range of membership requests to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching membership requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.MembershipRequest> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Finds the first membership request in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching membership request
	* @throws com.liferay.portal.NoSuchMembershipRequestException if a matching membership request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.MembershipRequest findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchMembershipRequestException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Finds the last membership request in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching membership request
	* @throws com.liferay.portal.NoSuchMembershipRequestException if a matching membership request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.MembershipRequest findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchMembershipRequestException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Finds the membership requests before and after the current membership request in the ordered set where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param membershipRequestId the primary key of the current membership request
	* @param groupId the group ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next membership request
	* @throws com.liferay.portal.NoSuchMembershipRequestException if a membership request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.MembershipRequest[] findByGroupId_PrevAndNext(
		long membershipRequestId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchMembershipRequestException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(membershipRequestId, groupId,
			orderByComparator);
	}

	/**
	* Finds all the membership requests where userId = &#63;.
	*
	* @param userId the user ID to search with
	* @return the matching membership requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.MembershipRequest> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Finds a range of all the membership requests where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID to search with
	* @param start the lower bound of the range of membership requests to return
	* @param end the upper bound of the range of membership requests to return (not inclusive)
	* @return the range of matching membership requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.MembershipRequest> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	* Finds an ordered range of all the membership requests where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID to search with
	* @param start the lower bound of the range of membership requests to return
	* @param end the upper bound of the range of membership requests to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching membership requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.MembershipRequest> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Finds the first membership request in the ordered set where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching membership request
	* @throws com.liferay.portal.NoSuchMembershipRequestException if a matching membership request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.MembershipRequest findByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchMembershipRequestException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Finds the last membership request in the ordered set where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching membership request
	* @throws com.liferay.portal.NoSuchMembershipRequestException if a matching membership request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.MembershipRequest findByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchMembershipRequestException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Finds the membership requests before and after the current membership request in the ordered set where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param membershipRequestId the primary key of the current membership request
	* @param userId the user ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next membership request
	* @throws com.liferay.portal.NoSuchMembershipRequestException if a membership request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.MembershipRequest[] findByUserId_PrevAndNext(
		long membershipRequestId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchMembershipRequestException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUserId_PrevAndNext(membershipRequestId, userId,
			orderByComparator);
	}

	/**
	* Finds all the membership requests where groupId = &#63; and statusId = &#63;.
	*
	* @param groupId the group ID to search with
	* @param statusId the status ID to search with
	* @return the matching membership requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.MembershipRequest> findByG_S(
		long groupId, int statusId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_S(groupId, statusId);
	}

	/**
	* Finds a range of all the membership requests where groupId = &#63; and statusId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID to search with
	* @param statusId the status ID to search with
	* @param start the lower bound of the range of membership requests to return
	* @param end the upper bound of the range of membership requests to return (not inclusive)
	* @return the range of matching membership requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.MembershipRequest> findByG_S(
		long groupId, int statusId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_S(groupId, statusId, start, end);
	}

	/**
	* Finds an ordered range of all the membership requests where groupId = &#63; and statusId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID to search with
	* @param statusId the status ID to search with
	* @param start the lower bound of the range of membership requests to return
	* @param end the upper bound of the range of membership requests to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching membership requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.MembershipRequest> findByG_S(
		long groupId, int statusId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_S(groupId, statusId, start, end, orderByComparator);
	}

	/**
	* Finds the first membership request in the ordered set where groupId = &#63; and statusId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID to search with
	* @param statusId the status ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching membership request
	* @throws com.liferay.portal.NoSuchMembershipRequestException if a matching membership request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.MembershipRequest findByG_S_First(
		long groupId, int statusId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchMembershipRequestException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_S_First(groupId, statusId, orderByComparator);
	}

	/**
	* Finds the last membership request in the ordered set where groupId = &#63; and statusId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param groupId the group ID to search with
	* @param statusId the status ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching membership request
	* @throws com.liferay.portal.NoSuchMembershipRequestException if a matching membership request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.MembershipRequest findByG_S_Last(
		long groupId, int statusId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchMembershipRequestException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_S_Last(groupId, statusId, orderByComparator);
	}

	/**
	* Finds the membership requests before and after the current membership request in the ordered set where groupId = &#63; and statusId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param membershipRequestId the primary key of the current membership request
	* @param groupId the group ID to search with
	* @param statusId the status ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next membership request
	* @throws com.liferay.portal.NoSuchMembershipRequestException if a membership request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.MembershipRequest[] findByG_S_PrevAndNext(
		long membershipRequestId, long groupId, int statusId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchMembershipRequestException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_S_PrevAndNext(membershipRequestId, groupId,
			statusId, orderByComparator);
	}

	/**
	* Finds all the membership requests where userId = &#63; and groupId = &#63; and statusId = &#63;.
	*
	* @param userId the user ID to search with
	* @param groupId the group ID to search with
	* @param statusId the status ID to search with
	* @return the matching membership requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.MembershipRequest> findByU_G_S(
		long userId, long groupId, int statusId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByU_G_S(userId, groupId, statusId);
	}

	/**
	* Finds a range of all the membership requests where userId = &#63; and groupId = &#63; and statusId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID to search with
	* @param groupId the group ID to search with
	* @param statusId the status ID to search with
	* @param start the lower bound of the range of membership requests to return
	* @param end the upper bound of the range of membership requests to return (not inclusive)
	* @return the range of matching membership requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.MembershipRequest> findByU_G_S(
		long userId, long groupId, int statusId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByU_G_S(userId, groupId, statusId, start, end);
	}

	/**
	* Finds an ordered range of all the membership requests where userId = &#63; and groupId = &#63; and statusId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID to search with
	* @param groupId the group ID to search with
	* @param statusId the status ID to search with
	* @param start the lower bound of the range of membership requests to return
	* @param end the upper bound of the range of membership requests to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching membership requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.MembershipRequest> findByU_G_S(
		long userId, long groupId, int statusId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByU_G_S(userId, groupId, statusId, start, end,
			orderByComparator);
	}

	/**
	* Finds the first membership request in the ordered set where userId = &#63; and groupId = &#63; and statusId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID to search with
	* @param groupId the group ID to search with
	* @param statusId the status ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching membership request
	* @throws com.liferay.portal.NoSuchMembershipRequestException if a matching membership request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.MembershipRequest findByU_G_S_First(
		long userId, long groupId, int statusId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchMembershipRequestException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByU_G_S_First(userId, groupId, statusId,
			orderByComparator);
	}

	/**
	* Finds the last membership request in the ordered set where userId = &#63; and groupId = &#63; and statusId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID to search with
	* @param groupId the group ID to search with
	* @param statusId the status ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching membership request
	* @throws com.liferay.portal.NoSuchMembershipRequestException if a matching membership request could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.MembershipRequest findByU_G_S_Last(
		long userId, long groupId, int statusId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchMembershipRequestException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByU_G_S_Last(userId, groupId, statusId,
			orderByComparator);
	}

	/**
	* Finds the membership requests before and after the current membership request in the ordered set where userId = &#63; and groupId = &#63; and statusId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param membershipRequestId the primary key of the current membership request
	* @param userId the user ID to search with
	* @param groupId the group ID to search with
	* @param statusId the status ID to search with
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next membership request
	* @throws com.liferay.portal.NoSuchMembershipRequestException if a membership request with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.model.MembershipRequest[] findByU_G_S_PrevAndNext(
		long membershipRequestId, long userId, long groupId, int statusId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.NoSuchMembershipRequestException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByU_G_S_PrevAndNext(membershipRequestId, userId,
			groupId, statusId, orderByComparator);
	}

	/**
	* Finds all the membership requests.
	*
	* @return the membership requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.MembershipRequest> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the membership requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of membership requests to return
	* @param end the upper bound of the range of membership requests to return (not inclusive)
	* @return the range of membership requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.MembershipRequest> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the membership requests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of membership requests to return
	* @param end the upper bound of the range of membership requests to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of membership requests
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.model.MembershipRequest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the membership requests where groupId = &#63; from the database.
	*
	* @param groupId the group ID to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Removes all the membership requests where userId = &#63; from the database.
	*
	* @param userId the user ID to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Removes all the membership requests where groupId = &#63; and statusId = &#63; from the database.
	*
	* @param groupId the group ID to search with
	* @param statusId the status ID to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_S(long groupId, int statusId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_S(groupId, statusId);
	}

	/**
	* Removes all the membership requests where userId = &#63; and groupId = &#63; and statusId = &#63; from the database.
	*
	* @param userId the user ID to search with
	* @param groupId the group ID to search with
	* @param statusId the status ID to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByU_G_S(long userId, long groupId, int statusId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByU_G_S(userId, groupId, statusId);
	}

	/**
	* Removes all the membership requests from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the membership requests where groupId = &#63;.
	*
	* @param groupId the group ID to search with
	* @return the number of matching membership requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Counts all the membership requests where userId = &#63;.
	*
	* @param userId the user ID to search with
	* @return the number of matching membership requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Counts all the membership requests where groupId = &#63; and statusId = &#63;.
	*
	* @param groupId the group ID to search with
	* @param statusId the status ID to search with
	* @return the number of matching membership requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_S(long groupId, int statusId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_S(groupId, statusId);
	}

	/**
	* Counts all the membership requests where userId = &#63; and groupId = &#63; and statusId = &#63;.
	*
	* @param userId the user ID to search with
	* @param groupId the group ID to search with
	* @param statusId the status ID to search with
	* @return the number of matching membership requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countByU_G_S(long userId, long groupId, int statusId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByU_G_S(userId, groupId, statusId);
	}

	/**
	* Counts all the membership requests.
	*
	* @return the number of membership requests
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MembershipRequestPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MembershipRequestPersistence)PortalBeanLocatorUtil.locate(MembershipRequestPersistence.class.getName());

			ReferenceRegistry.registerReference(MembershipRequestUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(MembershipRequestPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(MembershipRequestUtil.class,
			"_persistence");
	}

	private static MembershipRequestPersistence _persistence;
}