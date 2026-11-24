package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class qg50 {
    public static final pg50 Companion = new pg50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f28667a;
    public final Long b;
    public final Double c;
    public final String d;

    public /* synthetic */ qg50(int i, Long l, Long l2, Double d, String str) {
        if ((i & 1) == 0) {
            this.f28667a = null;
        } else {
            this.f28667a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
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
        if (!(obj instanceof qg50)) {
            return false;
        }
        qg50 qg50Var = (qg50) obj;
        return Intrinsics.d(this.f28667a, qg50Var.f28667a) && Intrinsics.d(this.b, qg50Var.b) && Intrinsics.d(this.c, qg50Var.c) && Intrinsics.d(this.d, qg50Var.d);
    }

    public final int hashCode() {
        Long l = this.f28667a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Double d = this.c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f28667a, this.b, "NearestGameDetailsInnsStatsResponse(team=", ", wickets=", ", over=");
        sbO.append(this.c);
        sbO.append(", overStr=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
