package vn.kms.quanbtran.service.impl;

import vn.kms.quanbtran.io.ReportWriter;
import vn.kms.quanbtran.model.Contact;
import vn.kms.quanbtran.service.ReportService;
import vn.kms.quanbtran.service.ReportServiceAbstract;

import javax.validation.ConstraintViolation;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class InvalidContactsPerColumnNameReport extends ReportServiceAbstract implements ReportService {

    public static final String FILE_NAME = "invalid-contacts-summary.tab";

    @Override
    public void report(List<Contact> data, String destFile) {
        SortedMap<String, Integer> filter = new TreeMap<>();

        ReportWriter reportWriter = new ReportWriter();
        Writer writer = reportWriter.openFile(destFile, FILE_NAME);

        for (Contact contact : data) {
            Set<ConstraintViolation<Contact>> log = validate(contact);
            log.stream().forEach(error -> {
                int value = filter.get(error.getPropertyPath());
                filter.put(error.getPropertyPath().toString(), value + 1);
            });

        }

        try {
            writer.write("contact_id\terror_field\terror_message\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String field: filter.keySet()) {
            StringBuilder s = new StringBuilder();
            s.append(field);
            s.append("\t");
            s.append(filter.get(field));
            s.append("\n");

            try {
                writer.write(s.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
