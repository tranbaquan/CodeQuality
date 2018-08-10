package vn.kms.quanbtran.process.convert;

import vn.kms.quanbtran.model.Address;
import vn.kms.quanbtran.model.Contact;
import vn.kms.quanbtran.model.PhoneList;

import java.util.ArrayList;
import java.util.List;

public class ConvertToContact {

    public List<Contact> convert(List<String> data) {

        List<Contact> res = new ArrayList<>();
        for (String line : data) {
            String[] extraction = line.split("\t");

            if (extraction.length != 14) {
                continue;
            }

            Contact contact = new Contact();
            contact.setId(Integer.parseInt(extraction[0]));
            contact.setFirstName(extraction[1]);
            contact.setLastName(extraction[2]);
            contact.setCompanyName(extraction[3]);
            contact.setDateOfBirth(extraction[4]);
            Address address = new Address(extraction[5], extraction[6], extraction[7], extraction[8], extraction[9]);
            contact.setAddress(address);
            PhoneList phoneList = new PhoneList();
            phoneList.add(extraction[10]);
            phoneList.add(extraction[11]);
            contact.setMobilePhone(phoneList);
            contact.setEmail(extraction[12]);
            contact.setWeb(extraction[13]);

            res.add(contact);
        }
        return res;
    }

}
