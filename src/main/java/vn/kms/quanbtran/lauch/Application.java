package vn.kms.quanbtran.lauch;

import vn.kms.quanbtran.process.ReportProcess;
import vn.kms.quanbtran.process.StreamReportProcess;
import vn.kms.quanbtran.service.ServiceType;

public class Application {

    public static void main(String[] args) {
        ReportProcess process = new StreamReportProcess();
        process.open("data\\contacts.tsv");
        process.extract();
        process.setReportService(ServiceType.VALID_CONTACTS);
        process.exportStatistic("output");
        process.setReportService(ServiceType.INVALID_CONTACTS);
        process.exportStatistic("output");
    }
}
