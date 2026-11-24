package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y3n implements d4n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f41960a;
    public final y9q0 b;
    public final y9q0 c;
    public final zgl0 d;

    public y3n(a4x a4xVar, y9q0 y9q0Var, y9q0 y9q0Var2, zgl0 zgl0Var) {
        a4xVar.getClass();
        this.f41960a = a4xVar;
        this.b = y9q0Var;
        this.c = y9q0Var2;
        this.d = zgl0Var;
    }

    @Override // a.d4n
    public final a4x a() {
        return this.f41960a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3n)) {
            return false;
        }
        y3n y3nVar = (y3n) obj;
        return Intrinsics.d(this.f41960a, y3nVar.f41960a) && this.b.equals(y3nVar.b) && this.c.equals(y3nVar.c) && this.d.equals(y3nVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.g(this.c, brm0.g(this.b, twn.a(1, this.f41960a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "FilledCompact(markets=" + this.f41960a + ", marketLabelMaxLines=1, marketLabelFontStyle=" + this.b + ", coefficientLabelFontStyle=" + this.c + ", sportMarketColorScheme=" + this.d + Separators.RPAREN;
    }
}
