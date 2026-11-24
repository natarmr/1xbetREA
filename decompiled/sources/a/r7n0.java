package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class r7n0 {
    public static final q7n0 Companion = new q7n0();
    public static final a8z[] G;
    public final String A;
    public final Long B;
    public final Integer C;
    public final Boolean D;
    public final Integer E;
    public final List F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d9n0 f29986a;
    public final d9n0 b;
    public final a8n0 c;
    public final Long d;
    public final m8n0 e;
    public final m8n0 f;
    public final j8n0 g;
    public final Long h;
    public final List i;
    public final String j;
    public final Boolean k;
    public final String l;
    public final u8n0 m;
    public final Integer n;
    public final String o;
    public final String p;
    public final Boolean q;
    public final Long r;
    public final Boolean s;
    public final k9n0 t;
    public final Boolean u;
    public final gan0 v;
    public final Boolean w;
    public final Long x;
    public final Long y;
    public final Long z;

    static {
        j5h0 j5h0Var = l5h0.Companion;
        wez wezVar = wez.f39042a;
        G = new a8z[]{null, null, null, null, null, null, null, null, maz.a(wezVar, new a7n0((byte) 2)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new a7n0((byte) 3))};
    }

    public /* synthetic */ r7n0(int i, d9n0 d9n0Var, d9n0 d9n0Var2, a8n0 a8n0Var, Long l, m8n0 m8n0Var, m8n0 m8n0Var2, j8n0 j8n0Var, Long l2, List list, String str, Boolean bool, String str2, u8n0 u8n0Var, Integer num, String str3, String str4, Boolean bool2, Long l3, Boolean bool3, k9n0 k9n0Var, Boolean bool4, gan0 gan0Var, Boolean bool5, Long l4, Long l5, Long l6, String str5, Long l7, Integer num2, Boolean bool6, Integer num3, List list2) {
        if ((i & 1) == 0) {
            this.f29986a = null;
        } else {
            this.f29986a = d9n0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d9n0Var2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = a8n0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = m8n0Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = m8n0Var2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = j8n0Var;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = bool;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str2;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = u8n0Var;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = num;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str3;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = str4;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = bool2;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = l3;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = bool3;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = k9n0Var;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = bool4;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = gan0Var;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = bool5;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = l4;
        }
        if ((16777216 & i) == 0) {
            this.y = null;
        } else {
            this.y = l5;
        }
        if ((33554432 & i) == 0) {
            this.z = null;
        } else {
            this.z = l6;
        }
        if ((67108864 & i) == 0) {
            this.A = null;
        } else {
            this.A = str5;
        }
        if ((134217728 & i) == 0) {
            this.B = null;
        } else {
            this.B = l7;
        }
        if ((268435456 & i) == 0) {
            this.C = null;
        } else {
            this.C = num2;
        }
        if ((536870912 & i) == 0) {
            this.D = null;
        } else {
            this.D = bool6;
        }
        if ((1073741824 & i) == 0) {
            this.E = null;
        } else {
            this.E = num3;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.F = null;
        } else {
            this.F = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7n0)) {
            return false;
        }
        r7n0 r7n0Var = (r7n0) obj;
        return Intrinsics.d(this.f29986a, r7n0Var.f29986a) && Intrinsics.d(this.b, r7n0Var.b) && Intrinsics.d(this.c, r7n0Var.c) && Intrinsics.d(this.d, r7n0Var.d) && Intrinsics.d(this.e, r7n0Var.e) && Intrinsics.d(this.f, r7n0Var.f) && Intrinsics.d(this.g, r7n0Var.g) && Intrinsics.d(this.h, r7n0Var.h) && Intrinsics.d(this.i, r7n0Var.i) && Intrinsics.d(this.j, r7n0Var.j) && Intrinsics.d(this.k, r7n0Var.k) && Intrinsics.d(this.l, r7n0Var.l) && Intrinsics.d(this.m, r7n0Var.m) && Intrinsics.d(this.n, r7n0Var.n) && Intrinsics.d(this.o, r7n0Var.o) && Intrinsics.d(this.p, r7n0Var.p) && Intrinsics.d(this.q, r7n0Var.q) && Intrinsics.d(this.r, r7n0Var.r) && Intrinsics.d(this.s, r7n0Var.s) && Intrinsics.d(this.t, r7n0Var.t) && Intrinsics.d(this.u, r7n0Var.u) && Intrinsics.d(this.v, r7n0Var.v) && Intrinsics.d(this.w, r7n0Var.w) && Intrinsics.d(this.x, r7n0Var.x) && Intrinsics.d(this.y, r7n0Var.y) && Intrinsics.d(this.z, r7n0Var.z) && Intrinsics.d(this.A, r7n0Var.A) && Intrinsics.d(this.B, r7n0Var.B) && Intrinsics.d(this.C, r7n0Var.C) && Intrinsics.d(this.D, r7n0Var.D) && Intrinsics.d(this.E, r7n0Var.E) && Intrinsics.d(this.F, r7n0Var.F);
    }

    public final int hashCode() {
        d9n0 d9n0Var = this.f29986a;
        int iHashCode = (d9n0Var == null ? 0 : d9n0Var.hashCode()) * 31;
        d9n0 d9n0Var2 = this.b;
        int iHashCode2 = (iHashCode + (d9n0Var2 == null ? 0 : d9n0Var2.hashCode())) * 31;
        a8n0 a8n0Var = this.c;
        int iHashCode3 = (iHashCode2 + (a8n0Var == null ? 0 : a8n0Var.hashCode())) * 31;
        Long l = this.d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        m8n0 m8n0Var = this.e;
        int iHashCode5 = (iHashCode4 + (m8n0Var == null ? 0 : m8n0Var.hashCode())) * 31;
        m8n0 m8n0Var2 = this.f;
        int iHashCode6 = (iHashCode5 + (m8n0Var2 == null ? 0 : m8n0Var2.hashCode())) * 31;
        j8n0 j8n0Var = this.g;
        int iHashCode7 = (iHashCode6 + (j8n0Var == null ? 0 : j8n0Var.hashCode())) * 31;
        Long l2 = this.h;
        int iHashCode8 = (iHashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List list = this.i;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.j;
        int iHashCode10 = (iHashCode9 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.k;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.l;
        int iHashCode12 = (iHashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        u8n0 u8n0Var = this.m;
        int iHashCode13 = (iHashCode12 + (u8n0Var == null ? 0 : u8n0Var.hashCode())) * 31;
        Integer num = this.n;
        int iHashCode14 = (iHashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.o;
        int iHashCode15 = (iHashCode14 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.p;
        int iHashCode16 = (iHashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.q;
        int iHashCode17 = (iHashCode16 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l3 = this.r;
        int iHashCode18 = (iHashCode17 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool3 = this.s;
        int iHashCode19 = (iHashCode18 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        k9n0 k9n0Var = this.t;
        int iHashCode20 = (iHashCode19 + (k9n0Var == null ? 0 : k9n0Var.hashCode())) * 31;
        Boolean bool4 = this.u;
        int iHashCode21 = (iHashCode20 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        gan0 gan0Var = this.v;
        int iHashCode22 = (iHashCode21 + (gan0Var == null ? 0 : gan0Var.hashCode())) * 31;
        Boolean bool5 = this.w;
        int iHashCode23 = (iHashCode22 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Long l4 = this.x;
        int iHashCode24 = (iHashCode23 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.y;
        int iHashCode25 = (iHashCode24 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.z;
        int iHashCode26 = (iHashCode25 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str5 = this.A;
        int iHashCode27 = (iHashCode26 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l7 = this.B;
        int iHashCode28 = (iHashCode27 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Integer num2 = this.C;
        int iHashCode29 = (iHashCode28 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool6 = this.D;
        int iHashCode30 = (iHashCode29 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Integer num3 = this.E;
        int iHashCode31 = (iHashCode30 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List list2 = this.F;
        return iHashCode31 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionGameResponse(sport=");
        sb.append(this.f29986a);
        sb.append(", subSport=");
        sb.append(this.b);
        sb.append(", liga=");
        sb.append(this.c);
        sb.append(", startTs=");
        sb.append(this.d);
        sb.append(", opponent1=");
        sb.append(this.e);
        sb.append(", opponent2=");
        sb.append(this.f);
        sb.append(", matchInfoObj=");
        sb.append(this.g);
        sb.append(", id=");
        sb.append(this.h);
        sb.append(", eventGroups=");
        h97.y(", fullName=", this.j, ", isFinished=", sb, this.i);
        defpackage.c.h(this.k, ", dopInfo=", this.l, ", scores=", sb);
        sb.append(this.m);
        sb.append(", num=");
        sb.append(this.n);
        sb.append(", gameTypeName=");
        f140.v(sb, this.o, ", gameVidName=", this.p, ", homeAwayFlag=");
        sb.append(this.q);
        sb.append(", globalChampId=");
        sb.append(this.r);
        sb.append(", nonStarted=");
        sb.append(this.s);
        sb.append(", statisticInfo=");
        sb.append(this.t);
        sb.append(", subscriptionAvailable=");
        sb.append(this.u);
        sb.append(", video=");
        sb.append(this.v);
        sb.append(", isFinal=");
        sb.append(this.w);
        sb.append(", mainGameId=");
        sb.append(this.x);
        sb.append(", constId=");
        cs0.A(sb, this.y, ", countryId=", this.z, ", periodName=");
        h97.w(this.B, this.A, ", mainConstId=", ", kind=", sb);
        brm0.z(this.D, this.C, ", hasHeadToHead=", ", zonePlay=", sb);
        sb.append(this.E);
        sb.append(", subGamesForMainGame=");
        sb.append(this.F);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
