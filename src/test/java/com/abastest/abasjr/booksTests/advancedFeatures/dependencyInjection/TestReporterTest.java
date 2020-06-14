package com.abastest.abasjr.booksTests.advancedFeatures.dependencyInjection;

import java.util.HashMap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

public class TestReporterTest {
    @Test
    void reportSingleValue(TestReporter testReporter){
        testReporter.publishEntry("key", "value");
        // TestIdentifier [reportSingleValue(TestReporter)]
        // ReportEntry [timestamp = 2020-06-12T16:56:53.534, key = 'value']
    }

    @Test
    void reportSeveralValue(TestReporter testReporter){
        HashMap<String, String> values = new HashMap<>();
        values.put("name", "abas");
        values.put("surname", "baskoro");
        testReporter.publishEntry(values);
        // TestIdentifier [reportSeveralValue(TestReporter)]
        // ReportEntry [timestamp = 2020-06-12T16:56:53.555, surname = 'baskoro', name = 'abas']
    }
    
}