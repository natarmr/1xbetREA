package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ivg0 {
    public static final gvg0 Companion = new gvg0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f15445a;
    public final asn b;
    public final Double c;
    public final Boolean d;
    public final Double e;
    public final Double f;
    public final Double g;
    public final Double h;
    public final Double i;
    public final Double j;
    public final Double k;
    public final String l;
    public final Long m;

    static {
        yrn yrnVar = asn.Companion;
    }

    public /* synthetic */ ivg0(int i, Double d, asn asnVar, Double d2, Boolean bool, Double d3, Double d4, Double d5, Double d6, Double d7, Double d8, Double d9, String str, Long l) {
        if ((i & 1) == 0) {
            this.f15445a = null;
        } else {
            this.f15445a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = asnVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = d3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = d4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = d5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = d6;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = d7;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = d8;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = d9;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivg0)) {
            return false;
        }
        ivg0 ivg0Var = (ivg0) obj;
        return Intrinsics.d(this.f15445a, ivg0Var.f15445a) && Intrinsics.d(this.b, ivg0Var.b) && Intrinsics.d(this.c, ivg0Var.c) && Intrinsics.d(this.d, ivg0Var.d) && Intrinsics.d(this.e, ivg0Var.e) && Intrinsics.d(this.f, ivg0Var.f) && Intrinsics.d(this.g, ivg0Var.g) && Intrinsics.d(this.h, ivg0Var.h) && Intrinsics.d(this.i, ivg0Var.i) && Intrinsics.d(this.j, ivg0Var.j) && Intrinsics.d(this.k, ivg0Var.k) && Intrinsics.d(this.l, ivg0Var.l) && Intrinsics.d(this.m, ivg0Var.m);
    }

    public final int hashCode() {
        Double d = this.f15445a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        asn asnVar = this.b;
        int iHashCode2 = (iHashCode + (asnVar == null ? 0 : asnVar.hashCode())) * 31;
        Double d2 = this.c;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d3 = this.e;
        int iHashCode5 = (iHashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.f;
        int iHashCode6 = (iHashCode5 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.g;
        int iHashCode7 = (iHashCode6 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.h;
        int iHashCode8 = (iHashCode7 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.i;
        int iHashCode9 = (iHashCode8 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Double d8 = this.j;
        int iHashCode10 = (iHashCode9 + (d8 == null ? 0 : d8.hashCode())) * 31;
        Double d9 = this.k;
        int iHashCode11 = (iHashCode10 + (d9 == null ? 0 : d9.hashCode())) * 31;
        String str = this.l;
        int iHashCode12 = (iHashCode11 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.m;
        return iHashCode12 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SaleInfoResponse(availableBetSum=");
        sb.append(this.f15445a);
        sb.append(", elevateInfo=");
        sb.append(this.b);
        sb.append(", balance=");
        sb.append(this.c);
        sb.append(", hasOrder=");
        sb.append(this.d);
        sb.append(", limitSum=");
        vqd.w(sb, this.e, ", maxAutoSaleSum=", this.f, ", maxSaleSum=");
        vqd.w(sb, this.g, ", partSaleLimitSum=", this.h, ", minAutoSaleSum=");
        vqd.w(sb, this.i, ", minBetSum=", this.j, ", minSaleSum=");
        ua80.w(sb, this.k, ", betGuid=", this.l, ", waitTime=");
        return ohs0.r(sb, this.m, Separators.RPAREN);
    }
}
