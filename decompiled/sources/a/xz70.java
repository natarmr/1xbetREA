package a;

/* JADX INFO: loaded from: classes.dex */
public final class xz70 extends mjq {
    public static final xz70 d = new xz70(0, 3, 1);

    @Override // a.mjq
    public final void d(hu5 hu5Var, bv3 bv3Var, t9k0 t9k0Var, pwi pwiVar, s080 s080Var) {
        j910 j910Var;
        q9k0 q9k0Var = (q9k0) hu5Var.g(1);
        bet betVar = (bet) hu5Var.g(0);
        uiq uiqVar = (uiq) hu5Var.g(2);
        t9k0 t9k0VarH = q9k0Var.h();
        if (s080Var != null) {
            try {
                j910Var = new j910(s080Var, t9k0Var, (byte) 10);
            } catch (Throwable th) {
                t9k0VarH.e(false);
                throw th;
            }
        } else {
            j910Var = null;
        }
        if (!uiqVar.b.b0()) {
            ykd.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        uiqVar.f35744a.a0(bv3Var, t9k0VarH, pwiVar, j910Var);
        t9k0VarH.e(true);
        t9k0Var.d();
        betVar.getClass();
        t9k0Var.z(q9k0Var, q9k0Var.b(betVar));
        t9k0Var.j();
    }
}
