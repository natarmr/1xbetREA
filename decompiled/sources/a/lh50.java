package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class lh50 {
    public static final kh50 Companion = new kh50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f20038a;
    public final Long b;
    public final Long c;
    public final String d;
    public final String e;
    public final Long f;

    public /* synthetic */ lh50(int i, Long l, Long l2, Long l3, String str, String str2, Long l4) {
        if ((i & 1) == 0) {
            this.f20038a = null;
        } else {
            this.f20038a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh50)) {
            return false;
        }
        lh50 lh50Var = (lh50) obj;
        return Intrinsics.d(this.f20038a, lh50Var.f20038a) && Intrinsics.d(this.b, lh50Var.b) && Intrinsics.d(this.c, lh50Var.c) && Intrinsics.d(this.d, lh50Var.d) && Intrinsics.d(this.e, lh50Var.e) && Intrinsics.d(this.f, lh50Var.f);
    }

    public final int hashCode() {
        Long l = this.f20038a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l4 = this.f;
        return iHashCode5 + (l4 != null ? l4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f20038a, this.b, "NearestGameDetailsPeriodScoreResponse(period=", ", scoreOpp1=", ", scoreOpp2=");
        rz4.v(this.c, ", periodName=", this.d, ", periodNameFull=", sbO);
        sbO.append(this.e);
        sbO.append(", winner=");
        sbO.append(this.f);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
