package a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class xr00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.runtime.d f41346a;

    static {
        Object g0g0Var;
        try {
            e0g0 e0g0Var = j0g0.b;
            ClassLoader classLoader = i0h0.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof androidx.compose.runtime.d) {
                        g0g0Var = (androidx.compose.runtime.d) objInvoke;
                        break;
                    }
                } else if (!(annotations[i] instanceof lbk)) {
                    i++;
                }
                g0g0Var = null;
                break;
            }
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        e0g0 e0g0Var3 = j0g0.b;
        androidx.compose.runtime.d zfnVar = (androidx.compose.runtime.d) (g0g0Var instanceof g0g0 ? null : g0g0Var);
        if (zfnVar == null) {
            zfnVar = new zfn(new x800((byte) 24), (byte) 1);
        }
        f41346a = zfnVar;
    }
}
