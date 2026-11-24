package a;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class dnn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f6379a;

    static {
        uen uenVar = wen.b;
        f6379a = ibc.v0(3, bfn.SECONDS);
    }

    public static final Integer a(Object obj, String str) {
        Object g0g0Var;
        Object g0g0Var2;
        Class<?> cls = obj.getClass();
        try {
            e0g0 e0g0Var = j0g0.b;
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            g0g0Var = declaredField.get(obj);
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            g0g0Var = null;
        }
        if (g0g0Var instanceof Number) {
            return Integer.valueOf(((Number) g0g0Var).intValue());
        }
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String strValueOf = String.valueOf(str.charAt(0));
            strValueOf.getClass();
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            sb.append((Object) upperCase);
            sb.append(str.substring(1));
            str = sb.toString();
        }
        try {
            g0g0Var2 = cls.getMethod("get".concat(str), null).invoke(obj, null);
        } catch (Throwable th2) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var2 = new g0g0(th2);
        }
        if (g0g0Var2 instanceof g0g0) {
            g0g0Var2 = null;
        }
        if (g0g0Var2 instanceof Number) {
            return Integer.valueOf(((Number) g0g0Var2).intValue());
        }
        return null;
    }
}
