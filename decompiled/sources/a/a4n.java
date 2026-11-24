package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a4n implements d4n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f232a;
    public final int b;
    public final y9q0 c;
    public final y9q0 d;
    public final ahl0 e;

    public a4n(a4x a4xVar, ahl0 ahl0Var, int i) {
        this(a4xVar, (i & 2) != 0 ? Integer.MAX_VALUE : 1, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), new y9q0(0L, qmk.r, null, j1t0.f15753a, 0L, null, 0, 0, qmk.F, 16646109), ahl0Var);
    }

    @Override // a.d4n
    public final a4x a() {
        return this.f232a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4n)) {
            return false;
        }
        a4n a4nVar = (a4n) obj;
        return Intrinsics.d(this.f232a, a4nVar.f232a) && this.b == a4nVar.b && Intrinsics.d(this.c, a4nVar.c) && Intrinsics.d(this.d, a4nVar.d) && Intrinsics.d(this.e, a4nVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.g(this.d, brm0.g(this.c, twn.a(this.b, this.f232a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "FilledS(markets=" + this.f232a + ", marketLabelMaxLines=" + this.b + ", marketLabelFontStyle=" + this.c + ", coefficientLabelFontStyle=" + this.d + ", sportMarketColorScheme=" + this.e + Separators.RPAREN;
    }

    public a4n(a4x a4xVar, int i, y9q0 y9q0Var, y9q0 y9q0Var2, ahl0 ahl0Var) {
        a4xVar.getClass();
        y9q0Var.getClass();
        y9q0Var2.getClass();
        ahl0Var.getClass();
        this.f232a = a4xVar;
        this.b = i;
        this.c = y9q0Var;
        this.d = y9q0Var2;
        this.e = ahl0Var;
    }
}
