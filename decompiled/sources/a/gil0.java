package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gil0 implements hil0, qil0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11354a;
    public final y9q0 b;
    public final y9q0 c;
    public final ahl0 d;

    public gil0(int i, y9q0 y9q0Var, y9q0 y9q0Var2, zgl0 zgl0Var, int i2) {
        this((i2 & 1) != 0 ? Integer.MAX_VALUE : i, (i2 & 2) != 0 ? new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109) : y9q0Var, (i2 & 4) != 0 ? new y9q0(0L, qmk.r, null, j1t0.f15753a, 0L, null, 0, 0, qmk.F, 16646109) : y9q0Var2, zgl0Var);
    }

    @Override // a.qil0
    public final y9q0 a() {
        return this.c;
    }

    @Override // a.qil0
    public final int b() {
        return this.f11354a;
    }

    @Override // a.qil0
    public final ahl0 c() {
        return this.d;
    }

    @Override // a.qil0
    public final y9q0 e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gil0)) {
            return false;
        }
        gil0 gil0Var = (gil0) obj;
        return this.f11354a == gil0Var.f11354a && Intrinsics.d(this.b, gil0Var.b) && Intrinsics.d(this.c, gil0Var.c) && Intrinsics.d(this.d, gil0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.g(this.c, brm0.g(this.b, Integer.hashCode(this.f11354a) * 31, 31), 31);
    }

    public final String toString() {
        return "Row(marketLabelMaxLines=" + this.f11354a + ", marketLabelFontStyle=" + this.b + ", coefficientLabelFontStyle=" + this.c + ", sportMarketColorScheme=" + this.d + Separators.RPAREN;
    }

    public gil0(int i, y9q0 y9q0Var, y9q0 y9q0Var2, ahl0 ahl0Var) {
        y9q0Var.getClass();
        y9q0Var2.getClass();
        ahl0Var.getClass();
        this.f11354a = i;
        this.b = y9q0Var;
        this.c = y9q0Var2;
        this.d = ahl0Var;
    }
}
