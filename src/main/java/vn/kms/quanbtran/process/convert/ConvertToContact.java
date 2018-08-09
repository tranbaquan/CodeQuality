package vn.kms.quanbtran.process.convert;

import vn.kms.quanbtran.model.Contact;

import java.lang.reflect.Field;
import java.util.List;

public class ConvertToContact {

    public void convert(List<String> data) {
        Contact contact = new Contact();
        Class contactClass = contact.getClass();
        Field[] fields = contactClass.getFields();
        System.out.println(fields.length);
        for (int i = 0; i < fields.length; i++){
            System.out.println(fields[i].toString());
        }

//        return Contact;
    }

    public static void main(String[] args) {
        ConvertToContact convertToContact = new ConvertToContact();
        convertToContact.convert(null);
    }

}
