package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nx6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8q0 f24267a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public nx6(a8q0 a8q0Var, String str, boolean z, boolean z2, boolean z3) {
        a8q0Var.getClass();
        str.getClass();
        this.f24267a = a8q0Var;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx6)) {
            return false;
        }
        nx6 nx6Var = (nx6) obj;
        return Intrinsics.d(this.f24267a, nx6Var.f24267a) && Intrinsics.d(this.b, nx6Var.b) && this.c == nx6Var.c && this.d == nx6Var.d && this.e == nx6Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(brm0.e(ua80.b(this.f24267a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetFieldUiState(betValue=");
        sb.append(this.f24267a);
        sb.append(", betValuePlaceholder=");
        sb.append(this.b);
        sb.append(", isNeedResetOnFocus=");
        ua80.u(", needShowSupportingText=", ", isEachWay=", sb, this.c, this.d);
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
