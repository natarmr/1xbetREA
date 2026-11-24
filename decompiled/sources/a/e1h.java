package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class e1h {
    public static final d1h Companion = new d1h();
    public static final a8z[] r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f7035a;
    public final String b;
    public final Integer c;
    public final String d;
    public final Integer e;
    public final Integer f;
    public final Long g;
    public final Integer h;
    public final List i;
    public final o1h j;
    public final List k;
    public final Long l;
    public final Boolean m;
    public final Boolean n;
    public final Boolean o;
    public final Integer p;
    public final Integer q;

    static {
        wez wezVar = wez.f39042a;
        r = new a8z[]{null, null, null, null, null, null, null, null, maz.a(wezVar, new xng((byte) 25)), null, maz.a(wezVar, new xng((byte) 26)), null, null, null, null, null, null};
    }

    public /* synthetic */ e1h(int i, Integer num, String str, Integer num2, String str2, Integer num3, Integer num4, Long l, Integer num5, List list, o1h o1hVar, List list2, Long l2, Boolean bool, Boolean bool2, Boolean bool3, Integer num6, Integer num7) {
        if ((i & 1) == 0) {
            this.f7035a = null;
        } else {
            this.f7035a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num5;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = o1hVar;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = list2;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = l2;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = bool;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = bool2;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = bool3;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = num6;
        }
        if ((i & 65536) == 0) {
            this.q = null;
        } else {
            this.q = num7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1h)) {
            return false;
        }
        e1h e1hVar = (e1h) obj;
        return Intrinsics.d(this.f7035a, e1hVar.f7035a) && Intrinsics.d(this.b, e1hVar.b) && Intrinsics.d(this.c, e1hVar.c) && Intrinsics.d(this.d, e1hVar.d) && Intrinsics.d(this.e, e1hVar.e) && Intrinsics.d(this.f, e1hVar.f) && Intrinsics.d(this.g, e1hVar.g) && Intrinsics.d(this.h, e1hVar.h) && Intrinsics.d(this.i, e1hVar.i) && Intrinsics.d(this.j, e1hVar.j) && Intrinsics.d(this.k, e1hVar.k) && Intrinsics.d(this.l, e1hVar.l) && Intrinsics.d(this.m, e1hVar.m) && Intrinsics.d(this.n, e1hVar.n) && Intrinsics.d(this.o, e1hVar.o) && Intrinsics.d(this.p, e1hVar.p) && Intrinsics.d(this.q, e1hVar.q);
    }

    public final int hashCode() {
        Integer num = this.f7035a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.e;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l = this.g;
        int iHashCode7 = (iHashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num5 = this.h;
        int iHashCode8 = (iHashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        List list = this.i;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        o1h o1hVar = this.j;
        int iHashCode10 = (iHashCode9 + (o1hVar == null ? 0 : o1hVar.hashCode())) * 31;
        List list2 = this.k;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l2 = this.l;
        int iHashCode12 = (iHashCode11 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.m;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.n;
        int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.o;
        int iHashCode15 = (iHashCode14 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num6 = this.p;
        int iHashCode16 = (iHashCode15 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.q;
        return iHashCode16 + (num7 != null ? num7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f7035a, "CyberHeroesStatisticResponse(heroId=", ", heroName=", this.b, ", level=");
        b1j.u(this.c, ", playerName=", this.d, ", positionX=", sbN);
        rz4.y(sbN, this.e, ", positionY=", this.f, ", respawnTimer=");
        brm0.A(this.h, this.g, ", ultimateState=", ", equipmentIds=", sbN);
        sbN.append(this.i);
        sbN.append(", heroStatistic=");
        sbN.append(this.j);
        sbN.append(", heroAbility=");
        sbN.append(this.k);
        sbN.append(", aegisTimer=");
        sbN.append(this.l);
        sbN.append(", hasAghanimsScepter=");
        defpackage.c.j(sbN, this.m, ", hasAghanimsShard=", this.n, ", hasAegis=");
        h97.u(this.o, this.p, ", buyBack=", ", neutralItem=", sbN);
        return dw9.q(sbN, this.q, Separators.RPAREN);
    }
}
