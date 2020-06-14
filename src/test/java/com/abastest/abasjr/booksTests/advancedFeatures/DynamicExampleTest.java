package com.abastest.abasjr.booksTests.advancedFeatures;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicExampleTest {
    // Ada kemungkinan lain untuk membuat tes dinamis di JUnit 5, menggunakan static method stream kelas DynamicTest.
    // This method needs an input generator, fungsi yang menghasilkan nama tampilan berdasarkan nilai input, dan test executor
    @TestFactory
    Stream<DynamicTest> dynamicTestsFromStream() {
        Stream<String> inpuStream = Stream.of("A", "B", "C", "D");
        return inpuStream.map(
            input -> dynamicTest("Display name for input" + input, 
            () -> {
                System.out.println("Testing " + input);
            }
            )
        );
    }
}