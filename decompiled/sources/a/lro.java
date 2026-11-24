package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class lro {
    public static final kro Companion = new kro();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20543a;
    public final int b;

    public /* synthetic */ lro(int i, int i2, long j) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, jro.f17012a.getDescriptor());
            throw null;
        }
        this.f20543a = j;
        this.b = i2;
    }

    public lro(long j, int i) {
        this.f20543a = j;
        this.b = i;
    }
}
