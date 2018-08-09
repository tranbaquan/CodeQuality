package vn.kms.quanbtran.process;

import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Getter;

import vn.kms.quanbtran.ioreader.Reader;
import vn.kms.quanbtran.service.ReportService;
import vn.kms.quanbtran.service.ServiceType;
import vn.kms.quanbtran.service.factory.ReportFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface ReportProcess {

    void open(String sourceFile);

    void setReportService(ServiceType serviceType);

    void close();

    void exportStatistic();

    void extract();

}
