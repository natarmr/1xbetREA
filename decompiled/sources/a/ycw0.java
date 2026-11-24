package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ycw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f42404a = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    public static final bdw0 b;

    static {
        bdw0 bdw0Var;
        for (int i = 0; i < 2; i++) {
            bdw0Var = null;
            try {
                bdw0Var = (bdw0) Class.forName(f42404a[i]).asSubclass(bdw0.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (bdw0Var != null) {
                b = bdw0Var;
            }
        }
        bdw0Var = new bdw0();
        b = bdw0Var;
    }
}
