package vn.kms.quanbtran.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Contact {

    private int id;
    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;
    @NotEmpty
    private String dateOfBirth;
    @Size(max = 20)
    @NotEmpty
    private String companyName;
    @NotNull
    private Address address;
    @NotNull
    private PhoneList mobilePhone;
    @Email
    private String email;
    @NotEmpty
    private String web;

}
