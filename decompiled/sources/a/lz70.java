package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lz70 extends mjq {
    public static final lz70 d = new lz70(0, 4, 1);

    @Override // a.mjq
    public final void d(hu5 hu5Var, bv3 bv3Var, t9k0 t9k0Var, pwi pwiVar, s080 s080Var) {
        mu40 mu40Var = (mu40) hu5Var.g(2);
        mu40 mu40Var2 = (mu40) hu5Var.g(3);
        nld nldVar = (nld) hu5Var.g(1);
        lu40 lu40VarP = (lu40) hu5Var.g(0);
        if (lu40VarP == null && (lu40VarP = nldVar.p(mu40Var)) == null) {
            ykd.b("Could not resolve state for movable content");
            csj.b();
            return;
        }
        q9k0 q9k0VarA = s9k0.a(lu40VarP.f20657a);
        if (t9k0Var.n > 0 || t9k0Var.t(t9k0Var.t + 1) != 1) {
            ykd.a("Check failed");
        }
        int i = t9k0Var.t;
        int i2 = t9k0Var.i;
        int i3 = t9k0Var.j;
        t9k0Var.a(1);
        t9k0Var.Q();
        t9k0Var.d();
        t9k0 t9k0VarH = q9k0VarA.h();
        try {
            List listL0 = l8x.l0(t9k0VarH, 2, t9k0Var, false, true, true);
            t9k0VarH.e(true);
            t9k0Var.j();
            t9k0Var.i();
            t9k0Var.t = i;
            t9k0Var.i = i2;
            t9k0Var.j = i3;
            r8x.C(t9k0Var, listL0, mu40Var2.c);
        } catch (Throwable th) {
            t9k0VarH.e(false);
            throw th;
        }
    }
}
