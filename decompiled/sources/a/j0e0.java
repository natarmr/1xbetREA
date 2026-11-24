package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class j0e0 {
    public static final i0e0 Companion = new i0e0();
    public static final a8z[] m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f15680a;
    public final Long b;
    public final Boolean c;
    public final t0e0 d;
    public final t0e0 e;
    public final Integer f;
    public final Integer g;
    public final String h;
    public final Long i;
    public final List j;
    public final vyd0 k;
    public final List l;

    static {
        uyd0 uyd0Var = vyd0.Companion;
        s0e0 s0e0Var = t0e0.Companion;
        wez wezVar = wez.f39042a;
        m = new a8z[]{null, null, null, null, null, null, null, null, null, maz.a(wezVar, new etd0((byte) 16)), null, maz.a(wezVar, new etd0((byte) 17))};
    }

    public /* synthetic */ j0e0(int i, Integer num, Long l, Boolean bool, t0e0 t0e0Var, t0e0 t0e0Var2, Integer num2, Integer num3, String str, Long l2, List list, vyd0 vyd0Var, List list2) {
        if ((i & 1) == 0) {
            this.f15680a = null;
        } else {
            this.f15680a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = t0e0Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = t0e0Var2;
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
            this.i = l2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = vyd0Var;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0e0)) {
            return false;
        }
        j0e0 j0e0Var = (j0e0) obj;
        return Intrinsics.d(this.f15680a, j0e0Var.f15680a) && Intrinsics.d(this.b, j0e0Var.b) && Intrinsics.d(this.c, j0e0Var.c) && Intrinsics.d(this.d, j0e0Var.d) && Intrinsics.d(this.e, j0e0Var.e) && Intrinsics.d(this.f, j0e0Var.f) && Intrinsics.d(this.g, j0e0Var.g) && Intrinsics.d(this.h, j0e0Var.h) && Intrinsics.d(this.i, j0e0Var.i) && Intrinsics.d(this.j, j0e0Var.j) && Intrinsics.d(this.k, j0e0Var.k) && Intrinsics.d(this.l, j0e0Var.l);
    }

    public final int hashCode() {
        Integer num = this.f15680a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        t0e0 t0e0Var = this.d;
        int iHashCode4 = (iHashCode3 + (t0e0Var == null ? 0 : t0e0Var.hashCode())) * 31;
        t0e0 t0e0Var2 = this.e;
        int iHashCode5 = (iHashCode4 + (t0e0Var2 == null ? 0 : t0e0Var2.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.g;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.h;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.i;
        int iHashCode9 = (iHashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List list = this.j;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        vyd0 vyd0Var = this.k;
        int iHashCode11 = (iHashCode10 + (vyd0Var == null ? 0 : vyd0Var.hashCode())) * 31;
        List list2 = this.l;
        return iHashCode11 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = h97.m(this.f15680a, this.b, "RainbowStatisticMatchesResponse(id=", ", tournamentId=", ", finished=");
        sbM.append(this.c);
        sbM.append(", teamOne=");
        sbM.append(this.d);
        sbM.append(", teamTwo=");
        sbM.append(this.e);
        sbM.append(", teamOneScore=");
        sbM.append(this.f);
        sbM.append(", teamTwoScore=");
        b1j.u(this.g, ", startTime=", this.h, ", startTimestamp=", sbM);
        twn.z(sbM, this.i, ", matches=", this.j, ", comparison=");
        sbM.append(this.k);
        sbM.append(", mapPicks=");
        sbM.append(this.l);
        sbM.append(Separators.RPAREN);
        return sbM.toString();
    }
}
