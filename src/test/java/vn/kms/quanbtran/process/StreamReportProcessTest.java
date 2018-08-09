package vn.kms.quanbtran.process;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StreamReportProcessTest {

    private StreamReportProcess streamReportProcess;


    @Before
    public void setUp() {
        streamReportProcess = new StreamReportProcess();
        streamReportProcess.open("data\\contacts.tsv");
    }

    @After
    public void tearDown() {
        streamReportProcess.close();
    }

    @Test
    public void exportStatistic() {
    }

    @Test
    public void extract() {
        streamReportProcess.extract();
        System.out.println(streamReportProcess.getData());
    }

    @Test
    public void getReportService() {
    }

    @Test
    public void getLines() {
    }

    @Test
    public void getData() {
    }
}