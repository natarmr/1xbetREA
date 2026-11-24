package a;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class o6n0 {
    public static final n6n0 Companion = new n6n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24746a;
    public final int b;

    public /* synthetic */ o6n0(int i, int i2, long j) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, m6n0.f21280a.getDescriptor());
            throw null;
        }
        this.f24746a = j;
        this.b = i2;
    }

    public o6n0(long j) {
        this.f24746a = j;
        this.b = 7;
    }
}
