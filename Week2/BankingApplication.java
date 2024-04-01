package Week2;

import java.math.BigDecimal;

public class BankingApplication {

    public static void main(String[] args) {

        Bank bank = new Bank();

        // AccountType accountType, String accountNumber, String owner,
        //                              BigDecimal balance, boolean isActivated,String targetAmount
        bank.createAccount(AccountType.NORMAL_ACCOUNT,"123123", "김지웅", BigDecimal.valueOf(150),true);
        bank.withdraw("123123",BigDecimal.valueOf(30));
        bank.deposit("123123",BigDecimal.valueOf(10));
        bank.getAccountInfo("123123");


        bank.createAccount(AccountType.SAVING_ACCOUNT,"321321", "김지웅", BigDecimal.valueOf(200),true, "500");
        bank.withdraw("321321",BigDecimal.valueOf(30));
        bank.deposit("321321",BigDecimal.valueOf(50));
        bank.getAccountInfo("321321");



        bank.getInterest("123123");

        bank.remittance("123123","321321",BigDecimal.TEN);

        bank.getAccountInfo("123123");
        bank.getAccountInfo("321321");

    }
}