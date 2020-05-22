package com.abastest.abasjr.booksTests.junit5standard;

public enum ConditionalTestExecution {
    WINDOWS, MAC, LINUX, OTHER;

    public static ConditionalTestExecution determine(){
        ConditionalTestExecution os = OTHER;
        String myOs = System.getProperty("os.name").toLowerCase();

        if (myOs.contains("win")) {
            os = WINDOWS;
        }
        else if (myOs.contains("mac")){
            os = MAC;
        }
        else if (myOs.contains("nux")){
            os = LINUX;
        }
        return os;
        
    }
}