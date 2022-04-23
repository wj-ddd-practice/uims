package com.my.uims.domain.account.entity;

import java.io.Serializable;

/**
 * @author wujun
 * create time: 12:10 上午
 */
public class Account implements Serializable {

    private Long Id;

    private String loginAccount;

    private String md5Password;

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

    public String getMd5Password() {
        return md5Password;
    }

    public void setMd5Password(String md5Password) {
        this.md5Password = md5Password;
    }
}
