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

public class InvalidContactsReport extends ReportServiceAbstract implements ReportService {

    public static final String FILE_NAME = "invalid-contacts-detail.tab";

    @Override
    public void report(List<Contact> data, String destFile) {
        ReportWriter reportWriter = new ReportWriter();
        Writer writer = reportWriter.openFile(destFile, FILE_NAME);

        try {
            writer.write("contact_id\terror_field\terror_message\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Contact contact : data) {
            Set<ConstraintViolation<Contact>> log = validate(contact);

            log.stream().forEach(error -> {
                StringBuilder s = new StringBuilder();
                s.append(contact.getId());
                s.append("\t");
                s.append(error.getPropertyPath());
                s.append("\t");
                s.append(error.getMessage());
                s.append("\n");
                try {
                    writer.write(s.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

        }

        try {
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
