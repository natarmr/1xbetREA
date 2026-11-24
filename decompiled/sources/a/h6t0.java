package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class h6t0 {
    public static final g6t0 Companion = new g6t0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f12545a;
    public final String b;
    public final String c;
    public final Long d;

    public /* synthetic */ h6t0(int i, Integer num, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f12545a = null;
        } else {
            this.f12545a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6t0)) {
            return false;
        }
        h6t0 h6t0Var = (h6t0) obj;
        return Intrinsics.d(this.f12545a, h6t0Var.f12545a) && Intrinsics.d(this.b, h6t0Var.b) && Intrinsics.d(this.c, h6t0Var.c) && Intrinsics.d(this.d, h6t0Var.d);
    }

    public final int hashCode() {
        Integer num = this.f12545a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.d;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f12545a, "UfcRoundResponse(round=", ", winnerName=", this.b, ", typeOfWin=");
        sbN.append(this.c);
        sbN.append(", time=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
