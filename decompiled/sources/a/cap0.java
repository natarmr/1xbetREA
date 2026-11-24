package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class cap0 {
    public static final bap0 Companion = new bap0();
    public static final a8z[] k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4023a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Long g;
    public final List h;
    public final List i;
    public final List j;

    static {
        wez wezVar = wez.f39042a;
        k = new a8z[]{null, null, null, null, null, null, null, maz.a(wezVar, new fno0((byte) 21)), maz.a(wezVar, new fno0((byte) 22)), maz.a(wezVar, new fno0((byte) 23))};
    }

    public /* synthetic */ cap0(int i, String str, Long l, String str2, String str3, String str4, String str5, Long l2, List list, List list2, List list3) {
        if ((i & 1) == 0) {
            this.f4023a = null;
        } else {
            this.f4023a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = list;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cap0)) {
            return false;
        }
        cap0 cap0Var = (cap0) obj;
        return Intrinsics.d(this.f4023a, cap0Var.f4023a) && Intrinsics.d(this.b, cap0Var.b) && Intrinsics.d(this.c, cap0Var.c) && Intrinsics.d(this.d, cap0Var.d) && Intrinsics.d(this.e, cap0Var.e) && Intrinsics.d(this.f, cap0Var.f) && Intrinsics.d(this.g, cap0Var.g) && Intrinsics.d(this.h, cap0Var.h) && Intrinsics.d(this.i, cap0Var.i) && Intrinsics.d(this.j, cap0Var.j);
    }

    public final int hashCode() {
        String str = this.f4023a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l2 = this.g;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List list = this.h;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.i;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.j;
        return iHashCode9 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = kng0.s(this.b, "TeamDetailsResponse(name=", this.f4023a, ", feedId=", ", imageS3=");
        f140.v(sbS, this.c, ", description=", this.d, ", locationImageS3=");
        f140.v(sbS, this.e, ", location=", this.f, ", foundedAtStamp=");
        twn.z(sbS, this.g, ", achievements=", this.h, ", transfers=");
        return kng0.n(", sportsExists=", Separators.RPAREN, sbS, this.i, this.j);
    }
}
