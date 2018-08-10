package vn.kms.quanbtran.service;

import vn.kms.quanbtran.model.Contact;

import java.util.List;

public interface ReportService {

    void report(List<Contact> data, String destFile);

}
