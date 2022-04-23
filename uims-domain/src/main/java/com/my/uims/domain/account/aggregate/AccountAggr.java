package com.my.uims.domain.account.aggregate;

import com.my.uims.domain.account.entity.Account;

import java.util.List;

/**
 * @author wujun
 * create time: 12:12 上午
 */
public class AccountAggr extends Account {

    List<Long> roleIdList;

    public List<Long> getRoleIdList() {
        return roleIdList;
    }

    public void setRoleIdList(List<Long> roleIdList) {
        this.roleIdList = roleIdList;
    }
}
