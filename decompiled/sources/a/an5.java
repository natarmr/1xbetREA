package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class an5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ke f1134a;
    public final boolean b;
    public final ql5 c;
    public final g40 d;
    public final boolean e;

    public an5(ke keVar, boolean z, ql5 ql5Var, g40 g40Var, boolean z2) {
        ql5Var.getClass();
        this.f1134a = keVar;
        this.b = z;
        this.c = ql5Var;
        this.d = g40Var;
        this.e = z2;
    }

    public static an5 a(an5 an5Var, g40 g40Var) {
        ke keVar = an5Var.f1134a;
        boolean z = an5Var.b;
        ql5 ql5Var = an5Var.c;
        boolean z2 = an5Var.e;
        ql5Var.getClass();
        return new an5(keVar, z, ql5Var, g40Var, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an5)) {
            return false;
        }
        an5 an5Var = (an5) obj;
        return this.f1134a.equals(an5Var.f1134a) && this.b == an5Var.b && Intrinsics.d(this.c, an5Var.c) && this.d.equals(an5Var.d) && this.e == an5Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + brm0.e(this.f1134a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BalanceStateModel(accountInfo=");
        sb.append(this.f1134a);
        sb.append(", isCanChangeBalance=");
        sb.append(this.b);
        sb.append(", currentBalance=");
        sb.append(this.c);
        sb.append(", advanceStateModel=");
        sb.append(this.d);
        sb.append(", isLoading=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
