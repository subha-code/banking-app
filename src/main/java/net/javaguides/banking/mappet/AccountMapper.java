package net.javaguides.banking.mappet;

import net.javaguides.banking.dto.AccountDto;
import net.javaguides.banking.entity.Account;

public class AccountMapper {
    public static Account napToAccount(AccountDto accountDto){
        Account account = new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );

        return account;
    }
    public static AccountDto napToAccountDto(Account account){
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()

        );
        return accountDto;

    }
}
