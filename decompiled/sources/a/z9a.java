package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class z9a extends kzj0 implements faa {
    public final pzs0 b;
    public final caa c;
    public final boolean d;
    public final ays0 e;

    public z9a(pzs0 pzs0Var, caa caaVar, boolean z, ays0 ays0Var) {
        pzs0Var.getClass();
        ays0Var.getClass();
        this.b = pzs0Var;
        this.c = caaVar;
        this.d = z;
        this.e = ays0Var;
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
        return this.d;
    }

    @Override // a.wsy
    /* JADX INFO: renamed from: f0 */
    public final wsy l0(cty ctyVar) {
        return new z9a(this.b.d(ctyVar), this.c, this.d, this.e);
    }

    @Override // a.kzj0, a.tft0
    public final tft0 k0(boolean z) {
        if (z == this.d) {
            return this;
        }
        return new z9a(this.b, this.c, z, this.e);
    }

    @Override // a.tft0
    /* JADX INFO: renamed from: l0 */
    public final tft0 f0(cty ctyVar) {
        return new z9a(this.b.d(ctyVar), this.c, this.d, this.e);
    }

    @Override // a.kzj0
    /* JADX INFO: renamed from: n0 */
    public final kzj0 k0(boolean z) {
        if (z == this.d) {
            return this;
        }
        return new z9a(this.b, this.c, z, this.e);
    }

    @Override // a.tft0
    /* JADX INFO: renamed from: o0 */
    public final kzj0 m0(ays0 ays0Var) {
        ays0Var.getClass();
        return new z9a(this.b, this.c, this.d, ays0Var);
    }

    @Override // a.kzj0
    public final String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.b);
        sb.append(')');
        sb.append(this.d ? Separators.QUESTION : "");
        return sb.toString();
    }
}
