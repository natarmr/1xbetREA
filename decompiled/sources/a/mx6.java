package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mx6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8q0 f22537a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public mx6(a8q0 a8q0Var, String str, boolean z, boolean z2, boolean z3) {
        a8q0Var.getClass();
        str.getClass();
        this.f22537a = a8q0Var;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx6)) {
            return false;
        }
        mx6 mx6Var = (mx6) obj;
        return Intrinsics.d(this.f22537a, mx6Var.f22537a) && Intrinsics.d(this.b, mx6Var.b) && this.c == mx6Var.c && this.d == mx6Var.d && this.e == mx6Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(brm0.e(ua80.b(this.f22537a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetFieldUiState(betValue=");
        sb.append(this.f22537a);
        sb.append(", betValuePlaceholder=");
        sb.append(this.b);
        sb.append(", isNeedResetOnFocus=");
        ua80.u(", needShowSupportingText=", ", isEachWay=", sb, this.c, this.d);
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
