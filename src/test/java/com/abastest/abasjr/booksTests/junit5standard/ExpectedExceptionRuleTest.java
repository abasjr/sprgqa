package com.abastest.abasjr.booksTests.junit5standard;

import org.junit.Rule;
// import org.junit.jupiter.api.Test;
import org.junit.jupiter.migrationsupport.rules.EnableRuleMigrationSupport;
import org.junit.rules.ExpectedException;

@EnableRuleMigrationSupport
public class ExpectedExceptionRuleTest {
    
    @Rule
    ExpectedException thrown = ExpectedException.none();

    // Error java.lang.AbstractMethodError

    // @Test
    // void throwsNothing() {
    // }

    // @Test
    // void throwsNullPointerException() {
    //     thrown.expect(NullPointerException.class);
    //     throw new NullPointerException();
    // }
}