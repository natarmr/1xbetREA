package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class e1u0 {
    public static final d1u0 Companion = new d1u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f7054a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Long g;
    public final String h;
    public final Float i;
    public final Float j;
    public final Float k;
    public final Float l;
    public final Float m;

    public /* synthetic */ e1u0(int i, Integer num, String str, String str2, String str3, String str4, String str5, Long l, String str6, Float f, Float f2, Float f3, Float f4, Float f5) {
        if ((i & 1) == 0) {
            this.f7054a = null;
        } else {
            this.f7054a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
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
            this.g = l;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str6;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = f;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = f2;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = f3;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = f4;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = f5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1u0)) {
            return false;
        }
        e1u0 e1u0Var = (e1u0) obj;
        return Intrinsics.d(this.f7054a, e1u0Var.f7054a) && Intrinsics.d(this.b, e1u0Var.b) && Intrinsics.d(this.c, e1u0Var.c) && Intrinsics.d(this.d, e1u0Var.d) && Intrinsics.d(this.e, e1u0Var.e) && Intrinsics.d(this.f, e1u0Var.f) && Intrinsics.d(this.g, e1u0Var.g) && Intrinsics.d(this.h, e1u0Var.h) && Intrinsics.d(this.i, e1u0Var.i) && Intrinsics.d(this.j, e1u0Var.j) && Intrinsics.d(this.k, e1u0Var.k) && Intrinsics.d(this.l, e1u0Var.l) && Intrinsics.d(this.m, e1u0Var.m);
    }

    public final int hashCode() {
        Integer num = this.f7054a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.g;
        int iHashCode7 = (iHashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        String str6 = this.h;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Float f = this.i;
        int iHashCode9 = (iHashCode8 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.j;
        int iHashCode10 = (iHashCode9 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.k;
        int iHashCode11 = (iHashCode10 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.l;
        int iHashCode12 = (iHashCode11 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.m;
        return iHashCode12 + (f5 != null ? f5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f7054a, "ValorantStatisticMatchesTeamPlayerResponse(id=", ", name=", this.b, ", realName=");
        f140.v(sbN, this.c, ", country=", this.d, ", countryImage=");
        f140.v(sbN, this.e, ", region=", this.f, ", birthdayStamp=");
        rz4.v(this.g, ", image=", this.h, ", avgCombatScore=", sbN);
        vqd.x(sbN, this.i, ", avgKills=", this.j, ", avgDeaths=");
        vqd.x(sbN, this.k, ", avgFirstKills=", this.l, ", avgHeadshots=");
        sbN.append(this.m);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
