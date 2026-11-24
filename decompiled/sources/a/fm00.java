package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class fm00 {
    public static final em00 Companion = new em00();
    public static final a8z[] k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f9763a;
    public final Double b;
    public final Long c;
    public final Double d;
    public final Integer e;
    public final Boolean f;
    public final Boolean g;
    public final List h;
    public final List i;
    public final List j;

    static {
        wez wezVar = wez.f39042a;
        k = new a8z[]{null, null, null, null, null, null, null, maz.a(wezVar, new x800((byte) 8)), maz.a(wezVar, new x800((byte) 9)), maz.a(wezVar, new x800((byte) 10))};
    }

    public /* synthetic */ fm00(int i, Boolean bool, Double d, Long l, Double d2, Integer num, Boolean bool2, Boolean bool3, List list, List list2, List list3) {
        if ((i & 1) == 0) {
            this.f9763a = null;
        } else {
            this.f9763a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool3;
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
        if (!(obj instanceof fm00)) {
            return false;
        }
        fm00 fm00Var = (fm00) obj;
        return Intrinsics.d(this.f9763a, fm00Var.f9763a) && Intrinsics.d(this.b, fm00Var.b) && Intrinsics.d(this.c, fm00Var.c) && Intrinsics.d(this.d, fm00Var.d) && Intrinsics.d(this.e, fm00Var.e) && Intrinsics.d(this.f, fm00Var.f) && Intrinsics.d(this.g, fm00Var.g) && Intrinsics.d(this.h, fm00Var.h) && Intrinsics.d(this.i, fm00Var.i) && Intrinsics.d(this.j, fm00Var.j);
    }

    public final int hashCode() {
        Boolean bool = this.f9763a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Double d2 = this.d;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.f;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.g;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List list = this.h;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.i;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.j;
        return iHashCode9 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadCouponResponse(advanceBet=");
        sb.append(this.f9763a);
        sb.append(", maxBet=");
        sb.append(this.b);
        sb.append(", expressNum=");
        sb.append(this.c);
        sb.append(", antiExpressCoef=");
        sb.append(this.d);
        sb.append(", vid=");
        brm0.z(this.f, this.e, ", hasRemoveEvents=", ", withLobby=", sb);
        sb.append(this.g);
        sb.append(", events=");
        sb.append(this.h);
        sb.append(", eventsIndexes=");
        return kng0.n(", minBetSystems=", Separators.RPAREN, sb, this.i, this.j);
    }
}
