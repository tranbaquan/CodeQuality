package vn.kms.quanbtran.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Contact {
    @PositiveOrZero
    private int id;
    @NotEmpty(message = "first name " + ErrorMessage.EMPTY)
    @Size(max = 20, message = "first name " + ErrorMessage.OUT_OF_LENGTH)
    private String firstName;
    @NotEmpty(message = "last name " + ErrorMessage.EMPTY)
    private String lastName;
    @NotEmpty(message = "date of birth " + ErrorMessage.EMPTY)
    @Pattern(regexp = "", message = "date of birth " + ErrorMessage.INVALID_FORMAT)
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
