package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class bbm0 {
    public static final abm0 Companion = new abm0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2315a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;

    public /* synthetic */ bbm0(int i, Integer num, Integer num2, Integer num3, Integer num4, String str) {
        if ((i & 1) == 0) {
            this.f2315a = null;
        } else {
            this.f2315a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbm0)) {
            return false;
        }
        bbm0 bbm0Var = (bbm0) obj;
        return Intrinsics.d(this.f2315a, bbm0Var.f2315a) && Intrinsics.d(this.b, bbm0Var.b) && Intrinsics.d(this.c, bbm0Var.c) && Intrinsics.d(this.d, bbm0Var.d) && Intrinsics.d(this.e, bbm0Var.e);
    }

    public final int hashCode() {
        String str = this.f2315a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.e;
        return iHashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = axq.p(this.b, "StatisticByYearResponse(season=", this.f2315a, ", shootingPerc=", ", pronePerc=");
        rz4.y(sbP, this.c, ", standingPerc=", this.d, ", skiingPerc=");
        return dw9.q(sbP, this.e, Separators.RPAREN);
    }
}
