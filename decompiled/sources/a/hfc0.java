package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class hfc0 {
    public static final gfc0 Companion = new gfc0();
    public static final a8z[] k = {null, null, null, null, null, null, null, maz.a(wez.f39042a, new cbc0(7)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12967a;
    public final Double b;
    public final String c;
    public final Long d;
    public final Long e;
    public final Integer f;
    public final Integer g;
    public final List h;
    public final String i;
    public final Integer j;

    public /* synthetic */ hfc0(int i, String str, Double d, String str2, Long l, Long l2, Integer num, Integer num2, List list, String str3, Integer num3) {
        if ((i & 1) == 0) {
            this.f12967a = null;
        } else {
            this.f12967a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = list;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfc0)) {
            return false;
        }
        hfc0 hfc0Var = (hfc0) obj;
        return Intrinsics.d(this.f12967a, hfc0Var.f12967a) && Intrinsics.d(this.b, hfc0Var.b) && Intrinsics.d(this.c, hfc0Var.c) && Intrinsics.d(this.d, hfc0Var.d) && Intrinsics.d(this.e, hfc0Var.e) && Intrinsics.d(this.f, hfc0Var.f) && Intrinsics.d(this.g, hfc0Var.g) && Intrinsics.d(this.h, hfc0Var.h) && Intrinsics.d(this.i, hfc0Var.i) && Intrinsics.d(this.j, hfc0Var.j);
    }

    public final int hashCode() {
        String str = this.f12967a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.g;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.h;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.j;
        return iHashCode9 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoCodeResponse(promoCodeName=");
        sb.append(this.f12967a);
        sb.append(", promoCodeAmount=");
        sb.append(this.b);
        sb.append(", currency=");
        h97.w(this.d, this.c, ", promoCodeDateOfUse=", ", promoCodeDateOfUseBefore=", sb);
        brm0.A(this.f, this.e, ", promoCodeSection=", ", promoCodeStatus=", sb);
        cs0.z(sb, this.g, ", conditions=", this.h, ", shopName=");
        return vqd.l(this.j, this.i, ", payoutType=", Separators.RPAREN, sb);
    }
}
