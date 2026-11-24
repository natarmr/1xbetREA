package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lnb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20336a;
    public final String b;
    public final String c;

    public lnb0(boolean z, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f20336a = z;
        this.b = str;
        this.c = str2;
    }

    public static lnb0 a(lnb0 lnb0Var, boolean z, String str, String str2, int i) {
        if ((i & 1) != 0) {
            z = lnb0Var.f20336a;
        }
        if ((i & 2) != 0) {
            str = lnb0Var.b;
        }
        if ((i & 4) != 0) {
            str2 = lnb0Var.c;
        }
        str.getClass();
        str2.getClass();
        return new lnb0(z, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnb0)) {
            return false;
        }
        lnb0 lnb0Var = (lnb0) obj;
        return this.f20336a == lnb0Var.f20336a && Intrinsics.d(this.b, lnb0Var.b) && Intrinsics.d(this.c, lnb0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Boolean.hashCode(this.f20336a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(axq.q("PossibleWinStateModel(isVisible=", ", title=", this.b, this.f20336a, ", value="), this.c, Separators.RPAREN);
    }
}
