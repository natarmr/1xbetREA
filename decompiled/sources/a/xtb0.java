package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xtb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f41458a;
    public final boolean b;
    public final String c;

    public xtb0(double d, String str, boolean z) {
        this.f41458a = d;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xtb0)) {
            return false;
        }
        xtb0 xtb0Var = (xtb0) obj;
        return Double.compare(this.f41458a, xtb0Var.f41458a) == 0 && this.b == xtb0Var.b && Intrinsics.d(this.c, xtb0Var.c);
    }

    public final int hashCode() {
        int iE = brm0.e(Double.hashCode(this.f41458a) * 31, 31, this.b);
        String str = this.c;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrepareMakeBetStateModel(betSum=");
        sb.append(this.f41458a);
        sb.append(", isApprovedBet=");
        sb.append(this.b);
        return rw2.o(sb, ", promoCode=", this.c, Separators.RPAREN);
    }
}
