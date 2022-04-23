package com.my.uims.domain.persistence.mybatis.dao;

import com.my.uims.domain.account.aggregate.AccountAggr;
import com.my.uims.domain.account.entity.Account;
import com.my.uims.domain.account.repository.AccountRepository;
import org.springframework.stereotype.Repository;

/**
 * @author wujun
 * create time: 1:02 上午
 */
@Repository
public class AccountDAO implements AccountRepository {

    @Override
    public Account findOneByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public Account findOneByLoginName(String loginName) {
        return null;
    }

    @Override
    public AccountAggr getAccountAggrById(Long id) {
        return null;
    }

    @Override
    public Long save(AccountAggr accountAggr) {
        return null;
    }
}
