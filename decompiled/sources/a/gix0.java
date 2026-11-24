package a;

/* JADX INFO: loaded from: classes2.dex */
public final class gix0 {
    public static final gix0 b = new gix0(new uxs0((byte) 21));
    public static final gix0 c;
    public static final gix0 d;
    public static final gix0 e;
    public static final gix0 f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jix0 f11371a;

    static {
        byte b2 = 22;
        c = new gix0(new svs0(b2));
        new gix0(new sxs0(b2));
        byte b3 = 21;
        new gix0(new bzs0(b3));
        d = new gix0(new s6x0());
        e = new gix0(new wxs0(b3));
        f = new gix0(new kys0(b3));
    }

    public gix0(lix0 lix0Var) {
        if (pyw0.a()) {
            this.f11371a = new nmt0(lix0Var);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.f11371a = new ilp0(lix0Var);
        } else {
            this.f11371a = new rkt0(lix0Var, (byte) 15);
        }
    }
}
