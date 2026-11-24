package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class j84 {
    public static final i84 Companion = new i84();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16068a;
    public final String b;
    public final Long c;
    public final String d;
    public final String e;
    public final Integer f;
    public final String g;
    public final String h;
    public final Integer i;
    public final Boolean j;
    public final Boolean k;

    public /* synthetic */ j84(int i, String str, String str2, Long l, String str3, String str4, Integer num, String str5, String str6, Integer num2, Boolean bool, Boolean bool2) {
        if ((i & 1) == 0) {
            this.f16068a = null;
        } else {
            this.f16068a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str6;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = bool;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = bool2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j84)) {
            return false;
        }
        j84 j84Var = (j84) obj;
        return Intrinsics.d(this.f16068a, j84Var.f16068a) && Intrinsics.d(this.b, j84Var.b) && Intrinsics.d(this.c, j84Var.c) && Intrinsics.d(this.d, j84Var.d) && Intrinsics.d(this.e, j84Var.e) && Intrinsics.d(this.f, j84Var.f) && Intrinsics.d(this.g, j84Var.g) && Intrinsics.d(this.h, j84Var.h) && Intrinsics.d(this.i, j84Var.i) && Intrinsics.d(this.j, j84Var.j) && Intrinsics.d(this.k, j84Var.k);
    }

    public final int hashCode() {
        String str = this.f16068a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.i;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.j;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.k;
        return iHashCode10 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AuthHistoryResponseItem(city=", this.f16068a, ", country=", this.b, ", date=");
        rz4.v(this.c, ", ip=", this.d, ", os=", sbN);
        axq.x(this.f, this.e, ", osId=", ", nameWhence=", sbN);
        f140.v(sbN, this.g, ", sessionId=", this.h, ", whence=");
        brm0.z(this.j, this.i, ", current=", ", hasAuthenticator=", sbN);
        return defpackage.c.e(sbN, this.k, Separators.RPAREN);
    }
}
