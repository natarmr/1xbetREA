package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class rg5 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30416a;
    public final double b;
    public final String c;
    public final String d;
    public final boolean e;

    public rg5(long j, double d, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f30416a = j;
        this.b = d;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg5)) {
            return false;
        }
        rg5 rg5Var = (rg5) obj;
        return this.f30416a == rg5Var.f30416a && Double.compare(this.b, rg5Var.b) == 0 && Intrinsics.d(this.c, rg5Var.c) && Intrinsics.d(this.d, rg5Var.d) && this.e == rg5Var.e;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof rg5) && (p6t0Var2 instanceof rg5) && ((rg5) p6t0Var).f30416a == ((rg5) p6t0Var2).f30416a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(ua80.b(brm0.d(this.b, Long.hashCode(this.f30416a) * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f30416a, "BalanceItemUiModel(id=", ", money=");
        hne.w(sbQ, this.b, ", name=", this.c);
        w6x.z(", currencySymbol=", this.d, ", promo=", sbQ, this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
