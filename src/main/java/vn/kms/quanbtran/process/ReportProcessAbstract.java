package vn.kms.quanbtran.process;

import lombok.Getter;
import vn.kms.quanbtran.model.Contact;
import vn.kms.quanbtran.process.convert.ConvertToContact;
import vn.kms.quanbtran.service.ReportService;
import vn.kms.quanbtran.service.ServiceType;
import vn.kms.quanbtran.service.factory.ReportFactory;

import java.util.List;

public abstract class ReportProcessAbstract implements ReportProcess {

    @Getter
    protected ReportService reportService;
    @Getter
    protected List<String> data;
    @Getter
    protected List<Contact> output;

    private ConvertToContact converter;

    @Override
    public void setReportService(ServiceType serviceType) {
        ReportFactory reportFactory = new ReportFactory();
        this.reportService = reportFactory.create(serviceType);
    }

    @Override
    public void exportStatistic(String destFolder) {
        convert();
        reportService.report(output, destFolder);
    }

    public void convert(){
        converter = new ConvertToContact();
        output = converter.convert(data);
    }
}
