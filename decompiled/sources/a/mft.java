package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class mft {
    public static final lft Companion = new lft();
    public static final a8z[] i = {null, maz.a(wez.f39042a, new tet(3)), null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f21710a;
    public final List b;
    public final Integer c;
    public final Double d;
    public final Double e;
    public final Long f;
    public final Double g;
    public final rk10 h;

    public /* synthetic */ mft(int i2, Integer num, List list, Integer num2, Double d, Double d2, Long l, Double d3, rk10 rk10Var) {
        if ((i2 & 1) == 0) {
            this.f21710a = null;
        } else {
            this.f21710a = num;
        }
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = d;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = d2;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = l;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = d3;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = rk10Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mft)) {
            return false;
        }
        mft mftVar = (mft) obj;
        return Intrinsics.d(this.f21710a, mftVar.f21710a) && Intrinsics.d(this.b, mftVar.b) && Intrinsics.d(this.c, mftVar.c) && Intrinsics.d(this.d, mftVar.d) && Intrinsics.d(this.e, mftVar.e) && Intrinsics.d(this.f, mftVar.f) && Intrinsics.d(this.g, mftVar.g) && Intrinsics.d(this.h, mftVar.h);
    }

    public final int hashCode() {
        Integer num = this.f21710a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.d;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.e;
        int iHashCode5 = (iHashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Long l = this.f;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Double d3 = this.g;
        int iHashCode7 = (iHashCode6 + (d3 == null ? 0 : d3.hashCode())) * 31;
        rk10 rk10Var = this.h;
        return iHashCode7 + (rk10Var != null ? rk10Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GemsOdysseyGameResponse(actionNumber=");
        sb.append(this.f21710a);
        sb.append(", result=");
        sb.append(this.b);
        sb.append(", state=");
        hne.z(sb, this.c, ", betSum=", this.d, ", sumWin=");
        sb.append(this.e);
        sb.append(", accountId=");
        sb.append(this.f);
        sb.append(", balanceNew=");
        sb.append(this.g);
        sb.append(", bonusInfo=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
