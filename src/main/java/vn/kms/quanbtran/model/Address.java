package vn.kms.quanbtran.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Address {

    @Size(max = 20)
    @NotEmpty
    private String addressDetail;
    @Size(max = 20)
    @NotEmpty
    private String city;
    @Size(max = 20)
    @NotEmpty
    private String country;
    @Size(min = 2, max = 2)
    private String state;
    @NotEmpty
    private String zipCode;

}
