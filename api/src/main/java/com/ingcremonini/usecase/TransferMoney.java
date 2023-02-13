package com.ingcremonini.usecase;

import com.ingcremonini.domain.BankAccount;

public interface TransferMoney {

    void transferMoneyFromAccountToAccount(BankAccount sourceBankAccount, BankAccount targetBankAccount);
}
