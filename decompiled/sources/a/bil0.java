package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class bil0 implements qil0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y9q0 f2664a;
    public final y9q0 b;
    public final zgl0 c;

    public bil0(y9q0 y9q0Var, y9q0 y9q0Var2, zgl0 zgl0Var) {
        this.f2664a = y9q0Var;
        this.b = y9q0Var2;
        this.c = zgl0Var;
    }

    @Override // a.qil0
    public final y9q0 a() {
        return this.b;
    }

    @Override // a.qil0
    public final int b() {
        return 1;
    }

    @Override // a.qil0
    public final ahl0 c() {
        return this.c;
    }

    @Override // a.qil0
    public final y9q0 e() {
        return this.f2664a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bil0)) {
            return false;
        }
        bil0 bil0Var = (bil0) obj;
        return this.f2664a.equals(bil0Var.f2664a) && this.b.equals(bil0Var.b) && this.c.equals(bil0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.g(this.b, brm0.g(this.f2664a, Integer.hashCode(1) * 31, 31), 31);
    }

    public final String toString() {
        return "FilledCompact(marketLabelMaxLines=1, marketLabelFontStyle=" + this.f2664a + ", coefficientLabelFontStyle=" + this.b + ", sportMarketColorScheme=" + this.c + Separators.RPAREN;
    }
}
