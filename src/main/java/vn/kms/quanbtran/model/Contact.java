package vn.kms.quanbtran.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Contact {

    private int id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String companyName;
    private Address address;
    private PhoneList mobilePhone;
    private String email;
    private String web;

}
