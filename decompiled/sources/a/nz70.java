package a;

/* JADX INFO: loaded from: classes.dex */
public final class nz70 extends mjq {
    public static final nz70 d = new nz70(0, 2, 1);

    @Override // a.mjq
    public final void d(hu5 hu5Var, bv3 bv3Var, t9k0 t9k0Var, pwi pwiVar, s080 s080Var) {
        int i;
        nkx nkxVar = (nkx) hu5Var.g(0);
        int iC = t9k0Var.c((bet) hu5Var.g(1));
        if (t9k0Var.t >= iC) {
            ykd.a("Check failed");
        }
        x8x.u(t9k0Var, bv3Var, iC);
        int i2 = t9k0Var.t;
        int iF = t9k0Var.v;
        while (iF >= 0 && !t9k0Var.x(iF)) {
            iF = t9k0Var.F(t9k0Var.b, iF);
        }
        int iT = iF + 1;
        int iM = 0;
        while (iT < i2) {
            if (t9k0Var.u(i2, iT)) {
                if (t9k0Var.x(iT)) {
                    iM = 0;
                }
                iT++;
            } else {
                iM += t9k0Var.x(iT) ? 1 : t9k0Var.E(iT);
                iT += t9k0Var.t(iT);
            }
        }
        while (true) {
            i = t9k0Var.t;
            if (i >= iC) {
                break;
            }
            if (t9k0Var.u(iC, i)) {
                int i3 = t9k0Var.t;
                if (i3 < t9k0Var.u && (t9k0Var.b[(t9k0Var.q(i3) * 5) + 1] & 1073741824) != 0) {
                    bv3Var.i(t9k0Var.D(t9k0Var.t));
                    iM = 0;
                }
                t9k0Var.Q();
            } else {
                iM += t9k0Var.M();
            }
        }
        if (i != iC) {
            ykd.a("Check failed");
        }
        nkxVar.f23702a = iM;
    }
}
