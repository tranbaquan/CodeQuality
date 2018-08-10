package vn.kms.quanbtran.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vn.kms.quanbtran.model.commontext.ErrorMessage;
import vn.kms.quanbtran.model.commontext.ValidatorCondition;

import javax.validation.constraints.*;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Contact {
    @PositiveOrZero
    private int id;
    @NotEmpty(message = ErrorMessage.EMPTY)
    @Size(max = ValidatorCondition.MAX_LENGTH, message =  ErrorMessage.OUT_OF_LENGTH)
    private String firstName;
    @NotEmpty(message = ErrorMessage.EMPTY)
    private String lastName;
    @NotEmpty(message = ErrorMessage.EMPTY)
    @Pattern(regexp = ValidatorCondition.DATE_REGEXP, message = ErrorMessage.INVALID_FORMAT)
    private String dateOfBirth;
    @Size(max = ValidatorCondition.MAX_LENGTH)
    @NotEmpty(message = ErrorMessage.EMPTY)
    private String companyName;
    @NotNull
    private Address address;
    @NotNull
    private PhoneList mobilePhone;
    @Email(message = ErrorMessage.INVALID_MAIL)
    @NotEmpty(message = ErrorMessage.EMPTY)
    private String email;
    @NotEmpty(message = ErrorMessage.EMPTY)
    private String web;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(id);
        stringBuilder.append("\t");
        stringBuilder.append(firstName);
        stringBuilder.append("\t");
        stringBuilder.append(lastName);
        stringBuilder.append("\t");
        stringBuilder.append(dateOfBirth);
        stringBuilder.append("\t");
        stringBuilder.append(companyName);
        stringBuilder.append("\t");
        stringBuilder.append(address);
        stringBuilder.append("\t");
        stringBuilder.append(mobilePhone);
        stringBuilder.append("\t");
        stringBuilder.append(email);
        stringBuilder.append("\t");
        stringBuilder.append(web);
        return stringBuilder.toString();
    }
}
