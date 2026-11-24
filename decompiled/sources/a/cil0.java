package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cil0 implements eil0, mil0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4422a;
    public final y9q0 b;
    public final y9q0 c;
    public final ahl0 d;

    public cil0(int i, y9q0 y9q0Var, y9q0 y9q0Var2, ahl0 ahl0Var) {
        y9q0Var.getClass();
        y9q0Var2.getClass();
        ahl0Var.getClass();
        this.f4422a = i;
        this.b = y9q0Var;
        this.c = y9q0Var2;
        this.d = ahl0Var;
    }

    @Override // a.qil0
    public final y9q0 a() {
        return this.c;
    }

    @Override // a.qil0
    public final int b() {
        return this.f4422a;
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
        if (!(obj instanceof cil0)) {
            return false;
        }
        cil0 cil0Var = (cil0) obj;
        return this.f4422a == cil0Var.f4422a && Intrinsics.d(this.b, cil0Var.b) && Intrinsics.d(this.c, cil0Var.c) && Intrinsics.d(this.d, cil0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.g(this.c, brm0.g(this.b, Integer.hashCode(this.f4422a) * 31, 31), 31);
    }

    public final String toString() {
        return "List(marketLabelMaxLines=" + this.f4422a + ", marketLabelFontStyle=" + this.b + ", coefficientLabelFontStyle=" + this.c + ", sportMarketColorScheme=" + this.d + Separators.RPAREN;
    }
}
