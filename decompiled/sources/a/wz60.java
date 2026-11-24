package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class wz60 {
    public static final vz60 Companion = new vz60();
    public static final a8z[] q = {null, null, null, null, null, null, null, maz.a(wez.f39042a, new fq60(13)), null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f40009a;
    public final Integer b;
    public final hcs c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;
    public final String g;
    public final List h;
    public final Double i;
    public final Boolean j;
    public final Boolean k;
    public final Boolean l;
    public final Boolean m;
    public final Boolean n;
    public final String o;
    public final String p;

    public /* synthetic */ wz60(int i, Integer num, Integer num2, hcs hcsVar, Boolean bool, Boolean bool2, Boolean bool3, String str, List list, Double d, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f40009a = null;
        } else {
            this.f40009a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = hcsVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = list;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = d;
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
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str2;
        }
        if ((i & 32768) == 0) {
            this.p = null;
        } else {
            this.p = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz60)) {
            return false;
        }
        wz60 wz60Var = (wz60) obj;
        return Intrinsics.d(this.f40009a, wz60Var.f40009a) && Intrinsics.d(this.b, wz60Var.b) && this.c == wz60Var.c && Intrinsics.d(this.d, wz60Var.d) && Intrinsics.d(this.e, wz60Var.e) && Intrinsics.d(this.f, wz60Var.f) && Intrinsics.d(this.g, wz60Var.g) && Intrinsics.d(this.h, wz60Var.h) && Intrinsics.d(this.i, wz60Var.i) && Intrinsics.d(this.j, wz60Var.j) && Intrinsics.d(this.k, wz60Var.k) && Intrinsics.d(this.l, wz60Var.l) && Intrinsics.d(this.m, wz60Var.m) && Intrinsics.d(this.n, wz60Var.n) && Intrinsics.d(this.o, wz60Var.o) && Intrinsics.d(this.p, wz60Var.p);
    }

    public final int hashCode() {
        Integer num = this.f40009a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        hcs hcsVar = this.c;
        int iHashCode3 = (iHashCode2 + (hcsVar == null ? 0 : hcsVar.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.g;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.h;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Double d = this.i;
        int iHashCode9 = (iHashCode8 + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool4 = this.j;
        int iHashCode10 = (iHashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.k;
        int iHashCode11 = (iHashCode10 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.l;
        int iHashCode12 = (iHashCode11 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.m;
        int iHashCode13 = (iHashCode12 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.n;
        int iHashCode14 = (iHashCode13 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        String str2 = this.o;
        int iHashCode15 = (iHashCode14 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.p;
        return iHashCode15 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("GamePreview(gameType=", this.f40009a, ", gameNameTranslateId=", this.b, ", gameFlag=");
        sbQ.append(this.c);
        sbQ.append(", gameCashBack=");
        sbQ.append(this.d);
        sbQ.append(", bonusEnabled=");
        defpackage.c.j(sbQ, this.e, ", bonusAccEnabled=", this.f, ", clientData=");
        cs0.y(this.g, ", categories=", ", maxWinCoeff=", sbQ, this.h);
        sbQ.append(this.i);
        sbQ.append(", bonusFromAddAcc=");
        sbQ.append(this.j);
        sbQ.append(", isDemoAvailable=");
        defpackage.c.j(sbQ, this.k, ", forceIFrame=", this.l, ", underMaintenance=");
        defpackage.c.j(sbQ, this.m, ", fullScreen=", this.n, ", route=");
        return ua80.m(sbQ, this.o, ", oldRoute=", this.p, Separators.RPAREN);
    }
}
