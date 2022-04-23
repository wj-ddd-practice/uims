package com.my.uims.client.service;

import com.my.uims.client.model.dto.AccountAggrDTO;

/**
 * @author wujun
 * create time: 11:42 下午
 */
public interface AuthenticationClientService {

    String generateQrCode(String loginName);

    AccountAggrDTO loginByPassword(String loginName, String password, String qrCode);

}
