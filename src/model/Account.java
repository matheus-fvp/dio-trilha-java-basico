package model;

import java.math.BigDecimal;
import java.util.Objects;

public class Account {

    private Long accountNumber;
    private String agency;
    private Client client;
    private BigDecimal balance;

    public Account() {
    }

    public Account(Long accountId, String agency, Client client, BigDecimal balance) {
        this.accountNumber = accountId;
        this.agency = agency;
        this.client = client;
        this.balance = balance;
    }

    public Long getAccountId() {
        return accountNumber;
    }

    public String getAgency() {
        return agency;
    }

    public Client getClient() {
        return client;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountNumber, account.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, agency);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountNumber +
                ", agency='" + agency + '\'' +
                ", client=" + client +
                ", balance=" + balance +
                '}';
    }
}
