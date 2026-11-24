package a;

/* JADX INFO: loaded from: classes.dex */
public final class l080 extends mjq {
    public static final l080 d = new l080(1, 0, 2);

    @Override // a.mjq
    public final void d(hu5 hu5Var, bv3 bv3Var, t9k0 t9k0Var, pwi pwiVar, s080 s080Var) {
        int iF = hu5Var.f(0);
        int i = t9k0Var.v;
        int iO = t9k0Var.O(t9k0Var.b, t9k0Var.q(i));
        int iF2 = t9k0Var.f(t9k0Var.b, t9k0Var.q(i + 1));
        for (int iMax = Math.max(iO, iF2 - iF); iMax < iF2; iMax++) {
            Object obj = t9k0Var.c[t9k0Var.g(iMax)];
            if (obj instanceof jet) {
                pwiVar.g((jet) obj);
            } else if (obj instanceof yfe0) {
                ((yfe0) obj).c();
            }
        }
        if (iF <= 0) {
            ykd.a("Check failed");
        }
        int i2 = t9k0Var.v;
        int iO2 = t9k0Var.O(t9k0Var.b, t9k0Var.q(i2));
        int iF3 = t9k0Var.f(t9k0Var.b, t9k0Var.q(i2 + 1)) - iF;
        if (iF3 < iO2) {
            ykd.a("Check failed");
        }
        t9k0Var.K(iF3, iF, i2);
        int i3 = t9k0Var.i;
        if (i3 >= iO2) {
            t9k0Var.i = i3 - iF;
        }
    }
}
