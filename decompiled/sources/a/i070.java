package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class i070 {
    public static final h070 Companion = new h070();
    public static final a8z[] o = {maz.a(wez.f39042a, new fq60(17)), null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13936a;
    public final Integer b;
    public final Double c;
    public final String d;
    public final hcs e;
    public final Long f;
    public final Boolean g;
    public final Boolean h;
    public final Boolean i;
    public final Boolean j;
    public final Boolean k;
    public final Boolean l;
    public final Boolean m;
    public final Boolean n;

    public /* synthetic */ i070(int i, List list, Integer num, Double d, String str, hcs hcsVar, Long l, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8) {
        if ((i & 1) == 0) {
            this.f13936a = null;
        } else {
            this.f13936a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
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
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = hcsVar;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = bool3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = bool4;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = bool5;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = bool6;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = bool7;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = bool8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i070)) {
            return false;
        }
        i070 i070Var = (i070) obj;
        return Intrinsics.d(this.f13936a, i070Var.f13936a) && Intrinsics.d(this.b, i070Var.b) && Intrinsics.d(this.c, i070Var.c) && Intrinsics.d(this.d, i070Var.d) && this.e == i070Var.e && Intrinsics.d(this.f, i070Var.f) && Intrinsics.d(this.g, i070Var.g) && Intrinsics.d(this.h, i070Var.h) && Intrinsics.d(this.i, i070Var.i) && Intrinsics.d(this.j, i070Var.j) && Intrinsics.d(this.k, i070Var.k) && Intrinsics.d(this.l, i070Var.l) && Intrinsics.d(this.m, i070Var.m) && Intrinsics.d(this.n, i070Var.n);
    }

    public final int hashCode() {
        List list = this.f13936a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        hcs hcsVar = this.e;
        int iHashCode5 = (iHashCode4 + (hcsVar == null ? 0 : hcsVar.hashCode())) * 31;
        Long l = this.f;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.g;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.h;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.i;
        int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.j;
        int iHashCode10 = (iHashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.k;
        int iHashCode11 = (iHashCode10 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.l;
        int iHashCode12 = (iHashCode11 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.m;
        int iHashCode13 = (iHashCode12 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.n;
        return iHashCode13 + (bool8 != null ? bool8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = cs0.r(this.b, "GP(applyCategories=", ", gameNameId=", ", maxCoef=", this.f13936a);
        ua80.w(sbR, this.c, ", information=", this.d, ", gameFlag=");
        sbR.append(this.e);
        sbR.append(", gameId=");
        sbR.append(this.f);
        sbR.append(", isGameWithCashback=");
        defpackage.c.j(sbR, this.g, ", isBonusAllowedFromSecondaryAccount=", this.h, ", availableGameFromBonusAcc=");
        defpackage.c.j(sbR, this.i, ", forceIFrame=", this.j, ", bonusAllowed=");
        defpackage.c.j(sbR, this.k, ", demoModeAvailable=", this.l, ", underMaintenance=");
        sbR.append(this.m);
        sbR.append(", fullScreenEnable=");
        sbR.append(this.n);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
