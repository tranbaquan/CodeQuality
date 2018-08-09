package vn.kms.quanbtran.service.factory;

import vn.kms.quanbtran.service.ReportService;
import vn.kms.quanbtran.service.ServiceType;

public class ReportFactory {

    public ReportService create(ServiceType serviceType) {

        switch (serviceType) {
            case VALID_CONTACTS:
                break;
            case INVALID_CONTACTS:
                break;
            case CONTACTS_PER_STATES:
                break;
            case CONTACTS_PER_AGE_GROUPS:
                break;
            case INVALID_CONTACTS_PER_COLUMN_NAME:
                break;
            default:
                break;
        }

        return null;

    }

}
