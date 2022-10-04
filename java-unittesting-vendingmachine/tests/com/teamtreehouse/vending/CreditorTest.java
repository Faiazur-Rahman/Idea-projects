package com.teamtreehouse.vending;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreditorTest {

    @Test
    public void addingFundsIncrementsAvailableFunds() throws Exception{
        Creditor creditor = new Creditor();
        creditor.addFunds(25);
        creditor.addFunds(20);

        assertEquals(50,creditor.getAvailableFunds());
    }


}