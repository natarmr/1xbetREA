package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class doa0 {
    public static final coa0 Companion = new coa0();
    public static final a8z[] k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6406a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Boolean f;
    public final String g;
    public final String h;
    public final List i;
    public final List j;

    static {
        wez wezVar = wez.f39042a;
        k = new a8z[]{null, null, null, null, null, null, null, null, maz.a(wezVar, new raa0((byte) 28)), maz.a(wezVar, new raa0((byte) 29))};
    }

    public /* synthetic */ doa0(int i, String str, String str2, Integer num, Integer num2, Integer num3, Boolean bool, String str3, String str4, List list, List list2) {
        if ((i & 1) == 0) {
            this.f6406a = null;
        } else {
            this.f6406a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doa0)) {
            return false;
        }
        doa0 doa0Var = (doa0) obj;
        return Intrinsics.d(this.f6406a, doa0Var.f6406a) && Intrinsics.d(this.b, doa0Var.b) && Intrinsics.d(this.c, doa0Var.c) && Intrinsics.d(this.d, doa0Var.d) && Intrinsics.d(this.e, doa0Var.e) && Intrinsics.d(this.f, doa0Var.f) && Intrinsics.d(this.g, doa0Var.g) && Intrinsics.d(this.h, doa0Var.h) && Intrinsics.d(this.i, doa0Var.i) && Intrinsics.d(this.j, doa0Var.j);
    }

    public final int hashCode() {
        String str = this.f6406a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.i;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.j;
        return iHashCode9 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PointByPointsResponse(teamOne=", this.f6406a, ", teamTwo=", this.b, ", scoreOne=");
        rz4.y(sbN, this.c, ", scoreTwo=", this.d, ", server=");
        brm0.z(this.f, this.e, ", isLostServer=", ", advScoreOne=", sbN);
        f140.v(sbN, this.g, ", advScoreTwo=", this.h, ", points=");
        return kng0.n(", tieBreak=", Separators.RPAREN, sbN, this.i, this.j);
    }
}
