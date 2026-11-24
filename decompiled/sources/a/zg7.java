package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class zg7 {
    public static final vg7 Companion = new vg7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f44330a;
    public final Integer b;
    public final Long c;
    public final Long d;
    public final String e;
    public final Long f;
    public final Integer g;
    public final String h;
    public final String i;
    public final Long j;
    public final Integer k;
    public final Boolean l;
    public final dmz m;
    public final qkl0 n;
    public final t3n0 o;
    public final c380 p;
    public final c380 q;
    public final e8p r;
    public final Boolean s;
    public final e6h0 t;
    public final yg7 u;

    static {
        r280 r280Var = c380.Companion;
    }

    public /* synthetic */ zg7(int i, Long l, Integer num, Long l2, Long l3, String str, Long l4, Integer num2, String str2, String str3, Long l5, Integer num3, Boolean bool, dmz dmzVar, qkl0 qkl0Var, t3n0 t3n0Var, c380 c380Var, c380 c380Var2, e8p e8pVar, Boolean bool2, e6h0 e6h0Var, yg7 yg7Var) {
        if ((i & 1) == 0) {
            this.f44330a = null;
        } else {
            this.f44330a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = l5;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = num3;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = bool;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = dmzVar;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = qkl0Var;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = t3n0Var;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = c380Var;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = c380Var2;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = e8pVar;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = bool2;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = e6h0Var;
        }
        if ((i & 1048576) == 0) {
            this.u = null;
        } else {
            this.u = yg7Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg7)) {
            return false;
        }
        zg7 zg7Var = (zg7) obj;
        return Intrinsics.d(this.f44330a, zg7Var.f44330a) && Intrinsics.d(this.b, zg7Var.b) && Intrinsics.d(this.c, zg7Var.c) && Intrinsics.d(this.d, zg7Var.d) && Intrinsics.d(this.e, zg7Var.e) && Intrinsics.d(this.f, zg7Var.f) && Intrinsics.d(this.g, zg7Var.g) && Intrinsics.d(this.h, zg7Var.h) && Intrinsics.d(this.i, zg7Var.i) && Intrinsics.d(this.j, zg7Var.j) && Intrinsics.d(this.k, zg7Var.k) && Intrinsics.d(this.l, zg7Var.l) && Intrinsics.d(this.m, zg7Var.m) && Intrinsics.d(this.n, zg7Var.n) && Intrinsics.d(this.o, zg7Var.o) && Intrinsics.d(this.p, zg7Var.p) && Intrinsics.d(this.q, zg7Var.q) && Intrinsics.d(this.r, zg7Var.r) && Intrinsics.d(this.s, zg7Var.s) && Intrinsics.d(this.t, zg7Var.t) && Intrinsics.d(this.u, zg7Var.u);
    }

    public final int hashCode() {
        Long l = this.f44330a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.d;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Long l4 = this.f;
        int iHashCode6 = (iHashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Integer num2 = this.g;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.h;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l5 = this.j;
        int iHashCode10 = (iHashCode9 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Integer num3 = this.k;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.l;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        dmz dmzVar = this.m;
        int iHashCode13 = (iHashCode12 + (dmzVar == null ? 0 : dmzVar.hashCode())) * 31;
        qkl0 qkl0Var = this.n;
        int iHashCode14 = (iHashCode13 + (qkl0Var == null ? 0 : qkl0Var.hashCode())) * 31;
        t3n0 t3n0Var = this.o;
        int iHashCode15 = (iHashCode14 + (t3n0Var == null ? 0 : t3n0Var.hashCode())) * 31;
        c380 c380Var = this.p;
        int iHashCode16 = (iHashCode15 + (c380Var == null ? 0 : c380Var.hashCode())) * 31;
        c380 c380Var2 = this.q;
        int iHashCode17 = (iHashCode16 + (c380Var2 == null ? 0 : c380Var2.hashCode())) * 31;
        e8p e8pVar = this.r;
        int iHashCode18 = (iHashCode17 + (e8pVar == null ? 0 : e8pVar.hashCode())) * 31;
        Boolean bool2 = this.s;
        int iHashCode19 = (iHashCode18 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        e6h0 e6h0Var = this.t;
        int iHashCode20 = (iHashCode19 + (e6h0Var == null ? 0 : e6h0Var.hashCode())) * 31;
        yg7 yg7Var = this.u;
        return iHashCode20 + (yg7Var != null ? yg7Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = cs0.q(this.b, this.f44330a, "BetOnFavoriteEventResponse(id=", ", num=", ", mainGameId=");
        cs0.A(sbQ, this.c, ", constId=", this.d, ", fullName=");
        h97.w(this.f, this.e, ", startTs=", ", countryId=", sbQ);
        b1j.u(this.g, ", gameTypeName=", this.h, ", periodName=", sbQ);
        h97.w(this.j, this.i, ", mainConstId=", ", kind=", sbQ);
        brm0.z(this.l, this.k, ", subscriptionAvailable=", ", liga=", sbQ);
        sbQ.append(this.m);
        sbQ.append(", sport=");
        sbQ.append(this.n);
        sbQ.append(", subSport=");
        sbQ.append(this.o);
        sbQ.append(", opponent1=");
        sbQ.append(this.p);
        sbQ.append(", opponent2=");
        sbQ.append(this.q);
        sbQ.append(", event=");
        sbQ.append(this.r);
        sbQ.append(", homeAwayFlag=");
        sbQ.append(this.s);
        sbQ.append(", scores=");
        sbQ.append(this.t);
        sbQ.append(", eventParamsResponse=");
        sbQ.append(this.u);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
