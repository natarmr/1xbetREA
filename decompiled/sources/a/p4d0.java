package a;

/* JADX INFO: loaded from: classes2.dex */
public final class p4d0 extends v0 {
    public final s2d0 e;
    public final p4d0 f;
    public final qlc g;
    public final r2d0 h;
    public final boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4d0(s2d0 s2d0Var, h950 h950Var, roi0 roi0Var, gmk0 gmk0Var, p4d0 p4d0Var) {
        super(h950Var, roi0Var, gmk0Var);
        s2d0Var.getClass();
        h950Var.getClass();
        this.e = s2d0Var;
        this.f = p4d0Var;
        this.g = ydx.K(h950Var, s2d0Var.e);
        r2d0 r2d0Var = (r2d0) njq.f.e(s2d0Var.d);
        this.h = r2d0Var == null ? r2d0.CLASS : r2d0Var;
        this.i = njq.g.e(s2d0Var.d).booleanValue();
        njq.h.getClass();
    }

    @Override // a.v0
    public final swq o() {
        return this.g.a();
    }
}
