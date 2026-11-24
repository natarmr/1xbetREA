package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class iro {
    public static final hro Companion = new hro();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15268a;
    public final int b;
    public final long c;

    public /* synthetic */ iro(int i, int i2, long j, long j2) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, gro.f11789a.getDescriptor());
            throw null;
        }
        this.f15268a = j;
        this.b = i2;
        this.c = j2;
    }

    public iro(int i, long j, long j2) {
        this.f15268a = j;
        this.b = i;
        this.c = j2;
    }
}
