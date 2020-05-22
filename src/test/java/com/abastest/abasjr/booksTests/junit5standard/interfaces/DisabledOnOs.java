package com.abastest.abasjr.booksTests.junit5standard.interfaces;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.abastest.abasjr.booksTests.junit5standard.ConditionalTestExecution;
import com.abastest.abasjr.booksTests.junit5standard.conditionalexecution.OsCondition;

import org.junit.jupiter.api.extension.ExtendWith;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@ExtendWith(OsCondition.class)
public @interface DisabledOnOs {
    ConditionalTestExecution[] value();
}