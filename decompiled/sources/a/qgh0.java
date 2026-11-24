package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class qgh0 {
    public static final pgh0 Companion = new pgh0();
    public static final a8z[] r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f28684a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Boolean h;
    public final Long i;
    public final List j;
    public final List k;
    public final List l;
    public final Boolean m;
    public final String n;
    public final Boolean o;
    public final Integer p;
    public final String q;

    static {
        wez wezVar = wez.f39042a;
        r = new a8z[]{null, null, null, null, null, null, null, null, null, maz.a(wezVar, new igh0((byte) 2)), maz.a(wezVar, new igh0((byte) 3)), maz.a(wezVar, new igh0((byte) 4)), null, null, null, null, null};
    }

    public /* synthetic */ qgh0(int i, Long l, Long l2, String str, String str2, String str3, String str4, String str5, Boolean bool, Long l3, List list, List list2, List list3, Boolean bool2, String str6, Boolean bool3, Integer num, String str7) {
        if ((i & 1) == 0) {
            this.f28684a = null;
        } else {
            this.f28684a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = l3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = list2;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = list3;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = bool2;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str6;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = bool3;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = num;
        }
        if ((i & 65536) == 0) {
            this.q = null;
        } else {
            this.q = str7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgh0)) {
            return false;
        }
        qgh0 qgh0Var = (qgh0) obj;
        return Intrinsics.d(this.f28684a, qgh0Var.f28684a) && Intrinsics.d(this.b, qgh0Var.b) && Intrinsics.d(this.c, qgh0Var.c) && Intrinsics.d(this.d, qgh0Var.d) && Intrinsics.d(this.e, qgh0Var.e) && Intrinsics.d(this.f, qgh0Var.f) && Intrinsics.d(this.g, qgh0Var.g) && Intrinsics.d(this.h, qgh0Var.h) && Intrinsics.d(this.i, qgh0Var.i) && Intrinsics.d(this.j, qgh0Var.j) && Intrinsics.d(this.k, qgh0Var.k) && Intrinsics.d(this.l, qgh0Var.l) && Intrinsics.d(this.m, qgh0Var.m) && Intrinsics.d(this.n, qgh0Var.n) && Intrinsics.d(this.o, qgh0Var.o) && Intrinsics.d(this.p, qgh0Var.p) && Intrinsics.d(this.q, qgh0Var.q);
    }

    public final int hashCode() {
        Long l = this.f28684a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.h;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l3 = this.i;
        int iHashCode9 = (iHashCode8 + (l3 == null ? 0 : l3.hashCode())) * 31;
        List list = this.j;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.k;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.l;
        int iHashCode12 = (iHashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool2 = this.m;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str6 = this.n;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool3 = this.o;
        int iHashCode15 = (iHashCode14 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.p;
        int iHashCode16 = (iHashCode15 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.q;
        return iHashCode16 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f28684a, this.b, "GameSearch(id=", ", sportId=", ", statId=");
        f140.v(sbO, this.c, ", teamOne=", this.d, ", teamTwo=");
        f140.v(sbO, this.e, ", extraInfo=", this.f, ", score=");
        h97.v(this.h, this.g, ", subGame=", ", startDate=", sbO);
        twn.z(sbO, this.i, ", teamOneImages=", this.j, ", teamTwoImages=");
        b1j.y(", videoUrls=", ", hasSubGame=", sbO, this.k, this.l);
        defpackage.c.h(this.m, ", fullGameInfo=", this.n, ", homeAwayFlag=", sbO);
        h97.u(this.o, this.p, ", globalChampId=", ", status=", sbO);
        return axq.n(sbO, this.q, Separators.RPAREN);
    }
}
