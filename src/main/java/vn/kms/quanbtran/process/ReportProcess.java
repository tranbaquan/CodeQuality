package vn.kms.quanbtran.process;

import vn.kms.quanbtran.service.ServiceType;

public interface ReportProcess {

    void open(String sourceFile);

    void setReportService(ServiceType serviceType);

    void close();

    void exportStatistic(String destFolder);

    void extract();

}
