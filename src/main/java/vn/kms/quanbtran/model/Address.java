package vn.kms.quanbtran.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vn.kms.quanbtran.model.commontext.ErrorMessage;
import vn.kms.quanbtran.model.commontext.ValidatorCondition;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Address {

    @Size(max = ValidatorCondition.MAX_LENGTH)
    @NotEmpty(message = ErrorMessage.EMPTY)
    private String addressDetail;
    @Size(max = ValidatorCondition.MAX_LENGTH)
    @NotEmpty(message = ErrorMessage.EMPTY)
    private String city;
    @Size(max = ValidatorCondition.MAX_LENGTH)
    @NotEmpty
    private String country;
    @Size(min = ValidatorCondition.FIX_LENGTH, max = ValidatorCondition.FIX_LENGTH)
    @NotEmpty(message = ErrorMessage.EMPTY)
    private String state;
    @NotEmpty(message = ErrorMessage.EMPTY)
    private String zipCode;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(addressDetail);
        stringBuilder.append("\t");
        stringBuilder.append(city);
        stringBuilder.append("\t");
        stringBuilder.append(country);
        stringBuilder.append("\t");
        stringBuilder.append(state);
        stringBuilder.append("\t");
        stringBuilder.append(zipCode);
        return stringBuilder.toString();
    }
}
