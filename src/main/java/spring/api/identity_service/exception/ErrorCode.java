package spring.api.identity_service.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(499, "Uncategorized exception"),
    INVALID_KEY(1001, "Invalid key"),
    USER_ALREADY_EXISTS(1002, "User already exists"),
    USER_NOT_EXISTED(1005, "User not existed"),
    USERNAME_INVALID(1003, "Username must be at least 3 characters"),
    PASSWORD_INVALID(1004, "Password must be at least 6 characters"),
    ;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
