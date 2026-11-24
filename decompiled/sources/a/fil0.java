package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fil0 implements hil0, mil0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y9q0 f9594a;
    public final y9q0 b;
    public final zgl0 c;

    public fil0(y9q0 y9q0Var, y9q0 y9q0Var2, zgl0 zgl0Var) {
        this.f9594a = y9q0Var;
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
        return this.f9594a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fil0)) {
            return false;
        }
        fil0 fil0Var = (fil0) obj;
        return this.f9594a.equals(fil0Var.f9594a) && this.b.equals(fil0Var.b) && this.c.equals(fil0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.g(this.b, brm0.g(this.f9594a, Integer.hashCode(Integer.MAX_VALUE) * 31, 31), 31);
    }

    public final String toString() {
        return "List(marketLabelMaxLines=2147483647, marketLabelFontStyle=" + this.f9594a + ", coefficientLabelFontStyle=" + this.b + ", sportMarketColorScheme=" + this.c + Separators.RPAREN;
    }
}
