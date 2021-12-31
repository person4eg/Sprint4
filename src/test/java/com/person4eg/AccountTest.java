package com.person4eg;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {

    private final boolean excepted;
    private final Account account;

    public AccountTest(String name, boolean excepted) {
        this.excepted = excepted;
        account = new Account(name);
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {null, false},
                {"ab", false},
                {"abcdefdhigkl mnopqrstuvwxyz", false},
                {"a b", true},
                {"abcdefdhigklmn pqrs", true},
                {"abcdfd gklnpqr", true},
                {"abcdefdqvwxyz", false},
                {"abcfdq rstuxyz", true},
                {"abcfdq  rstuxyz", false},
                {"abcd fdqtu vwx", false},
                {" abcdefdqvwxyz", false},
                {"abcdefdqvwxyz ", false}
        };
    }

    @Test
    public void test() {
        boolean actual = account.checkNameToEmboss();
        assertEquals(excepted, actual);
    }
}
