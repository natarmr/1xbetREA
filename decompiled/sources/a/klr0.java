package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class klr0 {
    public static final jlr0 Companion = new jlr0();
    public static final a8z[] m = {null, null, null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new dfr0(9))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f18506a;
    public final Integer b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final Long k;
    public final List l;

    public /* synthetic */ klr0(int i, Integer num, Integer num2, String str, String str2, String str3, String str4, Integer num3, Integer num4, Integer num5, Integer num6, Long l, List list) {
        if ((i & 1) == 0) {
            this.f18506a = null;
        } else {
            this.f18506a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
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
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num5;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num6;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = l;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klr0)) {
            return false;
        }
        klr0 klr0Var = (klr0) obj;
        return Intrinsics.d(this.f18506a, klr0Var.f18506a) && Intrinsics.d(this.b, klr0Var.b) && Intrinsics.d(this.c, klr0Var.c) && Intrinsics.d(this.d, klr0Var.d) && Intrinsics.d(this.e, klr0Var.e) && Intrinsics.d(this.f, klr0Var.f) && Intrinsics.d(this.g, klr0Var.g) && Intrinsics.d(this.h, klr0Var.h) && Intrinsics.d(this.i, klr0Var.i) && Intrinsics.d(this.j, klr0Var.j) && Intrinsics.d(this.k, klr0Var.k) && Intrinsics.d(this.l, klr0Var.l);
    }

    public final int hashCode() {
        Integer num = this.f18506a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.g;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.h;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.i;
        int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.j;
        int iHashCode10 = (iHashCode9 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Long l = this.k;
        int iHashCode11 = (iHashCode10 + (l == null ? 0 : l.hashCode())) * 31;
        List list = this.l;
        return iHashCode11 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("TotoBetTirageItemResponse(tirage=", this.f18506a, ", tiragStatus=", this.b, ", stringTiragStatus=");
        f140.v(sbQ, this.c, ", jackpot=", this.d, ", pool=");
        f140.v(sbQ, this.e, ", prizeFund=", this.f, ", numberOfBets=");
        rz4.y(sbQ, this.g, ", confirmedBets=", this.h, ", numberOfVariants=");
        rz4.y(sbQ, this.i, ", numberOfUnique=", this.j, ", timeUntilEndReception=");
        sbQ.append(this.k);
        sbQ.append(", reportFiles=");
        sbQ.append(this.l);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
