package com.abastest.abasjr.booksTests.junit5standard.conditionalexecution;

import org.junit.jupiter.api.extension.ExecutionCondition;

import java.lang.reflect.AnnotatedElement;
import java.util.Arrays;
import java.util.Optional;

import com.abastest.abasjr.booksTests.junit5standard.ConditionalTestExecution;

import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.platform.commons.util.AnnotationUtils;

public class OsCondition implements ExecutionCondition{
   
    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
        Optional<AnnotatedElement> element = context.getElement();
        ConditionEvaluationResult os = ConditionEvaluationResult.enabled("@DisabledOnOs is not present");

        Optional<DisabledOnOs> disabledOnOs = AnnotationUtils.findAnnotation(element, DisabledOnOs.class);

        if (disabledOnOs.isPresent()) {
            ConditionalTestExecution myOs = ConditionalTestExecution.determine();
            if (Arrays.asList(disabledOnOs.get().value()).contains(myOs)) {
                os = ConditionEvaluationResult.disabled("Test is disabled on " + myOs);
            }
            else {
                os = ConditionEvaluationResult.enabled("Test is not disabled on " + myOs);
            }
        }
        System.out.println("-->" + os.getReason().get());
        return os;
    }
}