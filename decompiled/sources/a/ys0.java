package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ys0 {
    public static final xs0 Companion = new xs0();
    public static final a8z[] p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f43145a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final String e;
    public final String f;
    public final List g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final List l;
    public final Boolean m;
    public final Boolean n;
    public final Boolean o;

    static {
        wez wezVar = wez.f39042a;
        p = new a8z[]{null, null, null, null, null, null, maz.a(wezVar, new mg0((byte) 9)), null, null, null, null, maz.a(wezVar, new mg0((byte) 10)), null, null, null};
    }

    public /* synthetic */ ys0(int i, Long l, Long l2, Long l3, Long l4, String str, String str2, List list, String str3, String str4, String str5, String str6, List list2, Boolean bool, Boolean bool2, Boolean bool3) {
        if ((i & 1) == 0) {
            this.f43145a = null;
        } else {
            this.f43145a = l;
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
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str4;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str5;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str6;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = list2;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys0)) {
            return false;
        }
        ys0 ys0Var = (ys0) obj;
        return Intrinsics.d(this.f43145a, ys0Var.f43145a) && Intrinsics.d(this.b, ys0Var.b) && Intrinsics.d(this.c, ys0Var.c) && Intrinsics.d(this.d, ys0Var.d) && Intrinsics.d(this.e, ys0Var.e) && Intrinsics.d(this.f, ys0Var.f) && Intrinsics.d(this.g, ys0Var.g) && Intrinsics.d(this.h, ys0Var.h) && Intrinsics.d(this.i, ys0Var.i) && Intrinsics.d(this.j, ys0Var.j) && Intrinsics.d(this.k, ys0Var.k) && Intrinsics.d(this.l, ys0Var.l) && Intrinsics.d(this.m, ys0Var.m) && Intrinsics.d(this.n, ys0Var.n) && Intrinsics.d(this.o, ys0Var.o);
    }

    public final int hashCode() {
        Long l = this.f43145a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.d;
        int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.g;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.k;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List list2 = this.l;
        int iHashCode12 = (iHashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.m;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.n;
        int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.o;
        return iHashCode14 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f43145a, this.b, "AggregatorGameBrandData(id=", ", providerId=", ", productId=");
        cs0.A(sbO, this.c, ", brandId=", this.d, ", brandName=");
        f140.v(sbO, this.e, ", name=", this.f, ", ribbons=");
        h97.y(", logoUrl=", this.h, ", imgWebpPath=", sbO, this.g);
        f140.v(sbO, this.i, ", imgVerticalPath=", this.j, ", imgVerticalWebpPath=");
        cs0.y(this.k, ", categories=", ", isDemoAvailable=", sbO, this.l);
        defpackage.c.j(sbO, this.m, ", noLoyalty=", this.n, ", needTransfer=");
        return defpackage.c.e(sbO, this.o, Separators.RPAREN);
    }
}
