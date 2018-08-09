package vn.kms.quanbtran.service.factory;

import vn.kms.quanbtran.service.ReportService;
import vn.kms.quanbtran.service.ServiceType;
import vn.kms.quanbtran.service.impl.*;

public class ReportFactory {

    public ReportService create(ServiceType serviceType) {
        switch (serviceType) {
            case VALID_CONTACTS:
                return  new ValidContactsReport();
            case INVALID_CONTACTS:
                return new InvalidContactsReport();
            case CONTACTS_PER_STATES:
                return  new ContactsPerStatesReport();
            case CONTACTS_PER_AGE_GROUPS:
                return new ContactsPerAgeGroupsReport();
            case INVALID_CONTACTS_PER_COLUMN_NAME:
                return new InvalidContactsPerColumnNameReport();
            default:
                return  new ValidContactsReport();
        }
    }

}
