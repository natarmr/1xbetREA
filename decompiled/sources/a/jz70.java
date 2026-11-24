package a;

/* JADX INFO: loaded from: classes.dex */
public final class jz70 extends mjq {
    public static final jz70 d = new jz70(0, 2, 1);

    @Override // a.mjq
    public final void d(hu5 hu5Var, bv3 bv3Var, t9k0 t9k0Var, pwi pwiVar, s080 s080Var) {
        nkx nkxVar = (nkx) hu5Var.g(1);
        int i = nkxVar != null ? nkxVar.f23702a : 0;
        qpb qpbVar = (qpb) hu5Var.g(0);
        if (i > 0) {
            bv3Var = new cf60(bv3Var, i);
        }
        qpbVar.h1(bv3Var, t9k0Var, pwiVar, s080Var != null ? new j910(s080Var, t9k0Var, (byte) 10) : null);
    }
}
