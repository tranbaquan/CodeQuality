package vn.kms.quanbtran.process;

import lombok.Getter;

import vn.kms.quanbtran.ioreader.Reader;
import vn.kms.quanbtran.service.ReportService;
import vn.kms.quanbtran.service.ServiceType;
import vn.kms.quanbtran.service.factory.ReportFactory;

import java.util.List;

public class ReaderReportProcess implements ReportProcess{

    private Reader reader;
    @Getter
    private ReportService reportService;
    @Getter
    private List<String> data;


    public void open(String sourceFile) {
        reader = new Reader();
        reader.openStream(sourceFile);
    }

    public void setReportService(ServiceType serviceType) {
        ReportFactory reportFactory = new ReportFactory();
        this.reportService = reportFactory.create(serviceType);
    }

    public void close() {
        reader.closeStream();
    }

    @Override
    public void exportStatistic() {

    }

    @Override
    public void extract() {
        reader.readLine();
        String line;
        while ((line = reader.readLine()) != null){
            data.add(line);
        }
    }
}
