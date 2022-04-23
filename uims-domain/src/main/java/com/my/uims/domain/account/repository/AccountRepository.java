package com.my.uims.domain.account.repository;

import com.my.uims.domain.account.aggregate.AccountAggr;
import com.my.uims.domain.account.entity.Account;

/**
 * @author wujun
 * create time: 12:13 上午
 */
public interface AccountRepository {

    Account findOneByPrimaryKey(Long id);

    Account findOneByLoginName(String loginName);

    AccountAggr getAccountAggrById(Long id);

    Long save(AccountAggr accountAggr);

    
}
