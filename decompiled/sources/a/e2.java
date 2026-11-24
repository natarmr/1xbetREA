package a;

/* JADX INFO: loaded from: classes2.dex */
public final class e2 {
    public static final e2 c;
    public static final e2 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7062a;
    public final Throwable b;

    static {
        if (r2.f) {
            d = null;
            c = null;
        } else {
            d = new e2(null, false);
            c = new e2(null, true);
        }
    }

    public e2(Throwable th, boolean z) {
        this.f7062a = z;
        this.b = th;
    }
}
