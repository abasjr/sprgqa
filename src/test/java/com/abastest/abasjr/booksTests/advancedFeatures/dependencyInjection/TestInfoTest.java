package com.abastest.abasjr.booksTests.advancedFeatures.dependencyInjection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class TestInfoTest {
   
    @BeforeEach
    void init(TestInfo testInfo){
        String displayName = testInfo.getDisplayName();
        System.out.printf("@BeforeEach %s %n", displayName); // @BeforeEach My Test Name
    }

    @Test
    @DisplayName("My Test Name")
    @Tag("my-Tag")
    void testOne(TestInfo testInfo){
        System.out.println(testInfo.getDisplayName()); // My Test Name
        System.out.println(testInfo.getTags()); // [my-Tag]
        System.out.println(testInfo.getClass()); // class org.junit.jupiter.engine.extension.TestInfoParameterResolver$DefaultTestInfo
        System.out.println(testInfo.getTestClass()); // Optional[class com.abastest.abasjr.booksTests.advancedFeatures.dependencyInjection.TestInfoTest]
        System.out.println(testInfo.getTestMethod()); // Optional[void com.abastest.abasjr.booksTests.advancedFeatures.dependencyInjection.TestInfoTest.testOne(org.junit.jupiter.api.TestInfo)]
    }

    @Test
    void testTwo(){
        // @BeforeEach testTwo()
    }
}