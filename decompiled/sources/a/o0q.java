package a;

/* JADX INFO: loaded from: classes.dex */
public final class o0q extends lm40 implements v6z {
    public dnk o;
    public float p;

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        int iK;
        int i;
        int iH;
        int i2;
        if (!p4e.e(j) || this.o == dnk.f6373a) {
            iK = p4e.k(j);
            i = p4e.i(j);
        } else {
            int iRound = Math.round(p4e.i(j) * this.p);
            int iK2 = p4e.k(j);
            iK = p4e.i(j);
            if (iRound < iK2) {
                iRound = iK2;
            }
            if (iRound <= iK) {
                iK = iRound;
            }
            i = iK;
        }
        if (!p4e.d(j) || this.o == dnk.b) {
            int iJ = p4e.j(j);
            int iH2 = p4e.h(j);
            iH = iJ;
            i2 = iH2;
        } else {
            int iRound2 = Math.round(p4e.h(j) * this.p);
            int iJ2 = p4e.j(j);
            iH = p4e.h(j);
            if (iRound2 < iJ2) {
                iRound2 = iJ2;
            }
            if (iRound2 <= iH) {
                iH = iRound2;
            }
            i2 = iH;
        }
        pu90 pu90VarS = pj30Var.S(r4e.a(iK, i, iH, i2));
        return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b, new cam(pu90VarS, (byte) 4));
    }
}
