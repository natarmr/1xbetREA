package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class qh50 {
    public static final ph50 Companion = new ph50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f28723a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final ai50 f;
    public final ug50 g;
    public final hh50 h;
    public final hh50 i;
    public final yg50 j;
    public final Boolean k;
    public final String l;
    public final String m;
    public final ii50 n;
    public final wh50 o;

    static {
        vh50 vh50Var = wh50.Companion;
        gh50 gh50Var = hh50.Companion;
    }

    public /* synthetic */ qh50(int i, Long l, Long l2, Long l3, Long l4, Long l5, ai50 ai50Var, ug50 ug50Var, hh50 hh50Var, hh50 hh50Var2, yg50 yg50Var, Boolean bool, String str, String str2, ii50 ii50Var, wh50 wh50Var) {
        if ((i & 1) == 0) {
            this.f28723a = null;
        } else {
            this.f28723a = l;
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
            this.d = l4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = ai50Var;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = ug50Var;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = hh50Var;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = hh50Var2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = yg50Var;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = bool;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str2;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = ii50Var;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = wh50Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh50)) {
            return false;
        }
        qh50 qh50Var = (qh50) obj;
        return Intrinsics.d(this.f28723a, qh50Var.f28723a) && Intrinsics.d(this.b, qh50Var.b) && Intrinsics.d(this.c, qh50Var.c) && Intrinsics.d(this.d, qh50Var.d) && Intrinsics.d(this.e, qh50Var.e) && Intrinsics.d(this.f, qh50Var.f) && Intrinsics.d(this.g, qh50Var.g) && Intrinsics.d(this.h, qh50Var.h) && Intrinsics.d(this.i, qh50Var.i) && Intrinsics.d(this.j, qh50Var.j) && Intrinsics.d(this.k, qh50Var.k) && Intrinsics.d(this.l, qh50Var.l) && Intrinsics.d(this.m, qh50Var.m) && Intrinsics.d(this.n, qh50Var.n) && Intrinsics.d(this.o, qh50Var.o);
    }

    public final int hashCode() {
        Long l = this.f28723a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.d;
        int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.e;
        int iHashCode5 = (iHashCode4 + (l5 == null ? 0 : l5.hashCode())) * 31;
        ai50 ai50Var = this.f;
        int iHashCode6 = (iHashCode5 + (ai50Var == null ? 0 : ai50Var.hashCode())) * 31;
        ug50 ug50Var = this.g;
        int iHashCode7 = (iHashCode6 + (ug50Var == null ? 0 : ug50Var.hashCode())) * 31;
        hh50 hh50Var = this.h;
        int iHashCode8 = (iHashCode7 + (hh50Var == null ? 0 : hh50Var.hashCode())) * 31;
        hh50 hh50Var2 = this.i;
        int iHashCode9 = (iHashCode8 + (hh50Var2 == null ? 0 : hh50Var2.hashCode())) * 31;
        yg50 yg50Var = this.j;
        int iHashCode10 = (iHashCode9 + (yg50Var == null ? 0 : yg50Var.hashCode())) * 31;
        Boolean bool = this.k;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.l;
        int iHashCode12 = (iHashCode11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.m;
        int iHashCode13 = (iHashCode12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ii50 ii50Var = this.n;
        int iHashCode14 = (iHashCode13 + (ii50Var == null ? 0 : ii50Var.hashCode())) * 31;
        wh50 wh50Var = this.o;
        return iHashCode14 + (wh50Var != null ? wh50Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f28723a, this.b, "NearestGameDetailsResponse(id=", ", num=", ", constId=");
        cs0.A(sbO, this.c, ", startTs=", this.d, ", kind=");
        sbO.append(this.e);
        sbO.append(", sport=");
        sbO.append(this.f);
        sbO.append(", liga=");
        sbO.append(this.g);
        sbO.append(", firstOpponent=");
        sbO.append(this.h);
        sbO.append(", secondOpponent=");
        sbO.append(this.i);
        sbO.append(", matchInfo=");
        sbO.append(this.j);
        sbO.append(", isFinished=");
        defpackage.c.h(this.k, ", gameVidName=", this.l, ", dopInfo=", sbO);
        sbO.append(this.m);
        sbO.append(", subSport=");
        sbO.append(this.n);
        sbO.append(", scores=");
        sbO.append(this.o);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
