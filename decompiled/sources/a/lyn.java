package a;

/* JADX INFO: loaded from: classes2.dex */
public final class lyn {
    public static final lyn b = new lyn(new xak(8));
    public static final lyn c = new lyn(new pek());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kyn f20870a;

    static {
        new lyn(new xak((byte) 9));
        new lyn(new sek());
        new lyn(new ddk());
        new lyn(new nek());
        new lyn(new bek());
    }

    public lyn(tyn tynVar) {
        if (foq0.a()) {
            this.f20870a = new lrc((Object) tynVar, (byte) 29);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.f20870a = new lsn(tynVar);
        } else {
            this.f20870a = new ocl(tynVar);
        }
    }
}
