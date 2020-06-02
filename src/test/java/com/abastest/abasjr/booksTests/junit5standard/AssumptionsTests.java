package com.abastest.abasjr.booksTests.junit5standard;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Test;

public class AssumptionsTests {

    @Test
    void assumeTrueTest() { // TestAbortedException:
        assumeTrue(false); // Assumption failed: assumption is not true
        fail("Test 1 Gagal"); // ini ga di proses karena line 14 ga memenuhi asumsi
    }

    @Test
    void assumeFalseTest(){ // TestAbortedException:
        assumeFalse(this::getTrue); // Assumption failed: assumption is not false
        fail("Test 2 Gagal");
    }
    
    private boolean getTrue(){
        return true;
    }

    @Test
    void assumingThatTest(){
        assumingThat(false, ()-> fail("Test 3 Gagal"));
    }
}