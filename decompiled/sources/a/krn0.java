package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class krn0 {
    public static final jrn0 Companion = new jrn0();
    public static final a8z[] i = {null, null, null, null, null, null, null, maz.a(wez.f39042a, new a7n0((byte) 19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f18775a;
    public final String b;
    public final Long c;
    public final String d;
    public final Integer e;
    public final Boolean f;
    public final Boolean g;
    public final List h;

    public /* synthetic */ krn0(int i2, Long l, String str, Long l2, String str2, Integer num, Boolean bool, Boolean bool2, List list) {
        if ((i2 & 1) == 0) {
            this.f18775a = null;
        } else {
            this.f18775a = l;
        }
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool2;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krn0)) {
            return false;
        }
        krn0 krn0Var = (krn0) obj;
        return Intrinsics.d(this.f18775a, krn0Var.f18775a) && Intrinsics.d(this.b, krn0Var.b) && Intrinsics.d(this.c, krn0Var.c) && Intrinsics.d(this.d, krn0Var.d) && Intrinsics.d(this.e, krn0Var.e) && Intrinsics.d(this.f, krn0Var.f) && Intrinsics.d(this.g, krn0Var.g) && Intrinsics.d(this.h, krn0Var.h);
    }

    public final int hashCode() {
        Long l = this.f18775a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.g;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List list = this.h;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f18775a, "SwipeXSportWithChampsResponse(sportId=", ", sportName=", this.b, ", subSportId=");
        rz4.v(this.c, ", subSportName=", this.d, ", champsCount=", sbS);
        brm0.z(this.f, this.e, ", isCyber=", ", isSwipeCyber=", sbS);
        sbS.append(this.g);
        sbS.append(", champs=");
        sbS.append(this.h);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
