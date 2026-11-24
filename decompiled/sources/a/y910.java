package a;

/* JADX INFO: loaded from: classes.dex */
public final class y910 extends lm40 implements v6z {
    public int o;
    public int p;

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        long jA;
        pj30Var.getClass();
        long jD = r4e.d(j, n2x.b(this.o, this.p));
        if (p4e.h(j) == Integer.MAX_VALUE && p4e.i(j) != Integer.MAX_VALUE) {
            int i = (int) (jD >> 32);
            int i2 = (this.p * i) / this.o;
            jA = r4e.a(i, i, i2, i2);
        } else if (p4e.i(j) != Integer.MAX_VALUE || p4e.h(j) == Integer.MAX_VALUE) {
            int i3 = (int) (jD >> 32);
            int i4 = (int) (jD & 4294967295L);
            jA = r4e.a(i3, i3, i4, i4);
        } else {
            int i5 = (int) (jD & 4294967295L);
            int i6 = (this.o * i5) / this.p;
            jA = r4e.a(i6, i6, i5, i5);
        }
        pu90 pu90VarS = pj30Var.S(jA);
        return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b, new r63(pu90VarS, (byte) 3));
    }
}
