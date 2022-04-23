package com.my.uims.client.model.dto;

import java.io.Serializable;

/**
 * @author wujun
 * create time: 11:37 下午
 */
public class AccountDTO implements Serializable {

    private Long Id;

    private String loginAccount;

    private String nickName;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
