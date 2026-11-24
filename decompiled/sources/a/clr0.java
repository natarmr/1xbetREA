package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class clr0 {
    public static final blr0 Companion = new blr0();
    public static final a8z[] j = {null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new dfr0(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f4574a;
    public final Long b;
    public final Long c;
    public final Double d;
    public final String e;
    public final Long f;
    public final Double g;
    public final Double h;
    public final List i;

    public /* synthetic */ clr0(int i, Long l, Long l2, Long l3, Double d, String str, Long l4, Double d2, Double d3, List list) {
        if ((i & 1) == 0) {
            this.f4574a = null;
        } else {
            this.f4574a = l;
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
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = d2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = d3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clr0)) {
            return false;
        }
        clr0 clr0Var = (clr0) obj;
        return Intrinsics.d(this.f4574a, clr0Var.f4574a) && Intrinsics.d(this.b, clr0Var.b) && Intrinsics.d(this.c, clr0Var.c) && Intrinsics.d(this.d, clr0Var.d) && Intrinsics.d(this.e, clr0Var.e) && Intrinsics.d(this.f, clr0Var.f) && Intrinsics.d(this.g, clr0Var.g) && Intrinsics.d(this.h, clr0Var.h) && Intrinsics.d(this.i, clr0Var.i);
    }

    public final int hashCode() {
        Long l = this.f4574a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Double d = this.d;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Long l4 = this.f;
        int iHashCode6 = (iHashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Double d2 = this.g;
        int iHashCode7 = (iHashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.h;
        int iHashCode8 = (iHashCode7 + (d3 == null ? 0 : d3.hashCode())) * 31;
        List list = this.i;
        return iHashCode8 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f4574a, this.b, "TotoBetResponse(tirageNumber=", ", dateTermination=", ", endTirageDate=");
        sbO.append(this.c);
        sbO.append(", pool=");
        sbO.append(this.d);
        sbO.append(", jackpot=");
        h97.w(this.f, this.e, ", dateUpdate=", ", minBetSum=", sbO);
        vqd.w(sbO, this.g, ", maxBetSum=", this.h, ", totoChampResponse=");
        return dw9.r(sbO, this.i, Separators.RPAREN);
    }
}
