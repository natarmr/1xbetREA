package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class poc0 {
    public static final noc0 Companion = new noc0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27323a;
    public final long b;
    public final String c;
    public final int d;

    public /* synthetic */ poc0(int i, long j, long j2, String str, int i2) {
        if (15 != (i & 15)) {
            m2x.I(i, 15, loc0.f20385a.getDescriptor());
            throw null;
        }
        this.f27323a = j;
        this.b = j2;
        this.c = str;
        this.d = i2;
    }

    public poc0(long j, long j2, String str) {
        this.f27323a = j;
        this.b = j2;
        this.c = str;
        this.d = 22;
    }
}
