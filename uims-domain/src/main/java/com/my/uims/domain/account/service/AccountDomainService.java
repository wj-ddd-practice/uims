package com.my.uims.domain.account.service;

import cn.hutool.crypto.digest.MD5;
import com.my.uims.domain.account.entity.Account;
import com.my.uims.domain.account.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;


/**
 * @author wujun
 * create time: 12:22 上午
 */
@Service
@AllArgsConstructor
public class AccountDomainService {
    private static final MD5 md5 = MD5.create();
    private AccountRepository accountRepository;

    public Boolean isValidPassword(String loginName, String password) {
        Account account = accountRepository.findOneByLoginName(loginName);
        if (account == null) {
            throw new IllegalArgumentException("account is not existed with loginName:" + loginName);
        }
        String md5Password = md5.digestHex(password);
        return StringUtils.equals(account.getMd5Password(), md5Password);
    }

}
