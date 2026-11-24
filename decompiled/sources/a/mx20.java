package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class mx20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22534a;
    public final float b;
    public final long c;
    public final long d;

    public mx20(long j, float f, float f2, long j2) {
        this.f22534a = f;
        this.b = f2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx20)) {
            return false;
        }
        mx20 mx20Var = (mx20) obj;
        return Float.compare(this.f22534a, mx20Var.f22534a) == 0 && Float.compare(this.b, mx20Var.b) == 0 && this.c == mx20Var.c && this.d == mx20Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + rw2.b(defpackage.c.a(Float.hashCode(this.f22534a) * 31, this.b, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbS = dw9.s(this.f22534a, this.b, "MarketStatisticInfoModel(startCoef=", ", endCoef=", ", startDate=");
        sbS.append(this.c);
        return rw2.n(sbS, this.d, ", endDate=", Separators.RPAREN);
    }
}
