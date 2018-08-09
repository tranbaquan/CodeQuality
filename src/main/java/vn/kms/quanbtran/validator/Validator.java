package vn.kms.quanbtran.validator;

public interface Validator<T> {

    boolean validate(T value);

}
