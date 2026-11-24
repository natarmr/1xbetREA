package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class qic0 {
    public static final oic0 Companion = new oic0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28785a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Long e;
    public final String f;
    public final Integer g;
    public final Long h;
    public final Boolean i;
    public final Boolean j;
    public final Boolean k;

    public /* synthetic */ qic0(int i, String str, String str2, String str3, Integer num, Long l, String str4, Integer num2, Long l2, Boolean bool, Boolean bool2, Boolean bool3) {
        if ((i & 1) == 0) {
            this.f28785a = null;
        } else {
            this.f28785a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l2;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qic0)) {
            return false;
        }
        qic0 qic0Var = (qic0) obj;
        return Intrinsics.d(this.f28785a, qic0Var.f28785a) && Intrinsics.d(this.b, qic0Var.b) && Intrinsics.d(this.c, qic0Var.c) && Intrinsics.d(this.d, qic0Var.d) && Intrinsics.d(this.e, qic0Var.e) && Intrinsics.d(this.f, qic0Var.f) && Intrinsics.d(this.g, qic0Var.g) && Intrinsics.d(this.h, qic0Var.h) && Intrinsics.d(this.i, qic0Var.i) && Intrinsics.d(this.j, qic0Var.j) && Intrinsics.d(this.k, qic0Var.k);
    }

    public final int hashCode() {
        String str = this.f28785a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.e;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.g;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l2 = this.h;
        int iHashCode8 = (iHashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.i;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.j;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.k;
        return iHashCode10 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PromoGameResponse(imgPathDefault=", this.f28785a, ", imgPathDarkTheme=", this.b, ", imgPathLightTheme=");
        axq.x(this.d, this.c, ", error=", ", gameId=", sbN);
        rz4.v(this.e, ", gameName=", this.f, ", providerId=", sbN);
        cs0.w(this.g, this.h, ", productId=", ", needTransfer=", sbN);
        defpackage.c.j(sbN, this.i, ", hasDemo=", this.j, ", bonusWageringBan=");
        return defpackage.c.e(sbN, this.k, Separators.RPAREN);
    }
}
