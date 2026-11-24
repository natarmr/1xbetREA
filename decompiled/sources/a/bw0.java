package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class bw0 {
    public static final aw0 Companion = new aw0();
    public static final a8z[] q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f3301a;
    public final Long b;
    public final rx0 c;
    public final String d;
    public final List e;
    public final lx0 f;
    public final ox0 g;
    public final List h;
    public final Boolean i;
    public final Boolean j;
    public final Boolean k;
    public final ex0 l;
    public final Long m;
    public final Boolean n;
    public final String o;
    public final Long p;

    static {
        nx0 nx0Var = ox0.Companion;
        wez wezVar = wez.f39042a;
        q = new a8z[]{null, null, null, null, maz.a(wezVar, new mg0((byte) 17)), null, null, maz.a(wezVar, new mg0((byte) 18)), null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ bw0(int i, Long l, Long l2, rx0 rx0Var, String str, List list, lx0 lx0Var, ox0 ox0Var, List list2, Boolean bool, Boolean bool2, Boolean bool3, ex0 ex0Var, Long l3, Boolean bool4, String str2, Long l4) {
        if ((i & 1) == 0) {
            this.f3301a = null;
        } else {
            this.f3301a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = rx0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = lx0Var;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = ox0Var;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = list2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = bool;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = bool2;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = bool3;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = ex0Var;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = l3;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = bool4;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str2;
        }
        if ((i & 32768) == 0) {
            this.p = null;
        } else {
            this.p = l4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw0)) {
            return false;
        }
        bw0 bw0Var = (bw0) obj;
        return Intrinsics.d(this.f3301a, bw0Var.f3301a) && Intrinsics.d(this.b, bw0Var.b) && Intrinsics.d(this.c, bw0Var.c) && Intrinsics.d(this.d, bw0Var.d) && Intrinsics.d(this.e, bw0Var.e) && Intrinsics.d(this.f, bw0Var.f) && Intrinsics.d(this.g, bw0Var.g) && Intrinsics.d(this.h, bw0Var.h) && Intrinsics.d(this.i, bw0Var.i) && Intrinsics.d(this.j, bw0Var.j) && Intrinsics.d(this.k, bw0Var.k) && Intrinsics.d(this.l, bw0Var.l) && Intrinsics.d(this.m, bw0Var.m) && Intrinsics.d(this.n, bw0Var.n) && Intrinsics.d(this.o, bw0Var.o) && Intrinsics.d(this.p, bw0Var.p);
    }

    public final int hashCode() {
        Long l = this.f3301a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        rx0 rx0Var = this.c;
        int iHashCode3 = (iHashCode2 + (rx0Var == null ? 0 : rx0Var.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        lx0 lx0Var = this.f;
        int iHashCode6 = (iHashCode5 + (lx0Var == null ? 0 : lx0Var.hashCode())) * 31;
        ox0 ox0Var = this.g;
        int iHashCode7 = (iHashCode6 + (ox0Var == null ? 0 : ox0Var.hashCode())) * 31;
        List list2 = this.h;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.i;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.j;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.k;
        int iHashCode11 = (iHashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        ex0 ex0Var = this.l;
        int iHashCode12 = (iHashCode11 + (ex0Var == null ? 0 : ex0Var.hashCode())) * 31;
        Long l3 = this.m;
        int iHashCode13 = (iHashCode12 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool4 = this.n;
        int iHashCode14 = (iHashCode13 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.o;
        int iHashCode15 = (iHashCode14 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l4 = this.p;
        return iHashCode15 + (l4 != null ? l4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f3301a, this.b, "AggregatorGameResponse(id=", ", providerId=", ", product=");
        sbO.append(this.c);
        sbO.append(", name=");
        sbO.append(this.d);
        sbO.append(", ribbons=");
        sbO.append(this.e);
        sbO.append(", images=");
        sbO.append(this.f);
        sbO.append(", liveGamesSettings=");
        sbO.append(this.g);
        sbO.append(", categories=");
        sbO.append(this.h);
        sbO.append(", isDemoAvailable=");
        defpackage.c.j(sbO, this.i, ", needTransfer=", this.j, ", noLoyalty=");
        sbO.append(this.k);
        sbO.append(", brand=");
        sbO.append(this.l);
        sbO.append(", partId=");
        sbO.append(this.m);
        sbO.append(", isTest=");
        sbO.append(this.n);
        sbO.append(", nameForUrl=");
        sbO.append(this.o);
        sbO.append(", lastPlayedAt=");
        sbO.append(this.p);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
