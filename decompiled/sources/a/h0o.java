package a;

import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class h0o extends r2e {
    public final qlc b;
    public final g950 c;

    public h0o(qlc qlcVar, g950 g950Var) {
        super(new Pair(qlcVar, g950Var));
        this.b = qlcVar;
        this.c = g950Var;
    }

    @Override // a.r2e
    public final wsy a(ym40 ym40Var) {
        kzj0 kzj0VarI;
        ym40Var.getClass();
        qlc qlcVar = this.b;
        wm40 wm40VarV = obb.V(ym40Var, qlcVar);
        if (wm40VarV != null) {
            int i = oek.f25126a;
            if (!oek.m(wm40VarV, slc.c)) {
                wm40VarV = null;
            }
            if (wm40VarV != null && (kzj0VarI = wm40VarV.I()) != null) {
                return kzj0VarI;
            }
        }
        c2o c2oVar = c2o.A;
        String string = qlcVar.toString();
        String str = this.c.f10896a;
        str.getClass();
        return f2o.c(c2oVar, string, str);
    }

    @Override // a.r2e
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.f());
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }
}
