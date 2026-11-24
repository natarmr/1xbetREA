package a;

/* JADX INFO: loaded from: classes2.dex */
public final class rfk extends f0d0 implements wek {
    public final p3d0 B;
    public final h950 Y;
    public final roi0 Z;
    public final xbu0 f1;
    public final hfk g1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfk(vjj vjjVar, d0d0 d0d0Var, g93 g93Var, gm40 gm40Var, tek tekVar, boolean z, g950 g950Var, int i, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, p3d0 p3d0Var, h950 h950Var, roi0 roi0Var, xbu0 xbu0Var, hfk hfkVar) {
        super(vjjVar, d0d0Var, g93Var, gm40Var, tekVar, z, g950Var, i, gmk0.x0, z2, z3, z6, z4, z5);
        vjjVar.getClass();
        g93Var.getClass();
        gm40Var.getClass();
        tekVar.getClass();
        g950Var.getClass();
        if (i == 0) {
            throw null;
        }
        p3d0Var.getClass();
        h950Var.getClass();
        this.B = p3d0Var;
        this.Y = h950Var;
        this.Z = roi0Var;
        this.f1 = xbu0Var;
        this.g1 = hfkVar;
    }

    @Override // a.kfk
    public final h950 A() {
        return this.Y;
    }

    @Override // a.kfk
    public final hfk B() {
        return this.g1;
    }

    @Override // a.kfk
    public final z3 O() {
        return this.B;
    }

    @Override // a.f0d0, a.sq30
    public final boolean isExternal() {
        return njq.H.e(this.B.d).booleanValue();
    }

    @Override // a.f0d0
    public final f0d0 r1(vjj vjjVar, gm40 gm40Var, tek tekVar, d0d0 d0d0Var, int i, g950 g950Var) {
        vjjVar.getClass();
        gm40Var.getClass();
        tekVar.getClass();
        if (i == 0) {
            throw null;
        }
        g950Var.getClass();
        return new rfk(vjjVar, d0d0Var, getAnnotations(), gm40Var, tekVar, this.g, g950Var, i, this.o, this.p, isExternal(), this.s, this.q, this.B, this.Y, this.Z, this.f1, this.g1);
    }

    @Override // a.kfk
    public final roi0 x() {
        return this.Z;
    }
}
