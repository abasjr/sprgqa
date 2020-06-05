package com.abastest.abasjr.booksTests;
import com.abastest.abasjr.books.Demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class DemoTest {
    
    // Is Triagel 
    @Test
    public void testIsTriangel1(){
        assertTrue(Demo.isTriangle(3,4,5));
    }

    @Test
    public void testIsTriangel2(){
        assertTrue(Demo.isTriangle(5,4,8.2d));
    }
    
    @Test
    public void testIsTriangel3(){
        assertTrue(Demo.isTriangle(30.1,21,40));
    }

    @Test
    public void testEqualTrue(){
        assertEquals(true, Demo.isTriangle(123, 320, 231));
    }

    // Not Triangle
    @Test
    public void testIsNotTriange1(){
        assertFalse(Demo.isTriangle(6,1,5));
    }

    @Test
    public void testIsNotTriange2(){
        assertFalse(Demo.isTriangle(6,1,-5));
    }

    @Test
    public void testIsNotTriange3(){
        assertFalse(Demo.isTriangle(8,22,4.7f));
    }    
    
    @Test
    public void testIsNotTriange4(){
        assertFalse(Demo.isTriangle(9,17.1d,5.2));
    }

    // Main Program Test
    @Test
    public void testMainProgramTriange1(){

        String input = "19\n10\n14\n";
        
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        
        // Invoke
        String[] args = {};
        Demo.main(args);

        // Expected Output
        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }


    @Test
    public void testMainProgramTriangel2() {

        String input = "4\n5\n20\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Invoke
        String[] args = {};
        Demo.main(args);

        // Expected Output
        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }
    
    @Test
    public void testMainProgramTriangel3() {

        String input = "-4\n5\n20\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Invoke
        String[] args = {};
        Demo.main(args);

        // Expected Output
        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }
}