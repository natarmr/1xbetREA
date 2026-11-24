package a;

/* JADX INFO: loaded from: classes.dex */
public final class iz70 extends mjq {
    public static final iz70 d = new iz70(0, 2, 1);

    @Override // a.mjq
    public final void d(hu5 hu5Var, bv3 bv3Var, t9k0 t9k0Var, pwi pwiVar, s080 s080Var) {
        bet betVar = (bet) hu5Var.g(0);
        Object objG = hu5Var.g(1);
        if (objG instanceof jet) {
            jet jetVar = (jet) objG;
            ((xz40) pwiVar.g).b(jetVar);
            ((iz40) pwiVar.c).a(jetVar);
        }
        if (t9k0Var.n != 0) {
            ykd.a("Can only append a slot if not current inserting");
        }
        int i = t9k0Var.i;
        int i2 = t9k0Var.j;
        int iC = t9k0Var.c(betVar);
        int iF = t9k0Var.f(t9k0Var.b, t9k0Var.q(iC + 1));
        t9k0Var.i = iF;
        t9k0Var.j = iF;
        t9k0Var.w(1, iC);
        if (i >= iF) {
            i++;
            i2++;
        }
        t9k0Var.c[iF] = objG;
        t9k0Var.i = i;
        t9k0Var.j = i2;
    }
}
