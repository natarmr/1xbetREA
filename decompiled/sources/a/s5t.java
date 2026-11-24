package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class s5t {
    public static final r5t Companion = new r5t();
    public final lwm0 A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f31670a;
    public final Integer b;
    public final Long c;
    public final Long d;
    public final String e;
    public final Long f;
    public final Integer g;
    public final String h;
    public final String i;
    public final Integer j;
    public final String k;
    public final String l;
    public final Boolean m;
    public final Long n;
    public final Integer o;
    public final Boolean p;
    public final Boolean q;
    public final Boolean r;
    public final rkl0 s;
    public final u3n0 t;
    public final emz u;
    public final d380 v;
    public final d380 w;
    public final o480 x;
    public final ta30 y;
    public final lv10 z;

    static {
        kwm0 kwm0Var = lwm0.Companion;
        kv10 kv10Var = lv10.Companion;
        s280 s280Var = d380.Companion;
    }

    public /* synthetic */ s5t(int i, Long l, Integer num, Long l2, Long l3, String str, Long l4, Integer num2, String str2, String str3, Integer num3, String str4, String str5, Boolean bool, Long l5, Integer num4, Boolean bool2, Boolean bool3, Boolean bool4, rkl0 rkl0Var, u3n0 u3n0Var, emz emzVar, d380 d380Var, d380 d380Var2, o480 o480Var, ta30 ta30Var, lv10 lv10Var, lwm0 lwm0Var) {
        if ((i & 1) == 0) {
            this.f31670a = null;
        } else {
            this.f31670a = l;
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
            this.j = num3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str4;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str5;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = bool;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = l5;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = num4;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = bool2;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = bool3;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = bool4;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = rkl0Var;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = u3n0Var;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = emzVar;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = d380Var;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = d380Var2;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = o480Var;
        }
        if ((16777216 & i) == 0) {
            this.y = null;
        } else {
            this.y = ta30Var;
        }
        if ((33554432 & i) == 0) {
            this.z = null;
        } else {
            this.z = lv10Var;
        }
        if ((i & 67108864) == 0) {
            this.A = null;
        } else {
            this.A = lwm0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5t)) {
            return false;
        }
        s5t s5tVar = (s5t) obj;
        return Intrinsics.d(this.f31670a, s5tVar.f31670a) && Intrinsics.d(this.b, s5tVar.b) && Intrinsics.d(this.c, s5tVar.c) && Intrinsics.d(this.d, s5tVar.d) && Intrinsics.d(this.e, s5tVar.e) && Intrinsics.d(this.f, s5tVar.f) && Intrinsics.d(this.g, s5tVar.g) && Intrinsics.d(this.h, s5tVar.h) && Intrinsics.d(this.i, s5tVar.i) && Intrinsics.d(this.j, s5tVar.j) && Intrinsics.d(this.k, s5tVar.k) && Intrinsics.d(this.l, s5tVar.l) && Intrinsics.d(this.m, s5tVar.m) && Intrinsics.d(this.n, s5tVar.n) && Intrinsics.d(this.o, s5tVar.o) && Intrinsics.d(this.p, s5tVar.p) && Intrinsics.d(this.q, s5tVar.q) && Intrinsics.d(this.r, s5tVar.r) && Intrinsics.d(this.s, s5tVar.s) && Intrinsics.d(this.t, s5tVar.t) && Intrinsics.d(this.u, s5tVar.u) && Intrinsics.d(this.v, s5tVar.v) && Intrinsics.d(this.w, s5tVar.w) && Intrinsics.d(this.x, s5tVar.x) && Intrinsics.d(this.y, s5tVar.y) && Intrinsics.d(this.z, s5tVar.z) && Intrinsics.d(this.A, s5tVar.A);
    }

    public final int hashCode() {
        Long l = this.f31670a;
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
        Integer num3 = this.j;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.k;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.l;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.m;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l5 = this.n;
        int iHashCode14 = (iHashCode13 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Integer num4 = this.o;
        int iHashCode15 = (iHashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool2 = this.p;
        int iHashCode16 = (iHashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.q;
        int iHashCode17 = (iHashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.r;
        int iHashCode18 = (iHashCode17 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        rkl0 rkl0Var = this.s;
        int iHashCode19 = (iHashCode18 + (rkl0Var == null ? 0 : rkl0Var.hashCode())) * 31;
        u3n0 u3n0Var = this.t;
        int iHashCode20 = (iHashCode19 + (u3n0Var == null ? 0 : u3n0Var.hashCode())) * 31;
        emz emzVar = this.u;
        int iHashCode21 = (iHashCode20 + (emzVar == null ? 0 : emzVar.hashCode())) * 31;
        d380 d380Var = this.v;
        int iHashCode22 = (iHashCode21 + (d380Var == null ? 0 : d380Var.hashCode())) * 31;
        d380 d380Var2 = this.w;
        int iHashCode23 = (iHashCode22 + (d380Var2 == null ? 0 : d380Var2.hashCode())) * 31;
        o480 o480Var = this.x;
        int iHashCode24 = (iHashCode23 + (o480Var == null ? 0 : o480Var.hashCode())) * 31;
        ta30 ta30Var = this.y;
        int iHashCode25 = (iHashCode24 + (ta30Var == null ? 0 : ta30Var.hashCode())) * 31;
        lv10 lv10Var = this.z;
        int iHashCode26 = (iHashCode25 + (lv10Var == null ? 0 : lv10Var.hashCode())) * 31;
        lwm0 lwm0Var = this.A;
        return iHashCode26 + (lwm0Var != null ? lwm0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = cs0.q(this.b, this.f31670a, "GamesForCouponResponse(id=", ", num=", ", mainGameId=");
        cs0.A(sbQ, this.c, ", constId=", this.d, ", fullName=");
        h97.w(this.f, this.e, ", startTs=", ", countryId=", sbQ);
        b1j.u(this.g, ", gameTypeName=", this.h, ", dopInfo=", sbQ);
        axq.x(this.j, this.i, ", period=", ", periodName=", sbQ);
        f140.v(sbQ, this.k, ", gameVidName=", this.l, ", isFinal=");
        sbQ.append(this.m);
        sbQ.append(", mainConstId=");
        sbQ.append(this.n);
        sbQ.append(", kind=");
        brm0.z(this.p, this.o, ", hasHeadToHead=", ", subscriptionAvailable=", sbQ);
        defpackage.c.j(sbQ, this.q, ", nonStarted=", this.r, ", sportResponse=");
        sbQ.append(this.s);
        sbQ.append(", subSportResponse=");
        sbQ.append(this.t);
        sbQ.append(", ligaResponse=");
        sbQ.append(this.u);
        sbQ.append(", opponent1Response=");
        sbQ.append(this.v);
        sbQ.append(", opponent2Response=");
        sbQ.append(this.w);
        sbQ.append(", opponentsResponse=");
        sbQ.append(this.x);
        sbQ.append(", matchInfoResponse=");
        sbQ.append(this.y);
        sbQ.append(", mainGameScoresResponse=");
        sbQ.append(this.z);
        sbQ.append(", subGameScores=");
        sbQ.append(this.A);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
