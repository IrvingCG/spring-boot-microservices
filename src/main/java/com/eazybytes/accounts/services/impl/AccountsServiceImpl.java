package com.eazybytes.accounts.services.impl;

import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.repository.AccountsRepository;
import com.eazybytes.accounts.repository.CustomerRepository;
import com.eazybytes.accounts.services.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

    private AccountsRepository accoutsRepository;
    private CustomerRepository customerRepository;
    /**
     *
     * @param customerDto-CustomerDto Object
     */

    @Override
    public void createAccount(CustomerDto customerDto){

    }


}
