package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kil0 implements lil0, qil0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18345a;
    public final y9q0 b;
    public final y9q0 c;
    public final iil0 d;
    public final ahl0 e;

    public kil0(y9q0 y9q0Var, y9q0 y9q0Var2, zgl0 zgl0Var, int i) {
        this((i & 1) != 0 ? Integer.MAX_VALUE : 1, (i & 2) != 0 ? new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109) : y9q0Var, (i & 4) != 0 ? new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109) : y9q0Var2, new iil0(), zgl0Var);
    }

    @Override // a.qil0
    public final y9q0 a() {
        return this.c;
    }

    @Override // a.qil0
    public final int b() {
        return this.f18345a;
    }

    @Override // a.qil0
    public final ahl0 c() {
        return this.e;
    }

    @Override // a.lil0
    public final iil0 d() {
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
        if (!(obj instanceof kil0)) {
            return false;
        }
        kil0 kil0Var = (kil0) obj;
        return this.f18345a == kil0Var.f18345a && Intrinsics.d(this.b, kil0Var.b) && Intrinsics.d(this.c, kil0Var.c) && Intrinsics.d(this.d, kil0Var.d) && Intrinsics.d(this.e, kil0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + brm0.g(this.c, brm0.g(this.b, Integer.hashCode(this.f18345a) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "Row(marketLabelMaxLines=" + this.f18345a + ", marketLabelFontStyle=" + this.b + ", coefficientLabelFontStyle=" + this.c + ", corners=" + this.d + ", sportMarketColorScheme=" + this.e + Separators.RPAREN;
    }

    public kil0(int i, y9q0 y9q0Var, y9q0 y9q0Var2, iil0 iil0Var, ahl0 ahl0Var) {
        y9q0Var.getClass();
        y9q0Var2.getClass();
        ahl0Var.getClass();
        this.f18345a = i;
        this.b = y9q0Var;
        this.c = y9q0Var2;
        this.d = iil0Var;
        this.e = ahl0Var;
    }
}
