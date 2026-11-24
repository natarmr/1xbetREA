package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class hvg0 {
    public static final fvg0 Companion = new fvg0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f13725a;
    public final zrn b;
    public final Double c;
    public final Boolean d;
    public final Double e;
    public final Double f;
    public final Double g;
    public final Double h;
    public final Double i;
    public final Double j;
    public final String k;
    public final Long l;

    public /* synthetic */ hvg0(int i, Double d, zrn zrnVar, Double d2, Boolean bool, Double d3, Double d4, Double d5, Double d6, Double d7, Double d8, String str, Long l) {
        if ((i & 1) == 0) {
            this.f13725a = null;
        } else {
            this.f13725a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = zrnVar;
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
            this.k = str;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvg0)) {
            return false;
        }
        hvg0 hvg0Var = (hvg0) obj;
        return Intrinsics.d(this.f13725a, hvg0Var.f13725a) && Intrinsics.d(this.b, hvg0Var.b) && Intrinsics.d(this.c, hvg0Var.c) && Intrinsics.d(this.d, hvg0Var.d) && Intrinsics.d(this.e, hvg0Var.e) && Intrinsics.d(this.f, hvg0Var.f) && Intrinsics.d(this.g, hvg0Var.g) && Intrinsics.d(this.h, hvg0Var.h) && Intrinsics.d(this.i, hvg0Var.i) && Intrinsics.d(this.j, hvg0Var.j) && Intrinsics.d(this.k, hvg0Var.k) && Intrinsics.d(this.l, hvg0Var.l);
    }

    public final int hashCode() {
        Double d = this.f13725a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        zrn zrnVar = this.b;
        int iHashCode2 = (iHashCode + (zrnVar == null ? 0 : zrnVar.hashCode())) * 31;
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
        String str = this.k;
        int iHashCode11 = (iHashCode10 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.l;
        return iHashCode11 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SaleInfoResponse(availableBetSum=");
        sb.append(this.f13725a);
        sb.append(", elevateInfo=");
        sb.append(this.b);
        sb.append(", balance=");
        sb.append(this.c);
        sb.append(", hasOrder=");
        sb.append(this.d);
        sb.append(", limitSum=");
        vqd.w(sb, this.e, ", maxAutoSaleSum=", this.f, ", maxSaleSum=");
        vqd.w(sb, this.g, ", minAutoSaleSum=", this.h, ", minBetSum=");
        vqd.w(sb, this.i, ", minSaleSum=", this.j, ", betGuid=");
        sb.append(this.k);
        sb.append(", waitTime=");
        sb.append(this.l);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
