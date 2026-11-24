package a;

/* JADX INFO: loaded from: classes2.dex */
public final class sfk extends fyj0 implements wek {
    public final i3d0 f1;
    public final h950 g1;
    public final roi0 h1;
    public final xbu0 i1;
    public final hfk j1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfk(vjj vjjVar, fyj0 fyj0Var, g93 g93Var, g950 g950Var, int i, i3d0 i3d0Var, h950 h950Var, roi0 roi0Var, xbu0 xbu0Var, hfk hfkVar, gmk0 gmk0Var) {
        super(vjjVar, fyj0Var, g93Var, g950Var, i, gmk0Var == null ? gmk0.x0 : gmk0Var);
        vjjVar.getClass();
        g93Var.getClass();
        g950Var.getClass();
        if (i == 0) {
            throw null;
        }
        i3d0Var.getClass();
        h950Var.getClass();
        xbu0Var.getClass();
        this.f1 = i3d0Var;
        this.g1 = h950Var;
        this.h1 = roi0Var;
        this.i1 = xbu0Var;
        this.j1 = hfkVar;
    }

    @Override // a.kfk
    public final h950 A() {
        return this.g1;
    }

    @Override // a.kfk
    public final hfk B() {
        return this.j1;
    }

    @Override // a.kfk
    public final z3 O() {
        return this.f1;
    }

    @Override // a.fyj0, a.oer
    public final oer q1(int i, g93 g93Var, vjj vjjVar, mer merVar, g950 g950Var, gmk0 gmk0Var) {
        g950 g950Var2;
        vjjVar.getClass();
        if (i == 0) {
            throw null;
        }
        g93Var.getClass();
        fyj0 fyj0Var = (fyj0) merVar;
        if (g950Var == null) {
            g950 name = getName();
            name.getClass();
            g950Var2 = name;
        } else {
            g950Var2 = g950Var;
        }
        sfk sfkVar = new sfk(vjjVar, fyj0Var, g93Var, g950Var2, i, this.f1, this.g1, this.h1, this.i1, this.j1, gmk0Var);
        sfkVar.w = this.w;
        return sfkVar;
    }

    @Override // a.kfk
    public final roi0 x() {
        return this.h1;
    }
}
