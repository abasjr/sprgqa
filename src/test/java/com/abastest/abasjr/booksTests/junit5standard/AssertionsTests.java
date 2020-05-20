package com.abastest.abasjr.booksTests.junit5standard;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.abastest.abasjr.books.Name;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssertionsTests {
   @Test
   @DisplayName("Mencocokkan Nama")
   void groupAssertions(){
       Name myName = new Name("Abas", "Junior");
       assertAll("address", () -> assertEquals("Abas", myName.getFirstName()),
       () -> assertEquals("Junior", myName.getLastName())); // disini disalahkan assert equalsnya

   } 
}