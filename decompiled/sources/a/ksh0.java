package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ksh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18813a;
    public final boolean b;
    public final int c;
    public final String d;
    public final String e;

    public ksh0(int i, int i2, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f18813a = i;
        this.b = z;
        this.c = i2;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksh0)) {
            return false;
        }
        ksh0 ksh0Var = (ksh0) obj;
        return this.f18813a == ksh0Var.f18813a && this.b == ksh0Var.b && this.c == ksh0Var.c && Intrinsics.d(this.d, ksh0Var.d) && Intrinsics.d(this.e, ksh0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(twn.a(this.c, brm0.e(Integer.hashCode(this.f18813a) * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbL = h97.l(this.f18813a, "SecurityProgressWidget(currentProgress=", ", securityProgressAvailable=", ", maxProgress=", this.b);
        kng0.w(this.c, ", title=", this.d, ", description=", sbL);
        return axq.n(sbL, this.e, Separators.RPAREN);
    }
}
