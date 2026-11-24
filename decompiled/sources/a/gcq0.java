package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gcq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f11075a = new ThreadLocal();

    public static eeo a() {
        ThreadLocal threadLocal = f11075a;
        eeo eeoVar = (eeo) threadLocal.get();
        if (eeoVar != null) {
            return eeoVar;
        }
        ua8 ua8Var = new ua8(Thread.currentThread());
        threadLocal.set(ua8Var);
        return ua8Var;
    }
}
