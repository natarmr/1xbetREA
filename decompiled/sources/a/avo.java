package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class avo {
    public static final zuo Companion = new zuo();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1535a;
    public final long b;
    public final long c;
    public final long d;

    public /* synthetic */ avo(int i, long j, long j2, long j3, long j4) {
        if (4 != (i & 4)) {
            m2x.I(i, 4, yuo.f43276a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f1535a = 0L;
        } else {
            this.f1535a = j;
        }
        if ((i & 2) == 0) {
            this.b = 0L;
        } else {
            this.b = j2;
        }
        this.c = j3;
        if ((i & 8) == 0) {
            this.d = j3;
        } else {
            this.d = j4;
        }
    }

    public avo(long j, long j2, long j3) {
        this.f1535a = j;
        this.b = j2;
        this.c = j3;
        this.d = j3;
    }
}
