package com.company;
import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    public void balanceTest(){
        double balanceExpected = 20575;
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        account.withDraw(2500);
        account.deposit(3000);
        assertEquals(balanceExpected, account.getBalance());
    }

    @Test
    public void monthlyInterest(){
        double monthlyExpected = 77.15625;
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        account.withDraw(2500);
        account.deposit(3000);
        assertEquals(monthlyExpected, account.getMonthlyInterest());
    }

    @Test
    public void dayCreated(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dateCreated = new Date();
        String dateExpected = dateFormat.format(dateCreated);
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        account.withDraw(2500);
        account.deposit(3000);
        assertEquals(dateExpected, dateFormat.format(account.getDateCreated()));
    }
}
