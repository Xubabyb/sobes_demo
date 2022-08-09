package my.home.demo.controller.util;

import javax.validation.ConstraintViolationException;

public class ApiValidationUtils {
    public static void requireNotNull(Object o, String errorMessage) {
        if (o == null) {
            throw new ConstraintViolationException(errorMessage, null);
        }
    }

    public static void requireTrue(boolean val, String errorMessage) {
        if (!val) {
            throw new ConstraintViolationException(errorMessage, null);
        }
    }

    public static void requireFalse(boolean val, String errorMessage) {
        if (val) {
            throw new ConstraintViolationException(errorMessage, null);
        }
    }


}
