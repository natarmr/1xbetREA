package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class ntd0 {
    public static final mtd0 Companion = new mtd0();
    public static final a8z[] k = {null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new etd0(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24094a;
    public final String b;
    public final String c;
    public final Long d;
    public final Integer e;
    public final Long f;
    public final String g;
    public final Long h;
    public final Long i;
    public final List j;

    public /* synthetic */ ntd0(int i, String str, String str2, String str3, Long l, Integer num, Long l2, String str4, Long l3, Long l4, List list) {
        if ((i & 1) == 0) {
            this.f24094a = null;
        } else {
            this.f24094a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = l4;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntd0)) {
            return false;
        }
        ntd0 ntd0Var = (ntd0) obj;
        return Intrinsics.d(this.f24094a, ntd0Var.f24094a) && Intrinsics.d(this.b, ntd0Var.b) && Intrinsics.d(this.c, ntd0Var.c) && Intrinsics.d(this.d, ntd0Var.d) && Intrinsics.d(this.e, ntd0Var.e) && Intrinsics.d(this.f, ntd0Var.f) && Intrinsics.d(this.g, ntd0Var.g) && Intrinsics.d(this.h, ntd0Var.h) && Intrinsics.d(this.i, ntd0Var.i) && Intrinsics.d(this.j, ntd0Var.j);
    }

    public final int hashCode() {
        String str = this.f24094a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l3 = this.h;
        int iHashCode8 = (iHashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.i;
        int iHashCode9 = (iHashCode8 + (l4 == null ? 0 : l4.hashCode())) * 31;
        List list = this.j;
        return iHashCode9 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("RacesStatisticInfoResponse(id=", this.f24094a, ", tournTitle=", this.b, ", trackTitle=");
        h97.w(this.d, this.c, ", trackId=", ", status=", sbN);
        cs0.w(this.e, this.f, ", dateStart=", ", circuitLength=", sbN);
        h97.w(this.h, this.g, ", laps=", ", raceDistance=", sbN);
        sbN.append(this.i);
        sbN.append(", menus=");
        sbN.append(this.j);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
