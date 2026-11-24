package a;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class r9t {
    public static final q9t Companion = new q9t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30102a;
    public final Double b;

    public /* synthetic */ r9t(int i, long j, Double d) {
        if (1 != (i & 1)) {
            m2x.I(i, 1, p9t.f26624a.getDescriptor());
            throw null;
        }
        this.f30102a = j;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
    }

    public r9t(long j, Double d) {
        this.f30102a = j;
        this.b = d;
    }
}
