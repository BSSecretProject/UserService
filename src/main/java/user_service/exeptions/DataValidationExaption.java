package user_service.exeptions;

public class DataValidationExaption extends RuntimeException {
    public DataValidationExaption(String message) {
        super(message);
    }
}
