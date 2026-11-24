package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class hy {
    public static final gy Companion = new gy();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13837a;
    public final String b;

    public /* synthetic */ hy(String str, int i, long j) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, fy.f10336a.getDescriptor());
            throw null;
        }
        this.f13837a = j;
        this.b = str;
    }

    public hy(long j, String str) {
        this.f13837a = j;
        this.b = str;
    }
}
