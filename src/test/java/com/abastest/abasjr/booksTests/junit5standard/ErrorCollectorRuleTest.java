package com.abastest.abasjr.booksTests.junit5standard;

// import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Rule;
// import org.junit.jupiter.api.Test;
import org.junit.jupiter.migrationsupport.rules.EnableRuleMigrationSupport;
import org.junit.rules.ErrorCollector;

@EnableRuleMigrationSupport
public class ErrorCollectorRuleTest {

    @Rule
    public ErrorCollector collector = new ErrorCollector();

    // Error java.lang.AbstractMethodError

    // @Test
    // void test(){
    //     collector.checkThat("a", equalTo("b"));
    //     collector.checkThat(1, equalTo(2));
    //     collector.checkThat("c", equalTo("d"));
    // }
    
}