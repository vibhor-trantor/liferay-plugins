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

package com.liferay.screens.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.InfrastructureUtil;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.ClassNamePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import com.liferay.portlet.dynamicdatalists.service.persistence.DDLRecordPersistence;

import com.liferay.screens.service.ScreensDDLRecordService;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the screens d d l record remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.screens.service.impl.ScreensDDLRecordServiceImpl}.
 * </p>
 *
 * @author José Manuel Navarro
 * @see com.liferay.screens.service.impl.ScreensDDLRecordServiceImpl
 * @see com.liferay.screens.service.ScreensDDLRecordServiceUtil
 * @generated
 */
public abstract class ScreensDDLRecordServiceBaseImpl extends BaseServiceImpl
	implements ScreensDDLRecordService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.screens.service.ScreensDDLRecordServiceUtil} to access the screens d d l record remote service.
	 */

	/**
	 * Returns the screens asset entry remote service.
	 *
	 * @return the screens asset entry remote service
	 */
	public com.liferay.screens.service.ScreensAssetEntryService getScreensAssetEntryService() {
		return screensAssetEntryService;
	}

	/**
	 * Sets the screens asset entry remote service.
	 *
	 * @param screensAssetEntryService the screens asset entry remote service
	 */
	public void setScreensAssetEntryService(
		com.liferay.screens.service.ScreensAssetEntryService screensAssetEntryService) {
		this.screensAssetEntryService = screensAssetEntryService;
	}

	/**
	 * Returns the screens comment remote service.
	 *
	 * @return the screens comment remote service
	 */
	public com.liferay.screens.service.ScreensCommentService getScreensCommentService() {
		return screensCommentService;
	}

	/**
	 * Sets the screens comment remote service.
	 *
	 * @param screensCommentService the screens comment remote service
	 */
	public void setScreensCommentService(
		com.liferay.screens.service.ScreensCommentService screensCommentService) {
		this.screensCommentService = screensCommentService;
	}

	/**
	 * Returns the screens d d l record remote service.
	 *
	 * @return the screens d d l record remote service
	 */
	public com.liferay.screens.service.ScreensDDLRecordService getScreensDDLRecordService() {
		return screensDDLRecordService;
	}

	/**
	 * Sets the screens d d l record remote service.
	 *
	 * @param screensDDLRecordService the screens d d l record remote service
	 */
	public void setScreensDDLRecordService(
		com.liferay.screens.service.ScreensDDLRecordService screensDDLRecordService) {
		this.screensDDLRecordService = screensDDLRecordService;
	}

	/**
	 * Returns the screens journal article remote service.
	 *
	 * @return the screens journal article remote service
	 */
	public com.liferay.screens.service.ScreensJournalArticleService getScreensJournalArticleService() {
		return screensJournalArticleService;
	}

	/**
	 * Sets the screens journal article remote service.
	 *
	 * @param screensJournalArticleService the screens journal article remote service
	 */
	public void setScreensJournalArticleService(
		com.liferay.screens.service.ScreensJournalArticleService screensJournalArticleService) {
		this.screensJournalArticleService = screensJournalArticleService;
	}

	/**
	 * Returns the screens ratings entry remote service.
	 *
	 * @return the screens ratings entry remote service
	 */
	public com.liferay.screens.service.ScreensRatingsEntryService getScreensRatingsEntryService() {
		return screensRatingsEntryService;
	}

	/**
	 * Sets the screens ratings entry remote service.
	 *
	 * @param screensRatingsEntryService the screens ratings entry remote service
	 */
	public void setScreensRatingsEntryService(
		com.liferay.screens.service.ScreensRatingsEntryService screensRatingsEntryService) {
		this.screensRatingsEntryService = screensRatingsEntryService;
	}

	/**
	 * Returns the screens user remote service.
	 *
	 * @return the screens user remote service
	 */
	public com.liferay.screens.service.ScreensUserService getScreensUserService() {
		return screensUserService;
	}

	/**
	 * Sets the screens user remote service.
	 *
	 * @param screensUserService the screens user remote service
	 */
	public void setScreensUserService(
		com.liferay.screens.service.ScreensUserService screensUserService) {
		this.screensUserService = screensUserService;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name remote service.
	 *
	 * @return the class name remote service
	 */
	public com.liferay.portal.service.ClassNameService getClassNameService() {
		return classNameService;
	}

	/**
	 * Sets the class name remote service.
	 *
	 * @param classNameService the class name remote service
	 */
	public void setClassNameService(
		com.liferay.portal.service.ClassNameService classNameService) {
		this.classNameService = classNameService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	/**
	 * Returns the d d l record local service.
	 *
	 * @return the d d l record local service
	 */
	public com.liferay.portlet.dynamicdatalists.service.DDLRecordLocalService getDDLRecordLocalService() {
		return ddlRecordLocalService;
	}

	/**
	 * Sets the d d l record local service.
	 *
	 * @param ddlRecordLocalService the d d l record local service
	 */
	public void setDDLRecordLocalService(
		com.liferay.portlet.dynamicdatalists.service.DDLRecordLocalService ddlRecordLocalService) {
		this.ddlRecordLocalService = ddlRecordLocalService;
	}

	/**
	 * Returns the d d l record remote service.
	 *
	 * @return the d d l record remote service
	 */
	public com.liferay.portlet.dynamicdatalists.service.DDLRecordService getDDLRecordService() {
		return ddlRecordService;
	}

	/**
	 * Sets the d d l record remote service.
	 *
	 * @param ddlRecordService the d d l record remote service
	 */
	public void setDDLRecordService(
		com.liferay.portlet.dynamicdatalists.service.DDLRecordService ddlRecordService) {
		this.ddlRecordService = ddlRecordService;
	}

	/**
	 * Returns the d d l record persistence.
	 *
	 * @return the d d l record persistence
	 */
	public DDLRecordPersistence getDDLRecordPersistence() {
		return ddlRecordPersistence;
	}

	/**
	 * Sets the d d l record persistence.
	 *
	 * @param ddlRecordPersistence the d d l record persistence
	 */
	public void setDDLRecordPersistence(
		DDLRecordPersistence ddlRecordPersistence) {
		this.ddlRecordPersistence = ddlRecordPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = InfrastructureUtil.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.liferay.screens.service.ScreensAssetEntryService.class)
	protected com.liferay.screens.service.ScreensAssetEntryService screensAssetEntryService;
	@BeanReference(type = com.liferay.screens.service.ScreensCommentService.class)
	protected com.liferay.screens.service.ScreensCommentService screensCommentService;
	@BeanReference(type = com.liferay.screens.service.ScreensDDLRecordService.class)
	protected com.liferay.screens.service.ScreensDDLRecordService screensDDLRecordService;
	@BeanReference(type = com.liferay.screens.service.ScreensJournalArticleService.class)
	protected com.liferay.screens.service.ScreensJournalArticleService screensJournalArticleService;
	@BeanReference(type = com.liferay.screens.service.ScreensRatingsEntryService.class)
	protected com.liferay.screens.service.ScreensRatingsEntryService screensRatingsEntryService;
	@BeanReference(type = com.liferay.screens.service.ScreensUserService.class)
	protected com.liferay.screens.service.ScreensUserService screensUserService;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ClassNameLocalService.class)
	protected com.liferay.portal.service.ClassNameLocalService classNameLocalService;
	@BeanReference(type = com.liferay.portal.service.ClassNameService.class)
	protected com.liferay.portal.service.ClassNameService classNameService;
	@BeanReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@BeanReference(type = com.liferay.portlet.dynamicdatalists.service.DDLRecordLocalService.class)
	protected com.liferay.portlet.dynamicdatalists.service.DDLRecordLocalService ddlRecordLocalService;
	@BeanReference(type = com.liferay.portlet.dynamicdatalists.service.DDLRecordService.class)
	protected com.liferay.portlet.dynamicdatalists.service.DDLRecordService ddlRecordService;
	@BeanReference(type = DDLRecordPersistence.class)
	protected DDLRecordPersistence ddlRecordPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private ScreensDDLRecordServiceClpInvoker _clpInvoker = new ScreensDDLRecordServiceClpInvoker();
}