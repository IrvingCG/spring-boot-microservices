package com.eazybytes.accounts.services;

import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.repository.AccountsRepository;

public interface IAccountsService {
/**
 *
 * @param customerDto-CustomerDto Object
 */


void createAccount(CustomerDto customerDto);
}
