package errorandexceptions.exceptions;

public class EmptyFacultyException extends IllegalArgumentException {
    public EmptyFacultyException() {
    }

    public EmptyFacultyException(String message) {
        super(message);
    }

    public EmptyFacultyException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyFacultyException(Throwable cause) {
        super(cause);
    }
}