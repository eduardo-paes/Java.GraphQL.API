package api.domain.validation;

public class DomainExceptionValidation extends Exception {
    public DomainExceptionValidation(String error)
    {
        super(error);
    }

    public static void When(boolean hasError, String error) throws DomainExceptionValidation {
        if (hasError)
            throw new DomainExceptionValidation(error);
    }
}
