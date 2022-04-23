package com.my.uims.client.model.dto;

import java.io.Serializable;

/**
 * @author wujun
 * create time: 11:37 下午
 */
public class RoleDTO implements Serializable {

    private Long Id;

    private String roleName;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
