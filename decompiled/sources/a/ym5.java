package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ym5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ke f42870a;
    public final boolean b;
    public final ql5 c;
    public final boolean d;

    public ym5(ke keVar, boolean z, ql5 ql5Var, boolean z2) {
        ql5Var.getClass();
        this.f42870a = keVar;
        this.b = z;
        this.c = ql5Var;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym5)) {
            return false;
        }
        ym5 ym5Var = (ym5) obj;
        return this.f42870a.equals(ym5Var.f42870a) && this.b == ym5Var.b && Intrinsics.d(this.c, ym5Var.c) && this.d == ym5Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + brm0.e(this.f42870a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "BalanceStateModel(accountInfo=" + this.f42870a + ", isCanChangeBalance=" + this.b + ", currentBalance=" + this.c + ", isLoading=" + this.d + Separators.RPAREN;
    }
}
