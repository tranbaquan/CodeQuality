package vn.kms.quanbtran.process;

import lombok.Getter;
import lombok.Setter;
import vn.kms.quanbtran.ioreader.Reader;
import vn.kms.quanbtran.service.ReportService;
import vn.kms.quanbtran.service.ServiceType;
import vn.kms.quanbtran.service.factory.ReportFactory;

public class ReportProcess {

    private Reader reader;
    @Getter
    private ReportService reportService;

    public void open(String sourceFile){
        reader.openStream(sourceFile);
    }

    public void setReportService(ServiceType serviceType){
        ReportFactory reportFactory = new ReportFactory();
        this.reportService = reportFactory.create(serviceType);
    }

}
