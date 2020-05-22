package com.abastest.abasjr.booksTests.junit5standard;

import com.abastest.abasjr.booksTests.junit5standard.interfaces.DisabledOnOs;

import org.junit.jupiter.api.Test;

import static com.abastest.abasjr.booksTests.junit5standard.ConditionalTestExecution.MAC;
import static com.abastest.abasjr.booksTests.junit5standard.ConditionalTestExecution.LINUX;;

public class DisabledOnOsTest {

    @DisabledOnOs({ MAC, LINUX })
    @Test
    void conditionalTest() {
        System.out.println("This test will be disabled on MAC and LINUX");
    }

}