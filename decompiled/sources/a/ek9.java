package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ek9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f7942a;

    static {
        boolean z;
        try {
            Class.forName("java.lang.ClassValue");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        f7942a = z;
    }
}
