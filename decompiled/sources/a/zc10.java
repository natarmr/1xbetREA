package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class zc10 {
    public static final yc10 Companion = new yc10();
    public static final a8z[] l = {null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new t010((byte) 27)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f44146a;
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

    public /* synthetic */ zc10(int i, Long l2, String str, String str2, String str3, Long l3, Long l4, Integer num, Integer num2, Integer num3, List list, Boolean bool) {
        if ((i & 1) == 0) {
            this.f44146a = null;
        } else {
            this.f44146a = l2;
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
        if (!(obj instanceof zc10)) {
            return false;
        }
        zc10 zc10Var = (zc10) obj;
        return Intrinsics.d(this.f44146a, zc10Var.f44146a) && Intrinsics.d(this.b, zc10Var.b) && Intrinsics.d(this.c, zc10Var.c) && Intrinsics.d(this.d, zc10Var.d) && Intrinsics.d(this.e, zc10Var.e) && Intrinsics.d(this.f, zc10Var.f) && Intrinsics.d(this.g, zc10Var.g) && Intrinsics.d(this.h, zc10Var.h) && Intrinsics.d(this.i, zc10Var.i) && Intrinsics.d(this.j, zc10Var.j) && Intrinsics.d(this.k, zc10Var.k);
    }

    public final int hashCode() {
        Long l2 = this.f44146a;
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
        StringBuilder sbS = cs0.s(this.f44146a, "LottoGameResponse(id=", ", logoUrl=", this.b, ", name=");
        f140.v(sbS, this.c, ", productName=", this.d, ", providerId=");
        cs0.A(sbS, this.e, ", productId=", this.f, ", freeSpins=");
        rz4.y(sbS, this.g, ", newGame=", this.h, ", promo=");
        cs0.z(sbS, this.i, ", category=", this.j, ", noLoyalty=");
        return defpackage.c.e(sbS, this.k, Separators.RPAREN);
    }
}
