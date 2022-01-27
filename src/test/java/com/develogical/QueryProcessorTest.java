package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsAboutImperial() throws Exception {
        assertThat(queryProcessor.process("Imperial"),
                containsString("university"));
    }

    @Test
    public void knowsTeamName() throws Exception {
        assertThat(queryProcessor.process("your name"),
                containsString("BW"));
    }

    @Test
    public void knows21() throws Exception {
        assertThat(queryProcessor.process("what is 10 plus 12"),
                containsString("22"));
    }

    @Test
    public void knowsMultiply() throws Exception {
        assertThat(queryProcessor.process("what is 15 multiplied by 2"),
                containsString("30"));
    }

    // @Test
    // public void knowsSquareRoot() throws Exception {
    // assertThat(queryProcessor.process("which of the following numbers is both a
    // square and a cube: 602, 36"),
    // containsString("30"));
    // }

    @Test
    public void knows3() throws Exception {
        assertThat(queryProcessor.process("which of the following numbers is the largest: 23, 99, 756, 59"),
                containsString("756"));
    }

    @Test
    public void knowsMinus() throws Exception {
        assertThat(queryProcessor.process("what is 10 minus 12"),
                containsString("-2"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }
}
