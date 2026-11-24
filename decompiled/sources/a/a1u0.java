package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class a1u0 {
    public static final z0u0 Companion = new z0u0();
    public static final a8z[] l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f91a;
    public final Long b;
    public final Boolean c;
    public final h1u0 d;
    public final h1u0 e;
    public final Integer f;
    public final Integer g;
    public final String h;
    public final Long i;
    public final List j;
    public final List k;

    static {
        g1u0 g1u0Var = h1u0.Companion;
        wez wezVar = wez.f39042a;
        l = new a8z[]{null, null, null, null, null, null, null, null, null, maz.a(wezVar, new tht0((byte) 25)), maz.a(wezVar, new tht0((byte) 26))};
    }

    public /* synthetic */ a1u0(int i, Integer num, Long l2, Boolean bool, h1u0 h1u0Var, h1u0 h1u0Var2, Integer num2, Integer num3, String str, Long l3, List list, List list2) {
        if ((i & 1) == 0) {
            this.f91a = null;
        } else {
            this.f91a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = h1u0Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = h1u0Var2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = l3;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1u0)) {
            return false;
        }
        a1u0 a1u0Var = (a1u0) obj;
        return Intrinsics.d(this.f91a, a1u0Var.f91a) && Intrinsics.d(this.b, a1u0Var.b) && Intrinsics.d(this.c, a1u0Var.c) && Intrinsics.d(this.d, a1u0Var.d) && Intrinsics.d(this.e, a1u0Var.e) && Intrinsics.d(this.f, a1u0Var.f) && Intrinsics.d(this.g, a1u0Var.g) && Intrinsics.d(this.h, a1u0Var.h) && Intrinsics.d(this.i, a1u0Var.i) && Intrinsics.d(this.j, a1u0Var.j) && Intrinsics.d(this.k, a1u0Var.k);
    }

    public final int hashCode() {
        Integer num = this.f91a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        h1u0 h1u0Var = this.d;
        int iHashCode4 = (iHashCode3 + (h1u0Var == null ? 0 : h1u0Var.hashCode())) * 31;
        h1u0 h1u0Var2 = this.e;
        int iHashCode5 = (iHashCode4 + (h1u0Var2 == null ? 0 : h1u0Var2.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.g;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.h;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Long l3 = this.i;
        int iHashCode9 = (iHashCode8 + (l3 == null ? 0 : l3.hashCode())) * 31;
        List list = this.j;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.k;
        return iHashCode10 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = h97.m(this.f91a, this.b, "ValorantStatisticMatchesResponse(id=", ", tournamentId=", ", finished=");
        sbM.append(this.c);
        sbM.append(", teamOne=");
        sbM.append(this.d);
        sbM.append(", teamTwo=");
        sbM.append(this.e);
        sbM.append(", teamOneScore=");
        sbM.append(this.f);
        sbM.append(", teamTwoScore=");
        b1j.u(this.g, ", startTime=", this.h, ", startTimestamp=", sbM);
        twn.z(sbM, this.i, ", matches=", this.j, ", teamsAdvantage=");
        return dw9.r(sbM, this.k, Separators.RPAREN);
    }
}
