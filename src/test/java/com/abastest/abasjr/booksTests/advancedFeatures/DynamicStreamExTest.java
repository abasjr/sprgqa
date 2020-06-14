package com.abastest.abasjr.booksTests.advancedFeatures;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Function;
import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.ThrowingConsumer;

public class DynamicStreamExTest {

    // Another example, 
    // 1. Create test factory
    // 2. Menyediakan data input sebagai Iterator
    // 3. Display name function using a lambda expression
    // 4. Finally, test executor implemented with another lambda expression

    // Create example test check Integer input is odd or even

    @TestFactory
    Stream<DynamicTest> streamTest(){
        // Input Data
        // Integer arrayKu[] = {1,2,3}; // Fail
        Integer arrayKu[] = {2,4,6}; // Success, Even number
        Iterator<Integer> inputGenerator = Arrays.asList(arrayKu).iterator();

        // Display names
        Function<Integer, String> displayNameGenerator = (inputGue) -> "Data input: " + inputGue;

        // Test Executor
        ThrowingConsumer<Integer> testExecutor = (inputGue) -> {
            System.out.println(inputGue);
            assertTrue(inputGue % 2 == 0);
        };

        // Returns a stream of dynamic data
        return stream(inputGenerator, displayNameGenerator, testExecutor);
    }
    
}