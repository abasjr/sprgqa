package com.abastest.abasjr.booksTests.advancedFeatures;

import java.util.Arrays;
import java.util.Collection;

// import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DynamicParamTest {
    
    @Parameter(0)
    public Integer input1;

    @Parameter(1)
    public String input2;

    @Parameters(name = "My Test #{index} -- input data: {0} and {1}")
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][] { { 1, "hello" }, { 2, "goodbye" } });
    }

    @org.junit.Test
    public void test1(){
        System.out.println(input1 + " " + input2);
    }
}