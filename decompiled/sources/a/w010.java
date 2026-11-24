package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class w010 {
    public static final v010 Companion = new v010();
    public static final a8z[] l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f38326a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;
    public final Long f;
    public final List g;
    public final List h;
    public final List i;
    public final List j;
    public final List k;

    static {
        wez wezVar = wez.f39042a;
        l = new a8z[]{null, null, null, null, null, null, maz.a(wezVar, new t010((byte) 0)), maz.a(wezVar, new t010((byte) 1)), maz.a(wezVar, new t010((byte) 2)), maz.a(wezVar, new t010((byte) 3)), maz.a(wezVar, new t010((byte) 4))};
    }

    public /* synthetic */ w010(int i, Long l2, Long l3, String str, String str2, String str3, Long l4, List list, List list2, List list3, List list4, List list5) {
        if ((i & 1) == 0) {
            this.f38326a = null;
        } else {
            this.f38326a = l2;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l3;
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
            this.f = l4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = list2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = list3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list4;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = list5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w010)) {
            return false;
        }
        w010 w010Var = (w010) obj;
        return Intrinsics.d(this.f38326a, w010Var.f38326a) && Intrinsics.d(this.b, w010Var.b) && Intrinsics.d(this.c, w010Var.c) && Intrinsics.d(this.d, w010Var.d) && Intrinsics.d(this.e, w010Var.e) && Intrinsics.d(this.f, w010Var.f) && Intrinsics.d(this.g, w010Var.g) && Intrinsics.d(this.h, w010Var.h) && Intrinsics.d(this.i, w010Var.i) && Intrinsics.d(this.j, w010Var.j) && Intrinsics.d(this.k, w010Var.k);
    }

    public final int hashCode() {
        Long l2 = this.f38326a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Long l3 = this.b;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l4 = this.f;
        int iHashCode6 = (iHashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        List list = this.g;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.h;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.i;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.j;
        int iHashCode10 = (iHashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.k;
        return iHashCode10 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f38326a, this.b, "LolInfoResponse(startedAtStamp=", ", endedAtStamp=", ", type=");
        f140.v(sbO, this.c, ", location=", this.d, ", description=");
        h97.w(this.f, this.e, ", prizePool=", ", champions=", sbO);
        b1j.y(", prizeDistribution=", ", topTeams=", sbO, this.g, this.h);
        b1j.y(", players=", ", groups=", sbO, this.i, this.j);
        return dw9.r(sbO, this.k, Separators.RPAREN);
    }
}
