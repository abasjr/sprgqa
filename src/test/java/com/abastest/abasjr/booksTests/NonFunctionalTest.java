package com.abastest.abasjr.booksTests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("non-functional")
public class NonFunctionalTest {

    @Test
    @Tag("performance")
    @Tag("load")
    void performanceTest() {
        System.out.println("Non-Functional Test 1 (Performance/Load)");
    }

    @Test
    @Tag("performance")
    @Tag("stress")
    void stressTest() {
        System.out.println("Non-Functional Test 2 (Performance/Stress)");
    }

    @Test
    @Tag("security")
    void securityTest() {
        System.out.println("Non-Functional Test 3 (Security)");
    }

    @Test
    @Tag("usability")
    void usabilityTest() {
        System.out.println("Non-Functional Test 4 (Usability)");
    }
}