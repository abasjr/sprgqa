package com.abastest.abasjr.booksTests.junit5standard;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test dengan memunculkan display name")
public class DisplayNameTests {
    
    @Test
    @DisplayName("Test display pada method, mengandung space")
    void testWithDisplayNameContainingSpace(){

    }

    @Test
    @DisplayName("(╯°Д°)╯")
    void testWithDisplayNameContainingSpecialCharacters(){
    }

}