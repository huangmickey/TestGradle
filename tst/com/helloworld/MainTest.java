package com.helloworld;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MainTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeAll
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterAll
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    void main_says_hello_my_name_is() {
        Main.main(new String[]{});
        assertTrue(outContent.toString().contains("Hello my name is"));
    }

    @Test
    void main_contains_name() {
        Main.main(new String[]{});
        assertTrue(outContent.toString().contains("Hello my name is"));
        assertTrue(outContent.toString().length() > ("Hello my name is").length());
    }

    @Test
    void main_contains_enthusiasm() {
        Main.main(new String[]{});
        assertTrue('!' == outContent.toString().charAt(outContent.toString().length()-2) ||
                '!' == outContent.toString().charAt(outContent.toString().length()-1));
    }


}