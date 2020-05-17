package com.abastest.abasjr.booksTests;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.containsString;

import org.junit.jupiter.api.Test;

public class HamcrestAssert {

    //Hamcrest merupakan salah satu dari Third-party assertion libraries, ada AssertJ dan Truth jg
   @Test
   void assertWithHamcrestMatcher(){
       // assertThat(actual, matcher);
       assertThat(2 + 1, equalTo(3));
       assertThat("Foo", notNullValue());
       assertThat("Hello World", containsString("World"));
   }
}