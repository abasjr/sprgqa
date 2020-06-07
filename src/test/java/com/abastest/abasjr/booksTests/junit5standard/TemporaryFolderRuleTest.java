package com.abastest.abasjr.booksTests.junit5standard;

import java.io.IOException;

import org.junit.Rule;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
import org.junit.jupiter.migrationsupport.rules.EnableRuleMigrationSupport;
import org.junit.rules.TemporaryFolder;

@EnableRuleMigrationSupport
public class TemporaryFolderRuleTest {

    @Rule
    TemporaryFolder temporaryFolder = new TemporaryFolder();

    @BeforeEach
    void setup() throws IOException {
        temporaryFolder.create();
    }

    // Error java.lang.AbstractMethodError

    // @Test
    // void test() {
    //     System.out.println("Temporary folder: " + temporaryFolder.getRoot());
    // }

    @AfterEach
    void teardown() {
        temporaryFolder.delete();
    }
}