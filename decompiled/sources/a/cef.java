package a;

/* JADX INFO: loaded from: classes.dex */
public final class cef extends wvb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a22 f4208a;

    public cef(a22 a22Var) {
        this.f4208a = a22Var;
    }

    @Override // a.wvb
    public final int K(int i, int i2, k6z k6zVar, pu90 pu90Var, int i3) {
        int iC0 = pu90Var.c0(this.f4208a.f103a);
        if (iC0 == Integer.MIN_VALUE) {
            return 0;
        }
        int i4 = i3 - iC0;
        return k6zVar == k6z.b ? (i - i2) - i4 : i4;
    }

    @Override // a.wvb
    public final Integer M(pu90 pu90Var) {
        return Integer.valueOf(pu90Var.c0(this.f4208a.f103a));
    }
}
