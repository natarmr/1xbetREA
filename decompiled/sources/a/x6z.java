package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class x6z extends s460 {
    public static final ucs0 F1;
    public v6z D1;
    public w6z E1;

    static {
        ucs0 ucs0VarD = saj.D();
        int i = y3d.h;
        ucs0VarD.s(y3d.e);
        ucs0VarD.z(1.0f);
        ucs0VarD.A(1);
        F1 = ucs0VarD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x6z(e7z e7zVar, v6z v6zVar) {
        super(e7zVar);
        this.D1 = v6zVar;
        this.E1 = e7zVar.i != null ? new w6z(this) : null;
        if ((((lm40) v6zVar).f20279a.c & 512) == 0) {
            return;
        }
        hny.b();
        throw null;
    }

    @Override // a.pj30
    public final int D(int i) {
        v6z v6zVar = this.D1;
        s460 s460Var = this.v;
        s460Var.getClass();
        return v6zVar.w(this, s460Var, i);
    }

    public final void J1() {
        if (this.n) {
            return;
        }
        s1();
        s460 s460Var = this.v;
        s460Var.getClass();
        boolean z = s460Var.o;
        s460Var.o = this.o;
        N0().b();
        s460Var.o = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K1(v6z v6zVar) {
        if (v6zVar.equals(this.D1) || (((lm40) v6zVar).f20279a.c & 512) == 0) {
            this.D1 = v6zVar;
        } else {
            hny.b();
        }
    }

    @Override // a.pj30
    public final int L(int i) {
        v6z v6zVar = this.D1;
        s460 s460Var = this.v;
        s460Var.getClass();
        return v6zVar.e0(this, s460Var, i);
    }

    @Override // a.pj30
    public final int P(int i) {
        v6z v6zVar = this.D1;
        s460 s460Var = this.v;
        s460Var.getClass();
        return v6zVar.U(this, s460Var, i);
    }

    @Override // a.pj30
    public final pu90 S(long j) {
        u0(j);
        v6z v6zVar = this.D1;
        s460 s460Var = this.v;
        s460Var.getClass();
        A1(v6zVar.c(this, s460Var, j));
        r1();
        return this;
    }

    @Override // a.pj30
    public final int b(int i) {
        v6z v6zVar = this.D1;
        s460 s460Var = this.v;
        s460Var.getClass();
        return v6zVar.v(this, s460Var, i);
    }

    @Override // a.s460
    public final void b1() {
        if (this.E1 == null) {
            this.E1 = new w6z(this);
        }
    }

    @Override // a.s460
    public final e810 e1() {
        return this.E1;
    }

    @Override // a.s460
    public final lm40 g1() {
        return ((lm40) this.D1).f20279a;
    }

    @Override // a.s460, a.pu90
    public final void l0(long j, float f, dfv dfvVar) {
        x1(j, f, null, dfvVar);
        J1();
    }

    @Override // a.pu90
    public final void n0(long j, float f, Function1 function1) {
        x1(j, f, function1, null);
        J1();
    }

    @Override // a.s460
    public final void w1(x5a x5aVar, dfv dfvVar) throws Throwable {
        s460 s460Var;
        s460 s460Var2 = this.v;
        s460Var2.getClass();
        s460Var2.Z0(x5aVar, dfvVar);
        if (!h7z.a(this.u).getShowLayoutBounds() || (s460Var = this.v) == null) {
            return;
        }
        if (qkx.a(this.c, s460Var.c) && ikx.b(s460Var.g1, 0L)) {
            return;
        }
        long j = this.c;
        x5aVar.m(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, F1);
    }

    @Override // a.c810
    public final int y0(w12 w12Var) {
        w6z w6zVar = this.E1;
        if (w6zVar == null) {
            return m7x.t(this, w12Var);
        }
        ry40 ry40Var = w6zVar.z;
        int iD = ry40Var.d(w12Var);
        if (iD >= 0) {
            return ry40Var.c[iD];
        }
        return Integer.MIN_VALUE;
    }
}
