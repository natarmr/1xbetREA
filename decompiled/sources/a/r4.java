package a;

/* JADX INFO: loaded from: classes.dex */
public final class r4 {
    public static final r4 c;
    public static final r4 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29810a;
    public final Throwable b;

    static {
        if (y4.d) {
            d = null;
            c = null;
        } else {
            d = new r4(null, false);
            c = new r4(null, true);
        }
    }

    public r4(Throwable th, boolean z) {
        this.f29810a = z;
        this.b = th;
    }
}
