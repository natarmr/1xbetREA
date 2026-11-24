package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ghj implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11302a;
    public final boolean b;
    public final xqo c;

    public ghj(String str, boolean z, xqo xqoVar) {
        str.getClass();
        xqoVar.getClass();
        this.f11302a = str;
        this.b = z;
        this.c = xqoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghj)) {
            return false;
        }
        ghj ghjVar = (ghj) obj;
        return Intrinsics.d(this.f11302a, ghjVar.f11302a) && this.b == ghjVar.b && this.c == ghjVar.c;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof ghj) && (p6t0Var2 instanceof ghj) && ((ghj) p6t0Var).c == ((ghj) p6t0Var2).c;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f11302a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("DayExpressHeaderUiItem(title=", this.f11302a, ", visibleLiveBadge=", this.b, ", type=");
        sbU.append(this.c);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
