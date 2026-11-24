package a;

/* JADX INFO: loaded from: classes.dex */
public final class l7k0 extends fnx {
    public nul0 p;
    public zx7 q;
    public long r;
    public long s;
    public boolean t;
    public final pz40 u;

    public l7k0(nul0 nul0Var, zx7 zx7Var) {
        super((byte) 1);
        this.p = nul0Var;
        this.q = zx7Var;
        this.r = -9223372034707292160L;
        this.s = r4e.b(0, 0, 0, 0, 15);
        this.u = androidx.compose.runtime.e.e(null);
    }

    @Override // a.lm40
    public final void R0() {
        this.r = -9223372034707292160L;
        this.t = false;
    }

    @Override // a.lm40
    public final void T0() {
        ((hgk0) this.u).setValue(null);
    }

    @Override // a.fnx, a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        pu90 pu90VarS;
        j7k0 j7k0Var;
        long jD;
        j7k0 j7k0Var2;
        if (vj30Var.M()) {
            this.s = j;
            this.t = true;
            pu90VarS = pj30Var.S(j);
        } else {
            pu90VarS = pj30Var.S(this.t ? this.s : j);
        }
        pu90 pu90Var = pu90VarS;
        char c = ' ';
        long j2 = (((long) pu90Var.b) & 4294967295L) | (((long) pu90Var.f27604a) << 32);
        if (vj30Var.M()) {
            this.r = j2;
            c = ' ';
            jD = j2;
            j2 = jD;
        } else {
            long j3 = !qkx.a(this.r, -9223372034707292160L) ? this.r : j2;
            pz40 pz40Var = this.u;
            j7k0 j7k0Var3 = (j7k0) ((hgk0) pz40Var).getValue();
            if (j7k0Var3 != null) {
                t33 t33Var = j7k0Var3.f16045a;
                boolean z = (qkx.a(j3, ((qkx) t33Var.d()).f28908a) || t33Var.e()) ? false : true;
                if (!qkx.a(j3, ((qkx) ((hgk0) t33Var.e).getValue()).f28908a) || z) {
                    j7k0Var3.b = ((qkx) t33Var.d()).f28908a;
                    j7k0Var2 = j7k0Var3;
                    qjj.W(N0(), null, null, new ir((Object) j7k0Var2, j3, (Object) this, (yje) null, (byte) 28), 3);
                } else {
                    j7k0Var2 = j7k0Var3;
                }
                j7k0Var = j7k0Var2;
            } else {
                long j4 = j3;
                j7k0Var = new j7k0(new t33(new qkx(j4), hp4.q, new qkx(4294967297L), 8), j4);
            }
            ((hgk0) pz40Var).setValue(j7k0Var);
            jD = r4e.d(j, ((qkx) j7k0Var.f16045a.d()).f28908a);
        }
        int i = (int) (jD >> c);
        int i2 = (int) (jD & 4294967295L);
        return vj30.x(vj30Var, i, i2, new k7k0(this, j2, i, i2, vj30Var, pu90Var));
    }
}
