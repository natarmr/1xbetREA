package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class odx {
    public static final ndx Companion = new ndx();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f25097a;
    public final Integer b;
    public final Double c;
    public final String d;

    public /* synthetic */ odx(int i, Integer num, Integer num2, Double d, String str) {
        if ((i & 1) == 0) {
            this.f25097a = null;
        } else {
            this.f25097a = num;
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
        if (!(obj instanceof odx)) {
            return false;
        }
        odx odxVar = (odx) obj;
        return Intrinsics.d(this.f25097a, odxVar.f25097a) && Intrinsics.d(this.b, odxVar.b) && Intrinsics.d(this.c, odxVar.c) && Intrinsics.d(this.d, odxVar.d);
    }

    public final int hashCode() {
        Integer num = this.f25097a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("InnStatsResponse(team=", this.f25097a, ", wickets=", this.b, ", over=");
        sbQ.append(this.c);
        sbQ.append(", overStr=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
