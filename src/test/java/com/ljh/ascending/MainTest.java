package com.ljh.ascending;

import com.ljh.ascending.process.AscendingProcess;
import com.ljh.ascending.process.SplitProcess;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    private SplitProcess splitProcess;

    @Before
    public void setUp() {
        splitProcess = new SplitProcess();
    }


    @Test
    public void splitTest() {
        String sampleInput = "821ane";
        assertTrue(splitProcess.stringSplit(sampleInput));

        String sampleInput2 = "enj324$#";
        assertFalse(splitProcess.stringSplit(sampleInput2));
    }

    @Test
    public void ascendingTest() {
        String sampleInput = "821ane";
        splitProcess.stringSplit(sampleInput);
        String result = AscendingProcess.getAscendingResult(splitProcess.getAlphabetList(), splitProcess.getNumberList());
        assertEquals("a1e2n8", result);
    }

    @Test
    public void ascendingTest2() {
        String sampleInput = "821";
        splitProcess.stringSplit(sampleInput);
        String result = AscendingProcess.getAscendingResult(splitProcess.getAlphabetList(), splitProcess.getNumberList());
        assertEquals("128", result);
    }

    @Test
    public void ascendingTest3() {
        String sampleInput = "nbw";
        splitProcess.stringSplit(sampleInput);
        String result = AscendingProcess.getAscendingResult(splitProcess.getAlphabetList(), splitProcess.getNumberList());
        assertEquals("bnw", result);
    }
}