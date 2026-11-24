package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class b02 {
    public static final a02 Companion = new a02();
    public static final a8z[] l = {null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new c51(26)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f1748a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final Long f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final List j;
    public final Boolean k;

    public /* synthetic */ b02(int i, Long l2, String str, String str2, String str3, Long l3, Long l4, Integer num, Integer num2, Integer num3, List list, Boolean bool) {
        if ((i & 1) == 0) {
            this.f1748a = null;
        } else {
            this.f1748a = l2;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b02)) {
            return false;
        }
        b02 b02Var = (b02) obj;
        return Intrinsics.d(this.f1748a, b02Var.f1748a) && Intrinsics.d(this.b, b02Var.b) && Intrinsics.d(this.c, b02Var.c) && Intrinsics.d(this.d, b02Var.d) && Intrinsics.d(this.e, b02Var.e) && Intrinsics.d(this.f, b02Var.f) && Intrinsics.d(this.g, b02Var.g) && Intrinsics.d(this.h, b02Var.h) && Intrinsics.d(this.i, b02Var.i) && Intrinsics.d(this.j, b02Var.j) && Intrinsics.d(this.k, b02Var.k);
    }

    public final int hashCode() {
        Long l2 = this.f1748a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l3 = this.e;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f;
        int iHashCode6 = (iHashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Integer num = this.g;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.h;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.i;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List list = this.j;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.k;
        return iHashCode10 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f1748a, "AggregatorWebGameRawResponse(id=", ", logoUrl=", this.b, ", name=");
        f140.v(sbS, this.c, ", productName=", this.d, ", providerId=");
        cs0.A(sbS, this.e, ", productId=", this.f, ", freeSpins=");
        rz4.y(sbS, this.g, ", newGame=", this.h, ", promo=");
        cs0.z(sbS, this.i, ", category=", this.j, ", noLoyalty=");
        return defpackage.c.e(sbS, this.k, Separators.RPAREN);
    }
}
