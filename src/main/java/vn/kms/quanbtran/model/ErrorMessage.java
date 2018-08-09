package vn.kms.quanbtran.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ErrorMessage {

    NOT_EMPTY("not be empty"),
    OUT_OF_LENGTH("length not be greater ");

    @Getter
    private final String message;

}
