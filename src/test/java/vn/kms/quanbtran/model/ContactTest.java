package vn.kms.quanbtran.model;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import javax.validation.*;

import java.util.Set;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class ContactTest {

    private Contact contact;
    @Mock
    private Address address;
    @Mock
    private PhoneList phoneList;

    @Before
    public void setUp() {

        this.contact = new Contact(1274, "Quan", "Ba Tran", "11/02/1997", "KMS Technology"
                , address, phoneList, "quanbtran@kms-technology.com", "tranbaquan.com.vn");

    }

    @Test
    public void testGetContactInfo_shouldBeSuccessful() {

        assertEquals(contact.getId(), 1274);
        assertEquals(contact.getFirstName(), "Quan");
        assertEquals(contact.getLastName(), "Ba Tran");
        assertEquals(contact.getDateOfBirth(), "11/02/1997");
        assertEquals(contact.getCompanyName(), "KMS Technology");
        assertEquals(contact.getAddress(), this.address);
        assertEquals(contact.getMobilePhone(), this.phoneList);
        assertEquals(contact.getEmail(), "quanbtran@kms-technology.com");
        assertEquals(contact.getWeb(), "tranbaquan.com.vn");

    }

    @Test
    public void testValidator(){
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Contact>> log = validator.validate(contact);
        for (ConstraintViolation<Contact> violation : log) {
            System.out.println(violation.getMessage());
        }
    }

}