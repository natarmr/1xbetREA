package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bn5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ke f2865a;
    public final boolean b;
    public final ql5 c;
    public final boolean d;

    public bn5(ke keVar, boolean z, ql5 ql5Var, boolean z2) {
        ql5Var.getClass();
        this.f2865a = keVar;
        this.b = z;
        this.c = ql5Var;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn5)) {
            return false;
        }
        bn5 bn5Var = (bn5) obj;
        return this.f2865a.equals(bn5Var.f2865a) && this.b == bn5Var.b && Intrinsics.d(this.c, bn5Var.c) && this.d == bn5Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + brm0.e(this.f2865a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "BalanceStateModel(accountInfo=" + this.f2865a + ", isCanChangeBalance=" + this.b + ", currentBalance=" + this.c + ", isLoading=" + this.d + Separators.RPAREN;
    }
}
