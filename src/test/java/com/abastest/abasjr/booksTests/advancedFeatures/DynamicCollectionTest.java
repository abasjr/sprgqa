package com.abastest.abasjr.booksTests.advancedFeatures;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicCollectionTest {

    // Perhatian: this test will raise an exception
    @TestFactory
    List<String> dynamicTestWithInvalidReturnType(){
        return Arrays.asList("Hello Abas");
    }

    @TestFactory
    Collection<DynamicTest> dynamicTestsFromCollection(){
        return Arrays.asList(
            dynamicTest("1st dynamic Test", () -> assertTrue(true)),
            dynamicTest("2nd dynamic Test", () -> assertEquals(4, 2*2))
        );
    }
}