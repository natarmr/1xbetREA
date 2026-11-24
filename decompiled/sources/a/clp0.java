package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class clp0 {
    public static final blp0 Companion = new blp0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f4572a;
    public final Integer b;
    public final Integer c;

    public /* synthetic */ clp0(int i, Integer num, Integer num2, Integer num3) {
        if ((i & 1) == 0) {
            this.f4572a = null;
        } else {
            this.f4572a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clp0)) {
            return false;
        }
        clp0 clp0Var = (clp0) obj;
        return Intrinsics.d(this.f4572a, clp0Var.f4572a) && Intrinsics.d(this.b, clp0Var.b) && Intrinsics.d(this.c, clp0Var.c);
    }

    public final int hashCode() {
        Integer num = this.f4572a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return dw9.q(hne.q("TeamStat(goals=", this.f4572a, ", redCards=", this.b, ", yellowCards="), this.c, Separators.RPAREN);
    }
}
