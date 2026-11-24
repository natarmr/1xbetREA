package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sx6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7m0 f32959a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public sx6(l7m0 l7m0Var, String str, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.f32959a = l7m0Var;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx6)) {
            return false;
        }
        sx6 sx6Var = (sx6) obj;
        return this.f32959a.equals(sx6Var.f32959a) && Intrinsics.d(this.b, sx6Var.b) && this.c == sx6Var.c && this.d == sx6Var.d && this.e == sx6Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(brm0.e(ua80.b(this.f32959a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BetFieldUiState(betValue=");
        sb.append(this.f32959a);
        sb.append(", betValuePlaceholder=");
        sb.append(this.b);
        sb.append(", isNeedResetOnFocus=");
        ua80.u(", needShowSupportingText=", ", isEachWay=", sb, this.c, this.d);
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
