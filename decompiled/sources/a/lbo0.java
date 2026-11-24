package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lbo0 extends lm40 implements v6z {
    public l7m0 o;
    public int p;
    public boolean q;
    public nul0 r;
    public t33 s;
    public t33 t;
    public ycl u;
    public ycl v;

    @Override // a.v6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        float f;
        lxs0 lxs0Var = hp4.l;
        if (((List) ((hgk0) this.o).getValue()).isEmpty()) {
            return vj30.x(vj30Var, 0, 0, new rgn0((byte) 25));
        }
        boolean z = this.q;
        l7m0 l7m0Var = this.o;
        float f2 = z ? ((ado0) ((List) ((hgk0) l7m0Var).getValue()).get(this.p)).c : ((ado0) ((List) ((hgk0) l7m0Var).getValue()).get(this.p)).b;
        ycl yclVar = this.v;
        yje yjeVar = null;
        if (yclVar != null) {
            t33 t33Var = this.t;
            if (t33Var == null) {
                t33Var = new t33(yclVar, lxs0Var, null, 12);
                this.t = t33Var;
            }
            if (ycl.b(f2, ((ycl) ((hgk0) t33Var.e).getValue()).f42389a)) {
                f = f2;
            } else {
                f = f2;
                qjj.W(N0(), null, null, new kbo0(t33Var, f2, this, yjeVar, (byte) 0), 3);
            }
        } else {
            f = f2;
            this.v = new ycl(f);
        }
        float f3 = ((ado0) ((List) ((hgk0) this.o).getValue()).get(this.p)).f689a;
        ycl yclVar2 = this.u;
        if (yclVar2 != null) {
            t33 t33Var2 = this.s;
            if (t33Var2 == null) {
                t33Var2 = new t33(yclVar2, lxs0Var, null, 12);
                this.s = t33Var2;
            }
            if (!ycl.b(f3, ((ycl) ((hgk0) t33Var2.e).getValue()).f42389a)) {
                qjj.W(N0(), null, null, new kbo0(t33Var2, f3, this, yjeVar, (byte) 1), 3);
            }
        } else {
            this.u = new ycl(f3);
        }
        k6z layoutDirection = vj30Var.getLayoutDirection();
        k6z k6zVar = k6z.f17794a;
        t33 t33Var3 = this.s;
        if (layoutDirection != k6zVar) {
            if (t33Var3 != null) {
                f3 = ((ycl) t33Var3.d()).f42389a;
            }
            f3 = -f3;
        } else if (t33Var3 != null) {
            f3 = ((ycl) t33Var3.d()).f42389a;
        }
        t33 t33Var4 = this.t;
        if (t33Var4 != null) {
            f = ((ycl) t33Var4.d()).f42389a;
        }
        pu90 pu90VarS = pj30Var.S(p4e.b(j, vj30Var.T(f), vj30Var.T(f), 0, 0, 12));
        return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b, new ny2((Object) pu90VarS, (Object) vj30Var, f3, (byte) 16));
    }
}
