package vn.kms.quanbtran.service.impl;

import vn.kms.quanbtran.io.ReportWriter;
import vn.kms.quanbtran.model.Contact;
import vn.kms.quanbtran.service.ReportService;
import vn.kms.quanbtran.service.ReportServiceAbstract;

import javax.validation.ConstraintViolation;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ValidContactsReport extends ReportServiceAbstract implements ReportService {

    public static final String FILE_NAME = "valid-contacts.tab";

    @Override
    public void report(List<Contact> data, String destFile) {
        List<Contact> filter = new ArrayList<>();

        ReportWriter reportWriter = new ReportWriter();
        Writer writer = reportWriter.openFile(destFile, FILE_NAME);

        for (Contact contact : data) {
            Set<ConstraintViolation<Contact>> log = validate(contact);
            if (log.size() == 0) {
                filter.add(contact);
            }
        }

        try {
            writer.write("id\tfirst_name\tlast_name\tday_of_birth\taddress\tcity\tstate\tzip_code\tmobile_phone\temail\n");
            for (Contact contact : filter) {
                writer.write(contact + "\n");
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
