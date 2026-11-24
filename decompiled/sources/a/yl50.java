package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yl50 extends kzj0 implements faa {
    public final u9a b;
    public final zl50 c;
    public final tft0 d;
    public final ays0 e;
    public final boolean f;
    public final boolean g;

    /* JADX WARN: Illegal instructions before constructor call */
    public yl50(u9a u9aVar, zl50 zl50Var, tft0 tft0Var, ays0 ays0Var, boolean z, int i) {
        if ((i & 8) != 0) {
            ays0.b.getClass();
            ays0Var = ays0.c;
        }
        this(u9aVar, zl50Var, tft0Var, ays0Var, (i & 16) != 0 ? false : z, false);
    }

    @Override // a.wsy
    public final List J() {
        return iun.f15405a;
    }

    @Override // a.wsy
    public final ays0 K() {
        return this.e;
    }

    @Override // a.wsy
    public final iys0 S() {
        return this.c;
    }

    @Override // a.wsy
    public final boolean U() {
        return this.f;
    }

    @Override // a.kzj0, a.tft0
    public final tft0 k0(boolean z) {
        return new yl50(this.b, this.c, this.d, this.e, z, 32);
    }

    @Override // a.kzj0
    /* JADX INFO: renamed from: n0 */
    public final kzj0 k0(boolean z) {
        return new yl50(this.b, this.c, this.d, this.e, z, 32);
    }

    @Override // a.tft0
    /* JADX INFO: renamed from: o0 */
    public final kzj0 m0(ays0 ays0Var) {
        ays0Var.getClass();
        return new yl50(this.b, this.c, this.d, ays0Var, this.f, this.g);
    }

    @Override // a.tft0
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public final yl50 f0(cty ctyVar) {
        zl50 zl50Var = this.c;
        pzs0 pzs0VarD = zl50Var.f44565a.d(ctyVar);
        ha30 ha30Var = zl50Var.b != null ? new ha30(zl50Var, ctyVar, (byte) 9) : null;
        zl50 zl50Var2 = zl50Var.c;
        if (zl50Var2 == null) {
            zl50Var2 = zl50Var;
        }
        zl50 zl50Var3 = new zl50(pzs0VarD, ha30Var, zl50Var2, zl50Var.d);
        tft0 tft0Var = this.d;
        return new yl50(this.b, zl50Var3, tft0Var != null ? tft0Var : null, this.e, this.f, 32);
    }

    @Override // a.wsy
    public final cr30 y() {
        return f2o.a(u1o.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public yl50(u9a u9aVar, zl50 zl50Var, tft0 tft0Var, ays0 ays0Var, boolean z, boolean z2) {
        u9aVar.getClass();
        zl50Var.getClass();
        ays0Var.getClass();
        this.b = u9aVar;
        this.c = zl50Var;
        this.d = tft0Var;
        this.e = ays0Var;
        this.f = z;
        this.g = z2;
    }
}
