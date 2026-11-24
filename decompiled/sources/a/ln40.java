package a;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class ln40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Method f20326a;
    public Method b;
    public Method c;

    public ln40(Method method, Method method2, Method method3) {
        this.f20326a = method;
        this.b = method2;
        this.c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
