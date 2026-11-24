package a;

/* JADX INFO: loaded from: classes2.dex */
public final class xek extends flc implements wek {
    public final v2d0 g1;
    public final h950 h1;
    public final roi0 i1;
    public final xbu0 j1;
    public final hfk k1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xek(wm40 wm40Var, x4e x4eVar, g93 g93Var, boolean z, int i, v2d0 v2d0Var, h950 h950Var, roi0 roi0Var, xbu0 xbu0Var, hfk hfkVar, gmk0 gmk0Var) {
        super(wm40Var, x4eVar, g93Var, z, i, gmk0Var == null ? gmk0.x0 : gmk0Var);
        wm40Var.getClass();
        g93Var.getClass();
        if (i == 0) {
            throw null;
        }
        v2d0Var.getClass();
        h950Var.getClass();
        this.g1 = v2d0Var;
        this.h1 = h950Var;
        this.i1 = roi0Var;
        this.j1 = xbu0Var;
        this.k1 = hfkVar;
    }

    @Override // a.kfk
    public final h950 A() {
        return this.h1;
    }

    @Override // a.kfk
    public final hfk B() {
        return this.k1;
    }

    public final xek F1(vjj vjjVar, mer merVar, int i, g93 g93Var, gmk0 gmk0Var) {
        vjjVar.getClass();
        if (i == 0) {
            throw null;
        }
        g93Var.getClass();
        xek xekVar = new xek((wm40) vjjVar, (x4e) merVar, g93Var, this.f1, i, this.g1, this.h1, this.i1, this.j1, this.k1, gmk0Var);
        xekVar.w = this.w;
        return xekVar;
    }

    @Override // a.kfk
    public final z3 O() {
        return this.g1;
    }

    @Override // a.oer, a.sq30
    public final boolean isExternal() {
        return false;
    }

    @Override // a.oer, a.mer
    public final boolean isInline() {
        return false;
    }

    @Override // a.oer, a.mer
    public final boolean isSuspend() {
        return false;
    }

    @Override // a.flc, a.oer
    public final /* bridge */ /* synthetic */ oer q1(int i, g93 g93Var, vjj vjjVar, mer merVar, g950 g950Var, gmk0 gmk0Var) {
        return F1(vjjVar, merVar, i, g93Var, gmk0Var);
    }

    @Override // a.oer, a.mer
    public final boolean w() {
        return false;
    }

    @Override // a.kfk
    public final roi0 x() {
        return this.i1;
    }

    @Override // a.flc
    /* JADX INFO: renamed from: y1 */
    public final /* bridge */ /* synthetic */ flc q1(int i, g93 g93Var, vjj vjjVar, mer merVar, g950 g950Var, gmk0 gmk0Var) {
        return F1(vjjVar, merVar, i, g93Var, gmk0Var);
    }
}
