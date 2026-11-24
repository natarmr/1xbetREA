package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class fjn {
    public static final ejn Companion = new ejn();
    public static final a8z[] l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f9650a;
    public final Integer b;
    public final Double c;
    public final List d;
    public final List e;
    public final Double f;
    public final Integer g;
    public final Double h;
    public final rk10 i;
    public final List j;
    public final List k;

    static {
        wez wezVar = wez.f39042a;
        l = new a8z[]{null, null, null, maz.a(wezVar, new dcn((byte) 18)), maz.a(wezVar, new dcn((byte) 19)), null, null, null, null, maz.a(wezVar, new dcn((byte) 20)), maz.a(wezVar, new dcn((byte) 21))};
    }

    public /* synthetic */ fjn(int i, Long l2, Integer num, Double d, List list, List list2, Double d2, Integer num2, Double d3, rk10 rk10Var, List list3, List list4) {
        if ((i & 1) == 0) {
            this.f9650a = null;
        } else {
            this.f9650a = l2;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = d2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = d3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = rk10Var;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = list3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = list4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjn)) {
            return false;
        }
        fjn fjnVar = (fjn) obj;
        return Intrinsics.d(this.f9650a, fjnVar.f9650a) && Intrinsics.d(this.b, fjnVar.b) && Intrinsics.d(this.c, fjnVar.c) && Intrinsics.d(this.d, fjnVar.d) && Intrinsics.d(this.e, fjnVar.e) && Intrinsics.d(this.f, fjnVar.f) && Intrinsics.d(this.g, fjnVar.g) && Intrinsics.d(this.h, fjnVar.h) && Intrinsics.d(this.i, fjnVar.i) && Intrinsics.d(this.j, fjnVar.j) && Intrinsics.d(this.k, fjnVar.k);
    }

    public final int hashCode() {
        Long l2 = this.f9650a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Double d2 = this.f;
        int iHashCode6 = (iHashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num2 = this.g;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d3 = this.h;
        int iHashCode8 = (iHashCode7 + (d3 == null ? 0 : d3.hashCode())) * 31;
        rk10 rk10Var = this.i;
        int iHashCode9 = (iHashCode8 + (rk10Var == null ? 0 : rk10Var.hashCode())) * 31;
        List list3 = this.j;
        int iHashCode10 = (iHashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.k;
        return iHashCode10 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = cs0.q(this.b, this.f9650a, "EasternNightsScrollCellResponse(accountId=", ", actionStep=", ", betSum=");
        sbQ.append(this.c);
        sbQ.append(", itemPositions=");
        sbQ.append(this.d);
        sbQ.append(", playerPositions=");
        sbQ.append(this.e);
        sbQ.append(", newBalance=");
        sbQ.append(this.f);
        sbQ.append(", cellStatus=");
        hne.z(sbQ, this.g, ", winSum=", this.h, ", bonus=");
        sbQ.append(this.i);
        sbQ.append(", winSums=");
        sbQ.append(this.j);
        sbQ.append(", coefficients=");
        return dw9.r(sbQ, this.k, Separators.RPAREN);
    }
}
