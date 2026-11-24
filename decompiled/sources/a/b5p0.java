package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class b5p0 {
    public static final a5p0 Companion = new a5p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f2015a;
    public final Integer b;
    public final Integer c;

    public /* synthetic */ b5p0(int i, Integer num, Integer num2, Integer num3) {
        if ((i & 1) == 0) {
            this.f2015a = null;
        } else {
            this.f2015a = num;
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
        if (!(obj instanceof b5p0)) {
            return false;
        }
        b5p0 b5p0Var = (b5p0) obj;
        return Intrinsics.d(this.f2015a, b5p0Var.f2015a) && Intrinsics.d(this.b, b5p0Var.b) && Intrinsics.d(this.c, b5p0Var.c);
    }

    public final int hashCode() {
        Integer num = this.f2015a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return dw9.q(hne.q("TeamCardStatsResponse(penaltiesConceded=", this.f2015a, ", redCards=", this.b, ", yellowCards="), this.c, Separators.RPAREN);
    }
}
