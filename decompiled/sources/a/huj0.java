package a;

/* JADX INFO: loaded from: classes2.dex */
public final class huj0 extends q8a {
    public final e83 l;
    public final boolean m;
    public final f7u n;
    public final x83 o;
    public final boolean p;

    public huj0(e83 e83Var, boolean z, f7u f7uVar, x83 x83Var, boolean z2) {
        f7uVar.getClass();
        this.l = e83Var;
        this.m = z;
        this.n = f7uVar;
        this.o = x83Var;
        this.p = z2;
    }

    @Override // a.q8a
    public final boolean P(Object obj, aty atyVar) {
        t83 t83Var = (t83) obj;
        if (t83Var instanceof i9z) {
            b0();
            if (((i9z) t83Var).g || this.o == x83.TYPE_PARAMETER_BOUNDS) {
                return true;
            }
        }
        if (atyVar == null || !ary.G((wsy) atyVar)) {
            return false;
        }
        f7u f7uVar = this.n;
        if (!((a93) ((v7i) f7uVar.b).l).i(t83Var)) {
            return false;
        }
        Object obj2 = f7uVar.b;
        return true;
    }

    @Override // a.q8a
    public final u0 T() {
        return (a93) ((v7i) this.n.b).l;
    }

    @Override // a.q8a
    public final Iterable U(aty atyVar) {
        atyVar.getClass();
        return ((wsy) atyVar).getAnnotations();
    }

    @Override // a.q8a
    public final Iterable W() {
        g93 annotations;
        e83 e83Var = this.l;
        return (e83Var == null || (annotations = e83Var.getAnnotations()) == null) ? iun.f15405a : annotations;
    }

    @Override // a.q8a
    public final x83 X() {
        return this.o;
    }

    @Override // a.q8a
    public final jay Y() {
        return (jay) ((a8z) this.n.d).getValue();
    }

    @Override // a.q8a
    public final boolean Z() {
        e83 e83Var = this.l;
        return (e83Var instanceof k3u0) && ((k3u0) e83Var).k != null;
    }

    @Override // a.q8a
    public final lov0 a0(lov0 lov0Var, t8y t8yVar) {
        if (lov0Var != null) {
            return lov0.a(lov0Var, p860.c, false, 2);
        }
        if (t8yVar != null) {
            return t8yVar.f33535a;
        }
        return null;
    }

    @Override // a.q8a
    public final boolean b0() {
        Object obj = this.n.b;
        return false;
    }

    @Override // a.q8a
    public final aty c0(aty atyVar) {
        atyVar.getClass();
        return xsm0.m((wsy) atyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.q8a
    public final twq d0(dcg0 dcg0Var) {
        dcg0Var.getClass();
        a2o a2oVar = e0t0.f7005a;
        foc focVarN = ((wsy) dcg0Var).S().n();
        wm40 wm40Var = focVarN instanceof wm40 ? (wm40) focVarN : null;
        if (wm40Var != null) {
            return oek.f(wm40Var);
        }
        return null;
    }

    @Override // a.q8a
    public final boolean i0() {
        return this.p;
    }

    @Override // a.q8a
    public final /* bridge */ /* synthetic */ yzs0 j0() {
        return gqw0.C1;
    }

    @Override // a.q8a
    public final boolean m0() {
        return this.m;
    }

    @Override // a.q8a
    public final boolean n0(aty atyVar, aty atyVar2) {
        atyVar.getClass();
        atyVar2.getClass();
        return ((lm50) ((km50) ((v7i) this.n.b).m)).a((wsy) atyVar, (wsy) atyVar2);
    }

    @Override // a.q8a
    public final boolean p0() {
        return false;
    }

    @Override // a.q8a
    public final boolean q0(aty atyVar) {
        atyVar.getClass();
        return ((wsy) atyVar).j0() instanceof t660;
    }
}
