package user_service.exeptions;

// TODO Сделай ExceptionHandler, чтобы прокидывать клиентам значимые коды ошибок
public class DataValidationException extends RuntimeException {
    public DataValidationException(String message) {
        super(message);
    }
}
