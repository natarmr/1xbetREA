package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pg f40720a;
    public final ql5 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public xe(pg pgVar, ql5 ql5Var, boolean z, boolean z2, boolean z3) {
        this.f40720a = pgVar;
        this.b = ql5Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe)) {
            return false;
        }
        xe xeVar = (xe) obj;
        return this.f40720a == xeVar.f40720a && Intrinsics.d(this.b, xeVar.b) && this.c == xeVar.c && this.d == xeVar.d && this.e == xeVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.f40720a.hashCode() * 31;
        ql5 ql5Var = this.b;
        return Boolean.hashCode(this.e) + brm0.e(brm0.e((iHashCode + (ql5Var == null ? 0 : ql5Var.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountItemModel(titleType=");
        sb.append(this.f40720a);
        sb.append(", balanceInfo=");
        sb.append(this.b);
        sb.append(", active=");
        ua80.u(", lastOfAccountType=", ", firstOfAccountType=", sb, this.c, this.d);
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
