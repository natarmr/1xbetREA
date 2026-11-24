package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b4n implements d4n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f1966a;
    public final int b;
    public final y9q0 c;
    public final y9q0 d;
    public final ahl0 e;

    /* JADX WARN: Illegal instructions before constructor call */
    public b4n(a4x a4xVar, zgl0 zgl0Var, int i) {
        int i2 = (i & 2) != 0 ? Integer.MAX_VALUE : 1;
        qrq qrqVar = j1t0.c;
        long j = qmk.q;
        long j2 = qmk.D;
        this(a4xVar, i2, new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, j2, 16646109), new y9q0(0L, j, null, j1t0.f15753a, 0L, null, 0, 0, j2, 16646109), zgl0Var);
    }

    @Override // a.d4n
    public final a4x a() {
        return this.f1966a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4n)) {
            return false;
        }
        b4n b4nVar = (b4n) obj;
        return Intrinsics.d(this.f1966a, b4nVar.f1966a) && this.b == b4nVar.b && Intrinsics.d(this.c, b4nVar.c) && Intrinsics.d(this.d, b4nVar.d) && Intrinsics.d(this.e, b4nVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.g(this.d, brm0.g(this.c, twn.a(this.b, this.f1966a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "FilledUnited(markets=" + this.f1966a + ", marketLabelMaxLines=" + this.b + ", marketLabelFontStyle=" + this.c + ", coefficientLabelFontStyle=" + this.d + ", sportMarketColorScheme=" + this.e + Separators.RPAREN;
    }

    public b4n(a4x a4xVar, int i, y9q0 y9q0Var, y9q0 y9q0Var2, ahl0 ahl0Var) {
        a4xVar.getClass();
        y9q0Var.getClass();
        y9q0Var2.getClass();
        ahl0Var.getClass();
        this.f1966a = a4xVar;
        this.b = i;
        this.c = y9q0Var;
        this.d = y9q0Var2;
        this.e = ahl0Var;
    }
}
