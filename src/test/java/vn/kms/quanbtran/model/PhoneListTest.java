package vn.kms.quanbtran.model;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class PhoneListTest {

    private PhoneList phoneList;

    @Before
    public void setUp(){
        this.phoneList = new PhoneList();
    }

    @Test
    public void testAddPhoneNumber_shouldBeSuccessful(){
        this.phoneList.add("132-123-132");
        assertEquals(this.phoneList.getPhoneNumbers().size(), 1);

    }
}