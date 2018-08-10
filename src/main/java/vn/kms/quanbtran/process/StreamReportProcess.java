package vn.kms.quanbtran.process;

import lombok.Getter;

import java.io.IOException;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamReportProcess extends ReportProcessAbstract implements ReportProcess {

    @Getter
    private Stream<String> lines;


    @Override
    public void open(String sourceFile) {
        try {
            lines = Files.lines(Paths.get(sourceFile), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() {
        lines.close();
    }

    @Override
    public void extract() {
        data = lines.collect(Collectors.toList());
        data.remove(0);
    }


}
