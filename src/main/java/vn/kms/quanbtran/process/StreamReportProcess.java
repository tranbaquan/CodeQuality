package vn.kms.quanbtran.process;

import lombok.Getter;

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

public class StreamReportProcess implements ReportProcess {

    @Getter
    private ReportService reportService;
    @Getter
    private Stream<String> lines;
    @Getter
    private List<String> data;

    @Override
    public void open(String sourceFile) {
        try {
            lines = Files.lines(Paths.get(sourceFile), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setReportService(ServiceType serviceType) {
        ReportFactory reportFactory = new ReportFactory();
        this.reportService = reportFactory.create(serviceType);
    }

    @Override
    public void close() {
        lines.close();
    }

    @Override
    public void exportStatistic() {
        reportService.report();
    }


    @Override
    public void extract() {
        data = lines.collect(Collectors.toList());
        data.remove(0);
    }
}
