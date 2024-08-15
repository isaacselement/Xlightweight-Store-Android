package com.tesla.modules.store.util;

import android.os.Build;

import java.util.function.Function;

public class CallUtil {

    public static String safeApply(Function<String, String> function, String key) {
        if (function == null) {
            return key;
        }
        // TODO ... Do not support encrypted/decrypted/transform key/value before Android N
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return function.apply(key);
        }
        return key;
    }

}
