package com.my.uims.client.service;

import com.my.uims.client.model.dto.AccountDTO;

/**
 * @author wujun
 * create time: 11:41 下午
 */
public interface AccountClientService {

    AccountDTO getAccountById(Long id);

}
