package a;

/* JADX INFO: loaded from: classes.dex */
public final class f810 implements j6z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e810 f9086a;

    public f810(e810 e810Var) {
        this.f9086a = e810Var;
    }

    @Override // a.j6z
    public final long C(long j) {
        return ne60.f(this.f9086a.u.C(j), a());
    }

    @Override // a.j6z
    public final long F(j6z j6zVar, long j) {
        boolean z = j6zVar instanceof f810;
        e810 e810Var = this.f9086a;
        if (!z) {
            e810 e810VarK = bww.K(e810Var);
            f810 f810Var = e810VarK.x;
            s460 s460Var = e810VarK.u;
            long jF = F(f810Var, j);
            long j2 = e810VarK.v;
            long jE = ne60.e(jF, (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
            if (!s460Var.g1().n) {
                xcx.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            s460Var.q1();
            s460 s460Var2 = s460Var.w;
            if (s460Var2 != null) {
                s460Var = s460Var2;
            }
            return ne60.f(jE, s460Var.F(j6zVar, 0L));
        }
        e810 e810Var2 = ((f810) j6zVar).f9086a;
        s460 s460Var3 = e810Var2.u;
        s460Var3.q1();
        e810 e810VarE1 = e810Var.u.c1(s460Var3).e1();
        if (e810VarE1 != null) {
            long jC = ikx.c(ikx.d(e810Var2.X0(e810VarE1, false), x1x.J(j)), e810Var.X0(e810VarE1, false));
            return (((long) Float.floatToRawIntBits((int) (jC >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jC & 4294967295L))) & 4294967295L);
        }
        e810 e810VarK2 = bww.K(e810Var2);
        long jD = ikx.d(ikx.d(e810Var2.X0(e810VarK2, false), e810VarK2.v), x1x.J(j));
        e810 e810VarK3 = bww.K(e810Var);
        long jC2 = ikx.c(jD, ikx.d(e810Var.X0(e810VarK3, false), e810VarK3.v));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jC2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jC2 & 4294967295L))) & 4294967295L;
        s460 s460Var4 = e810VarK3.u.w;
        s460Var4.getClass();
        s460 s460Var5 = e810VarK2.u.w;
        s460Var5.getClass();
        return s460Var4.F(s460Var5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    @Override // a.j6z
    public final long G(long j) {
        return this.f9086a.u.G(ne60.f(j, a()));
    }

    @Override // a.j6z
    public final long I(j6z j6zVar, long j) {
        return F(j6zVar, j);
    }

    @Override // a.j6z
    public final void J(float[] fArr) {
        this.f9086a.u.J(fArr);
    }

    @Override // a.j6z
    public final long R(long j) {
        return this.f9086a.u.R(ne60.f(j, a()));
    }

    @Override // a.j6z
    public final j6z U() {
        e810 e810VarE1;
        if (!h()) {
            xcx.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        s460 s460Var = ((s460) this.f9086a.u.u.h1.e).w;
        if (s460Var == null || (e810VarE1 = s460Var.e1()) == null) {
            return null;
        }
        return e810VarE1.x;
    }

    @Override // a.j6z
    public final long Y(long j) {
        return this.f9086a.u.Y(ne60.f(j, a()));
    }

    public final long a() {
        e810 e810Var = this.f9086a;
        e810 e810VarK = bww.K(e810Var);
        return ne60.e(F(e810VarK.x, 0L), e810Var.u.F(e810VarK.u, 0L));
    }

    @Override // a.j6z
    public final long g() {
        e810 e810Var = this.f9086a;
        return (((long) e810Var.f27604a) << 32) | (((long) e810Var.b) & 4294967295L);
    }

    @Override // a.j6z
    public final boolean h() {
        return this.f9086a.u.g1().n;
    }

    @Override // a.j6z
    public final void j(j6z j6zVar, float[] fArr) {
        this.f9086a.u.j(j6zVar, fArr);
    }

    @Override // a.j6z
    public final long m(long j) {
        return ne60.f(this.f9086a.u.m(j), a());
    }

    @Override // a.j6z
    public final jge0 w(j6z j6zVar, boolean z) {
        return this.f9086a.u.w(j6zVar, z);
    }
}
