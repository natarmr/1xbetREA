package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class knj0 {
    public static final inj0 Companion = new inj0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18589a;
    public final String b;
    public final boolean c;
    public final double d;
    public final boolean e;

    public /* synthetic */ knj0(int i, int i2, String str, boolean z, double d, boolean z2) {
        if (31 != (i & 31)) {
            m2x.I(i, 31, gnj0.f11591a.getDescriptor());
            throw null;
        }
        this.f18589a = i2;
        this.b = str;
        this.c = z;
        this.d = d;
        this.e = z2;
    }

    public knj0(int i, String str, double d, boolean z) {
        str.getClass();
        this.f18589a = i;
        this.b = str;
        this.c = false;
        this.d = d;
        this.e = z;
    }
}
