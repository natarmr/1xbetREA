package a;

/* JADX INFO: loaded from: classes.dex */
public final class eag0 {
    public static final eag0 d = new eag0(0, false, false);
    public static final eag0 e = new eag0(500, true, false);
    public static final eag0 f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f7464a;
    public final boolean b;
    public final boolean c;

    static {
        new eag0(100L, true, false);
        f = new eag0(0L, false, true);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public eag0(long j, boolean z, boolean z2) {
        this.b = z;
        this.f7464a = (int) j;
        if (z2) {
            z1x.t("shouldRetry must be false when completeWithoutFailure is set to true", !z);
        }
        this.c = z2;
    }
}
