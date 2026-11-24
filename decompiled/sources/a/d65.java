package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class d65 {
    public static final c65 Companion = new c65();
    public static final a8z[] p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f5536a;
    public final Double b;
    public final String c;
    public final Double d;
    public final Integer e;
    public final Long f;
    public final Long g;
    public final Long h;
    public final fom0 i;
    public final List j;
    public final List k;
    public final List l;
    public final List m;
    public final List n;
    public final List o;

    static {
        wez wezVar = wez.f39042a;
        p = new a8z[]{null, null, null, null, null, null, null, null, null, maz.a(wezVar, new a04((byte) 20)), maz.a(wezVar, new a04((byte) 21)), maz.a(wezVar, new a04((byte) 22)), maz.a(wezVar, new a04((byte) 23)), maz.a(wezVar, new a04((byte) 24)), maz.a(wezVar, new a04((byte) 25))};
    }

    public /* synthetic */ d65(int i, Integer num, Double d, String str, Double d2, Integer num2, Long l, Long l2, Long l3, fom0 fom0Var, List list, List list2, List list3, List list4, List list5, List list6) {
        if ((i & 1) == 0) {
            this.f5536a = null;
        } else {
            this.f5536a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = fom0Var;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = list2;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = list3;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = list4;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = list5;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = list6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d65)) {
            return false;
        }
        d65 d65Var = (d65) obj;
        return Intrinsics.d(this.f5536a, d65Var.f5536a) && Intrinsics.d(this.b, d65Var.b) && Intrinsics.d(this.c, d65Var.c) && Intrinsics.d(this.d, d65Var.d) && Intrinsics.d(this.e, d65Var.e) && Intrinsics.d(this.f, d65Var.f) && Intrinsics.d(this.g, d65Var.g) && Intrinsics.d(this.h, d65Var.h) && Intrinsics.d(this.i, d65Var.i) && Intrinsics.d(this.j, d65Var.j) && Intrinsics.d(this.k, d65Var.k) && Intrinsics.d(this.l, d65Var.l) && Intrinsics.d(this.m, d65Var.m) && Intrinsics.d(this.n, d65Var.n) && Intrinsics.d(this.o, d65Var.o);
    }

    public final int hashCode() {
        Integer num = this.f5536a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Double d2 = this.d;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.f;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.g;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.h;
        int iHashCode8 = (iHashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        fom0 fom0Var = this.i;
        int iHashCode9 = (iHashCode8 + (fom0Var == null ? 0 : fom0Var.hashCode())) * 31;
        List list = this.j;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.k;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.l;
        int iHashCode12 = (iHashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.m;
        int iHashCode13 = (iHashCode12 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.n;
        int iHashCode14 = (iHashCode13 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List list6 = this.o;
        return iHashCode14 + (list6 != null ? list6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AvailableBonusItemResponse(id=");
        sb.append(this.f5536a);
        sb.append(", amount=");
        sb.append(this.b);
        sb.append(", currency=");
        sb.append(this.c);
        sb.append(", currentWager=");
        sb.append(this.d);
        sb.append(", wager=");
        cs0.w(this.e, this.f, ", timeExpired=", ", timeLeft=", sb);
        cs0.A(sb, this.g, ", timePayment=", this.h, ", status=");
        sb.append(this.i);
        sb.append(", availableCategoriesList=");
        sb.append(this.j);
        sb.append(", availableGamesList=");
        b1j.y(", availableProductsList=", ", unAvailableCategoriesList=", sb, this.k, this.l);
        b1j.y(", unAvailableGamesList=", ", unAvailableProductsList=", sb, this.m, this.n);
        return dw9.r(sb, this.o, Separators.RPAREN);
    }
}
