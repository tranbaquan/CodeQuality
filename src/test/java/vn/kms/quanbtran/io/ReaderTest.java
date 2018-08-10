package vn.kms.quanbtran.io;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ReaderTest {

    private Reader reader;

    @Before
    public void setUp() {
        this.reader = new Reader();
        reader.openStream("data\\contacts.tsv");
    }

    @Test
    public void readLine() {
        reader.readLine();
    }

    @After
    public void tearDown() {
        reader.closeStream();
    }
}