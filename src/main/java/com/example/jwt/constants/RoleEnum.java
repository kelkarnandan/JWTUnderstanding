/*
 * COPYRIGHT:     Copyright (c) 2018 by Nuance Communications, Inc.
 * Warning:       This product is protected by United States copyright law.
 *                Unauthorized use or duplication of this software, in whole 
 *                or in part, is prohibited.
 */
package com.example.jwt.constants;

/**
 *
 * @author nandan_kelkar
 */
public enum RoleEnum {

    ADMIN("ADMIN", "ADMIN ROLE"),
    USER("USER", "USER ROLE");

    private final String roleValue;
    private final String roleDesc;

    private RoleEnum(String roleValue, String roleDesc) {
        this.roleValue = roleValue;
        this.roleDesc = roleDesc;
    }

    public String getRoleName() {
        return roleValue;
    }

    public String getRoleDesc() {
        return roleDesc;
    }
}