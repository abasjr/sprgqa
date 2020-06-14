package com.abastest.abasjr.booksTests.advancedFeatures.dependencyInjection;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class RepetitionInfoTest {
   
    @RepeatedTest(3)
    void test(RepetitionInfo repetitionInfo){
        System.out.println("** Test " 
        + repetitionInfo.getCurrentRepetition() 
        + "/" + repetitionInfo.getTotalRepetitions());
        // ** Test 1/3
        // ** Test 2/3
        // ** Test 3/3
    }
}