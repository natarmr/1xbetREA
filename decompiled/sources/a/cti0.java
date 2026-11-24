package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class cti0 {
    public static final bti0 Companion = new bti0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4938a;
    public final int b;
    public final int c;

    public /* synthetic */ cti0(int i, int i2, int i3, long j) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, ati0.f1435a.getDescriptor());
            throw null;
        }
        this.f4938a = j;
        this.b = i2;
        this.c = i3;
    }

    public cti0(int i, int i2, long j) {
        this.f4938a = j;
        this.b = i;
        this.c = i2;
    }
}
