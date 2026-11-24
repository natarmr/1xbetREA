package a;

import com.huawei.hms.framework.common.BundleUtil;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f43274a = 0;

    static {
        Object g0g0Var;
        Object g0g0Var2;
        Exception exc = new Exception();
        String simpleName = i4w0.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), BundleUtil.UNDERLINE_TAG, stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = zw5.class.getCanonicalName();
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (j0g0.a(g0g0Var) != null) {
            g0g0Var = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            g0g0Var2 = yul0.class.getCanonicalName();
        } catch (Throwable th2) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var2 = new g0g0(th2);
        }
        if (j0g0.a(g0g0Var2) != null) {
            g0g0Var2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
