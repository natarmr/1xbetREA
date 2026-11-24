package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class kir0 {
    public static final jir0 Companion = new jir0();
    public static final a8z[] g = {null, null, maz.a(wez.f39042a, new dfr0(3)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f18350a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final Integer f;

    public /* synthetic */ kir0(int i, Integer num, Long l, String str, String str2, String str3, List list) {
        if ((i & 1) == 0) {
            this.f18350a = null;
        } else {
            this.f18350a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kir0)) {
            return false;
        }
        kir0 kir0Var = (kir0) obj;
        return Intrinsics.d(this.f18350a, kir0Var.f18350a) && Intrinsics.d(this.b, kir0Var.b) && Intrinsics.d(this.c, kir0Var.c) && Intrinsics.d(this.d, kir0Var.d) && Intrinsics.d(this.e, kir0Var.e) && Intrinsics.d(this.f, kir0Var.f);
    }

    public final int hashCode() {
        Long l = this.f18350a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f18350a, "TotoBetChampResponse(champId=", ", champName=", this.b, ", gameResponse=");
        h97.y(", countryImage=", this.d, ", champImage=", sbS, this.c);
        return vqd.l(this.f, this.e, ", countryId=", Separators.RPAREN, sbS);
    }
}
