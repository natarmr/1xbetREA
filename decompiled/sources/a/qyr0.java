package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class qyr0 {
    public static final pyr0 Companion = new pyr0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29550a;
    public final Long b;
    public final String c;
    public final Long d;
    public final Long e;
    public final String f;
    public final String g;
    public final String h;
    public final Long i;
    public final String j;
    public final Integer k;
    public final of9 l;
    public final xyr0 m;

    public /* synthetic */ qyr0(int i, String str, Long l, String str2, Long l2, Long l3, String str3, String str4, String str5, Long l4, String str6, Integer num, of9 of9Var, xyr0 xyr0Var) {
        if ((i & 1) == 0) {
            this.f29550a = null;
        } else {
            this.f29550a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str5;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = l4;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str6;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = num;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = of9Var;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = xyr0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyr0)) {
            return false;
        }
        qyr0 qyr0Var = (qyr0) obj;
        return Intrinsics.d(this.f29550a, qyr0Var.f29550a) && Intrinsics.d(this.b, qyr0Var.b) && Intrinsics.d(this.c, qyr0Var.c) && Intrinsics.d(this.d, qyr0Var.d) && Intrinsics.d(this.e, qyr0Var.e) && Intrinsics.d(this.f, qyr0Var.f) && Intrinsics.d(this.g, qyr0Var.g) && Intrinsics.d(this.h, qyr0Var.h) && Intrinsics.d(this.i, qyr0Var.i) && Intrinsics.d(this.j, qyr0Var.j) && Intrinsics.d(this.k, qyr0Var.k) && Intrinsics.d(this.l, qyr0Var.l) && Intrinsics.d(this.m, qyr0Var.m);
    }

    public final int hashCode() {
        String str = this.f29550a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.e;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l4 = this.i;
        int iHashCode9 = (iHashCode8 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str6 = this.j;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.k;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        of9 of9Var = this.l;
        int iHashCode12 = (iHashCode11 + (of9Var == null ? 0 : of9Var.hashCode())) * 31;
        xyr0 xyr0Var = this.m;
        return iHashCode12 + (xyr0Var != null ? xyr0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = kng0.s(this.b, "BlockHeader(title=", this.f29550a, ", currencyId=", ", mediaValue=");
        h97.w(this.d, this.c, ", startDt=", ", endDt=", sbS);
        rz4.v(this.e, ", description=", this.f, ", prizeTitle=", sbS);
        f140.v(sbS, this.g, ", prizePool=", this.h, ", sum=");
        rz4.v(this.i, ", currencySymbol=", this.j, ", freeSpins=", sbS);
        sbS.append(this.k);
        sbS.append(", buttons=");
        sbS.append(this.l);
        sbS.append(", counter=");
        sbS.append(this.m);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
