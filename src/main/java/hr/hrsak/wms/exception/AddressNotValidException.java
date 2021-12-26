package hr.hrsak.wms.exception;

public class AddressNotValidException extends  RuntimeException{
    public AddressNotValidException(String message) {
        super(message);
    }
}
