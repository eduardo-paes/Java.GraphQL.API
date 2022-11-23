package api.presentation.exception;

public class DuplicateEntryException extends RuntimeException {
    public DuplicateEntryException(Throwable cause) {
        super(cause);
    }
}
