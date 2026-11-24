package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class tb7 {
    public static final sb7 Companion = new sb7();
    public static final a8z[] o = {null, null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new t07(17)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f33648a;
    public final Long b;
    public final Integer c;
    public final Double d;
    public final Integer e;
    public final Long f;
    public final String g;
    public final Double h;
    public final String i;
    public final String j;
    public final List k;
    public final Double l;
    public final Double m;
    public final Integer n;

    public /* synthetic */ tb7(int i, Integer num, Long l, Integer num2, Double d, Integer num3, Long l2, String str, Double d2, String str2, String str3, List list, Double d3, Double d4, Integer num4) {
        if ((i & 1) == 0) {
            this.f33648a = null;
        } else {
            this.f33648a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = d2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = list;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = d3;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = d4;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = num4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb7)) {
            return false;
        }
        tb7 tb7Var = (tb7) obj;
        return Intrinsics.d(this.f33648a, tb7Var.f33648a) && Intrinsics.d(this.b, tb7Var.b) && Intrinsics.d(this.c, tb7Var.c) && Intrinsics.d(this.d, tb7Var.d) && Intrinsics.d(this.e, tb7Var.e) && Intrinsics.d(this.f, tb7Var.f) && Intrinsics.d(this.g, tb7Var.g) && Intrinsics.d(this.h, tb7Var.h) && Intrinsics.d(this.i, tb7Var.i) && Intrinsics.d(this.j, tb7Var.j) && Intrinsics.d(this.k, tb7Var.k) && Intrinsics.d(this.l, tb7Var.l) && Intrinsics.d(this.m, tb7Var.m) && Intrinsics.d(this.n, tb7Var.n);
    }

    public final int hashCode() {
        Integer num = this.f33648a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.d;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num3 = this.e;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.g;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Double d2 = this.h;
        int iHashCode8 = (iHashCode7 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.k;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        Double d3 = this.l;
        int iHashCode12 = (iHashCode11 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.m;
        int iHashCode13 = (iHashCode12 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Integer num4 = this.n;
        return iHashCode13 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = h97.m(this.f33648a, this.b, "BetInfoResponse(betDate=", ", betId=", ", betStatus=");
        hne.z(sbM, this.c, ", betSum=", this.d, ", betSystemType=");
        cs0.w(this.e, this.f, ", betTypeId=", ", betTypeName=", sbM);
        sbM.append(this.g);
        sbM.append(", coef=");
        sbM.append(this.h);
        sbM.append(", coefView=");
        f140.v(sbM, this.i, ", currencyCode=", this.j, ", eventResponses=");
        sbM.append(this.k);
        sbM.append(", possiblePayoutSum=");
        sbM.append(this.l);
        sbM.append(", possibleWinSum=");
        sbM.append(this.m);
        sbM.append(", unixGameStartDate=");
        sbM.append(this.n);
        sbM.append(Separators.RPAREN);
        return sbM.toString();
    }
}
