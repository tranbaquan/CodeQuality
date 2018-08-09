package vn.kms.quanbtran.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class PhoneList {

    private List<String> phoneNumbers;

    public PhoneList(){
        this.phoneNumbers = new LinkedList<String>();
    }

    public void add(String phoneNumber){
        this.phoneNumbers.add(phoneNumber);
    }
}
