package vn.kms.quanbtran.service.factory;

import org.junit.Before;
import org.junit.Test;
import vn.kms.quanbtran.service.ServiceType;
import vn.kms.quanbtran.service.impl.InvalidContactsReport;
import vn.kms.quanbtran.service.impl.ValidContactsReport;

import static org.junit.Assert.*;

public class ReportFactoryTest {

    private ReportFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = new ReportFactory();
    }

    @Test
    public void create() {
        assertTrue(factory.create(ServiceType.VALID_CONTACTS) instanceof ValidContactsReport);
        assertFalse(factory.create(ServiceType.VALID_CONTACTS) instanceof InvalidContactsReport);
    }
}