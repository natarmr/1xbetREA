package kotlin.jvm.internal;

import a.b1j;
import a.kng0;
import a.ohs0;
import a.x7t0;
import android.gov.nist.core.Separators;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class Intrinsics {
    public static boolean a(double d, Double d2) {
        return d2 != null && d == d2.doubleValue();
    }

    public static boolean b(float f, Float f2) {
        return f2 != null && f2.floatValue() == f;
    }

    public static boolean c(Double d, double d2) {
        return d != null && d.doubleValue() == d2;
    }

    public static void checkNotNull(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        g(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void checkNotNullExpressionValue(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(ohs0.n(str, " must not be null"));
        g(nullPointerException, Intrinsics.class.getName());
        throw nullPointerException;
    }

    public static void checkNotNullParameter(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = Intrinsics.class.getName();
            int i = 0;
            while (!stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            while (stackTrace[i].getClassName().equals(name)) {
                i++;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            StringBuilder sbN = b1j.n("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), Separators.DOT, stackTraceElement.getMethodName(), ", parameter ");
            sbN.append(str);
            NullPointerException nullPointerException = new NullPointerException(sbN.toString());
            g(nullPointerException, Intrinsics.class.getName());
            throw nullPointerException;
        }
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int e(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int f(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static void g(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static void h(String str) {
        x7t0 x7t0Var = new x7t0(kng0.l("lateinit property ", str, " has not been initialized"));
        g(x7t0Var, Intrinsics.class.getName());
        throw x7t0Var;
    }
}
