package com.xl.backen.model;

import java.util.List;

import com.xl.backen.entity.Users;

/**
 * 登录时返回的model
 * @author Administrator
 *
 */
public class UsersLoginModel<T> extends Users{
	private static final long serialVersionUID = 1350295179114099509L;
	/**
	 * 整合菜单和权限返回
	 */
	private List<T> permis;
}
