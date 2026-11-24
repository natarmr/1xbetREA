package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class cee0 {
    public static final bee0 Companion = new bee0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4207a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;

    public /* synthetic */ cee0(int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        if (31 != (i & 31)) {
            m2x.I(i, 31, aee0.f723a.getDescriptor());
            throw null;
        }
        this.f4207a = z;
        this.b = i2;
        this.c = i3;
        this.d = z2;
        this.e = z3;
    }

    public cee0(int i) {
        this.f4207a = false;
        this.b = 30;
        this.c = i;
        this.d = false;
        this.e = false;
    }
}
