package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class nil0 implements pil0, mil0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y9q0 f23595a;
    public final y9q0 b;
    public final zgl0 c;

    public nil0(y9q0 y9q0Var, y9q0 y9q0Var2, zgl0 zgl0Var) {
        this.f23595a = y9q0Var;
        this.b = y9q0Var2;
        this.c = zgl0Var;
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
        return this.c;
    }

    @Override // a.qil0
    public final y9q0 e() {
        return this.f23595a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nil0)) {
            return false;
        }
        nil0 nil0Var = (nil0) obj;
        return this.f23595a.equals(nil0Var.f23595a) && this.b.equals(nil0Var.b) && this.c.equals(nil0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.g(this.b, brm0.g(this.f23595a, Integer.hashCode(Integer.MAX_VALUE) * 31, 31), 31);
    }

    public final String toString() {
        return "List(marketLabelMaxLines=2147483647, marketLabelFontStyle=" + this.f23595a + ", coefficientLabelFontStyle=" + this.b + ", sportMarketColorScheme=" + this.c + Separators.RPAREN;
    }
}
