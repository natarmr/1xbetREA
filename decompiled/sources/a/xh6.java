package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class xh6 {
    public static final wh6 Companion = new wh6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f40872a;
    public final Integer b;
    public final Double c;
    public final String d;

    public /* synthetic */ xh6(int i, Integer num, Integer num2, Double d, String str) {
        if ((i & 1) == 0) {
            this.f40872a = null;
        } else {
            this.f40872a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh6)) {
            return false;
        }
        xh6 xh6Var = (xh6) obj;
        return Intrinsics.d(this.f40872a, xh6Var.f40872a) && Intrinsics.d(this.b, xh6Var.b) && Intrinsics.d(this.c, xh6Var.c) && Intrinsics.d(this.d, xh6Var.d);
    }

    public final int hashCode() {
        Integer num = this.f40872a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("BetBuilderInnsStatsResponse(team=", this.f40872a, ", wickets=", this.b, ", over=");
        sbQ.append(this.c);
        sbQ.append(", overStr=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
