package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class hsh {
    public static final gsh Companion = new gsh();
    public static final a8z[] l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f13582a;
    public final String b;
    public final Integer c;
    public final String d;
    public final String e;
    public final Long f;
    public final Long g;
    public final List h;
    public final List i;
    public final List j;
    public final Boolean k;

    static {
        wez wezVar = wez.f39042a;
        l = new a8z[]{null, null, null, null, null, null, null, maz.a(wezVar, new bmh((byte) 3)), maz.a(wezVar, new bmh((byte) 4)), maz.a(wezVar, new bmh((byte) 5)), null};
    }

    public /* synthetic */ hsh(int i, Long l2, String str, Integer num, String str2, String str3, Long l3, Long l4, List list, List list2, List list3, Boolean bool) {
        if ((i & 1) == 0) {
            this.f13582a = null;
        } else {
            this.f13582a = l2;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
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
            this.f = l3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l4;
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
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsh)) {
            return false;
        }
        hsh hshVar = (hsh) obj;
        return Intrinsics.d(this.f13582a, hshVar.f13582a) && Intrinsics.d(this.b, hshVar.b) && Intrinsics.d(this.c, hshVar.c) && Intrinsics.d(this.d, hshVar.d) && Intrinsics.d(this.e, hshVar.e) && Intrinsics.d(this.f, hshVar.f) && Intrinsics.d(this.g, hshVar.g) && Intrinsics.d(this.h, hshVar.h) && Intrinsics.d(this.i, hshVar.i) && Intrinsics.d(this.j, hshVar.j) && Intrinsics.d(this.k, hshVar.k);
    }

    public final int hashCode() {
        Long l2 = this.f13582a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l3 = this.f;
        int iHashCode6 = (iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.g;
        int iHashCode7 = (iHashCode6 + (l4 == null ? 0 : l4.hashCode())) * 31;
        List list = this.h;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.i;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.j;
        int iHashCode10 = (iHashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.k;
        return iHashCode10 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f13582a, "CyberWorldCupResponse(id=", ", champName=", this.b, ", prizePool=");
        b1j.u(this.c, ", description=", this.d, ", rules=", sbS);
        h97.w(this.f, this.e, ", startTimestamp=", ", endTimestamp=", sbS);
        twn.z(sbS, this.g, ", players=", this.h, ", teams=");
        b1j.y(", teamsPrizeDistribution=", ", lngSideLeft=", sbS, this.i, this.j);
        return defpackage.c.e(sbS, this.k, Separators.RPAREN);
    }
}
