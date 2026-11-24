package a;

/* JADX INFO: loaded from: classes6.dex */
public final class azs0 {
    public static final azs0 i = new azs0(new azs0(null, 2047), 2012);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1736a;
    public final boolean b;
    public final azs0 c;
    public final boolean d;
    public final azs0 e;
    public final azs0 f;
    public final boolean g;
    public final boolean h;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ azs0(azs0 azs0Var, int i2) {
        boolean z = (i2 & 1) != 0;
        boolean z2 = (i2 & 2) != 0;
        azs0 azs0Var2 = (i2 & 32) != 0 ? null : azs0Var;
        this(z, z2, azs0Var2, true, azs0Var2, azs0Var2, (i2 & 512) == 0, (i2 & 1024) == 0);
    }

    public azs0(boolean z, boolean z2, azs0 azs0Var, boolean z3, azs0 azs0Var2, azs0 azs0Var3, boolean z4, boolean z5) {
        this.f1736a = z;
        this.b = z2;
        this.c = azs0Var;
        this.d = z3;
        this.e = azs0Var2;
        this.f = azs0Var3;
        this.g = z4;
        this.h = z5;
    }
}
