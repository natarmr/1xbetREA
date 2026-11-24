package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class jil0 implements lil0, mil0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y9q0 f16581a;
    public final y9q0 b;
    public final iil0 c;
    public final zgl0 d;

    public jil0(y9q0 y9q0Var, y9q0 y9q0Var2, zgl0 zgl0Var) {
        iil0 iil0Var = new iil0();
        this.f16581a = y9q0Var;
        this.b = y9q0Var2;
        this.c = iil0Var;
        this.d = zgl0Var;
    }

    @Override // a.qil0
    public final y9q0 a() {
        return this.b;
    }

    @Override // a.qil0
    public final int b() {
        return Integer.MAX_VALUE;
    }

    @Override // a.qil0
    public final ahl0 c() {
        return this.d;
    }

    @Override // a.lil0
    public final iil0 d() {
        return this.c;
    }

    @Override // a.qil0
    public final y9q0 e() {
        return this.f16581a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jil0)) {
            return false;
        }
        jil0 jil0Var = (jil0) obj;
        return this.f16581a.equals(jil0Var.f16581a) && this.b.equals(jil0Var.b) && this.c.equals(jil0Var.c) && this.d.equals(jil0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + brm0.g(this.b, brm0.g(this.f16581a, Integer.hashCode(Integer.MAX_VALUE) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "List(marketLabelMaxLines=2147483647, marketLabelFontStyle=" + this.f16581a + ", coefficientLabelFontStyle=" + this.b + ", corners=" + this.c + ", sportMarketColorScheme=" + this.d + Separators.RPAREN;
    }
}
