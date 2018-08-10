package vn.kms.quanbtran.service;

import vn.kms.quanbtran.model.Contact;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public abstract class ReportServiceAbstract implements ReportService {

    private ValidatorFactory factory;
    private Validator validator;

    public ReportServiceAbstract() {
        factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    public Set<ConstraintViolation<Contact>> validate(Contact contact){
        return validator.validate(contact);
    }

}
