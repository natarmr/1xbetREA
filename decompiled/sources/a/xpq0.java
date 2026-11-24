package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class xpq0 {
    public static final wpq0 Companion = new wpq0();
    public static final a8z[] m = {null, null, null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new joq0(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f41281a;
    public final Long b;
    public final String c;
    public final Long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Integer i;
    public final Integer j;
    public final Double k;
    public final List l;

    public /* synthetic */ xpq0(int i, Integer num, Long l, String str, Long l2, String str2, String str3, String str4, String str5, Integer num2, Integer num3, Double d, List list) {
        if ((i & 1) == 0) {
            this.f41281a = null;
        } else {
            this.f41281a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str5;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = d;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpq0)) {
            return false;
        }
        xpq0 xpq0Var = (xpq0) obj;
        return Intrinsics.d(this.f41281a, xpq0Var.f41281a) && Intrinsics.d(this.b, xpq0Var.b) && Intrinsics.d(this.c, xpq0Var.c) && Intrinsics.d(this.d, xpq0Var.d) && Intrinsics.d(this.e, xpq0Var.e) && Intrinsics.d(this.f, xpq0Var.f) && Intrinsics.d(this.g, xpq0Var.g) && Intrinsics.d(this.h, xpq0Var.h) && Intrinsics.d(this.i, xpq0Var.i) && Intrinsics.d(this.j, xpq0Var.j) && Intrinsics.d(this.k, xpq0Var.k) && Intrinsics.d(this.l, xpq0Var.l);
    }

    public final int hashCode() {
        Integer num = this.f41281a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.i;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.j;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Double d = this.k;
        int iHashCode11 = (iHashCode10 + (d == null ? 0 : d.hashCode())) * 31;
        List list = this.l;
        return iHashCode11 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = h97.m(this.f41281a, this.b, "TirageGameResponse(number=", ", startDate=", ", score=");
        h97.w(this.d, this.c, ", sportId=", ", firstOpponent=", sbM);
        f140.v(sbM, this.e, ", secondOpponent=", this.f, ", firstOpponentLogoUrl=");
        f140.v(sbM, this.g, ", secondOpponentLogoUrl=", this.h, ", period=");
        rz4.y(sbM, this.i, ", eventResults=", this.j, ", total=");
        sbM.append(this.k);
        sbM.append(", betPercentsList=");
        sbM.append(this.l);
        sbM.append(Separators.RPAREN);
        return sbM.toString();
    }
}
