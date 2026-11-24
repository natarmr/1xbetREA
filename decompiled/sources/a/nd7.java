package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class nd7 {
    public static final md7 Companion = new md7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f23326a;
    public final Long b;
    public final Long c;
    public final Double d;
    public final Double e;
    public final Double f;
    public final Double g;
    public final String h;
    public final String i;
    public final Long j;
    public final String k;
    public final Long l;
    public final Long m;
    public final String n;

    public /* synthetic */ nd7(int i, Long l, Long l2, Long l3, Double d, Double d2, Double d3, Double d4, String str, String str2, Long l4, String str3, Long l5, Long l6, String str4) {
        if ((i & 1) == 0) {
            this.f23326a = null;
        } else {
            this.f23326a = l;
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
            this.d = d;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = d2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = d3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = d4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = l4;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str3;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = l5;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = l6;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd7)) {
            return false;
        }
        nd7 nd7Var = (nd7) obj;
        return Intrinsics.d(this.f23326a, nd7Var.f23326a) && Intrinsics.d(this.b, nd7Var.b) && Intrinsics.d(this.c, nd7Var.c) && Intrinsics.d(this.d, nd7Var.d) && Intrinsics.d(this.e, nd7Var.e) && Intrinsics.d(this.f, nd7Var.f) && Intrinsics.d(this.g, nd7Var.g) && Intrinsics.d(this.h, nd7Var.h) && Intrinsics.d(this.i, nd7Var.i) && Intrinsics.d(this.j, nd7Var.j) && Intrinsics.d(this.k, nd7Var.k) && Intrinsics.d(this.l, nd7Var.l) && Intrinsics.d(this.m, nd7Var.m) && Intrinsics.d(this.n, nd7Var.n);
    }

    public final int hashCode() {
        Long l = this.f23326a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Double d = this.d;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.e;
        int iHashCode5 = (iHashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f;
        int iHashCode6 = (iHashCode5 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.g;
        int iHashCode7 = (iHashCode6 + (d4 == null ? 0 : d4.hashCode())) * 31;
        String str = this.h;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l4 = this.j;
        int iHashCode10 = (iHashCode9 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str3 = this.k;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l5 = this.l;
        int iHashCode12 = (iHashCode11 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.m;
        int iHashCode13 = (iHashCode12 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str4 = this.n;
        return iHashCode13 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f23326a, this.b, "BetInfos(betDate=", ", winDate=", ", betId=");
        sbO.append(this.c);
        sbO.append(", betSum=");
        sbO.append(this.d);
        sbO.append(", betSumProvider=");
        vqd.w(sbO, this.e, ", winSum=", this.f, ", winSumProvider=");
        ua80.w(sbO, this.g, ", currencyCode=", this.h, ", currencyCodeProvider=");
        h97.w(this.j, this.i, ", gameId=", ", gameName=", sbO);
        h97.w(this.l, this.k, ", typeGame=", ", productId=", sbO);
        sbO.append(this.m);
        sbO.append(", productName=");
        sbO.append(this.n);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
