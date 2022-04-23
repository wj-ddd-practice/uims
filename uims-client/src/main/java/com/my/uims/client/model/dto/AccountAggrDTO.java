package com.my.uims.client.model.dto;

import java.util.List;

/**
 * @author wujun
 * create time: 11:37 下午
 */
public class AccountAggrDTO extends AccountDTO {

    private List<RoleDTO> roles;

    public List<RoleDTO> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleDTO> roles) {
        this.roles = roles;
    }
}
