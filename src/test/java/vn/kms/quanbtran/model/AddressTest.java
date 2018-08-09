package vn.kms.quanbtran.model;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class AddressTest {

    private Address address;

    @Before
    public void setUp(){

        this.address = new Address("Thu Duc","Ho Chi Minh " ,"Viet Nam","VN","60000");

    }

    @Test
    public void testGetAddressInfo_shouldBeSuccessful(){

        assertEquals(this.address.getAddressDetail(),"Thu Duc");
        assertEquals(this.address.getCity(),"Ho Chi Minh ");
        assertEquals(this.address.getCountry(),"Viet Nam");
        assertEquals(this.address.getState(),"VN");
        assertEquals(this.address.getZipCode(),"60000");

    }

}