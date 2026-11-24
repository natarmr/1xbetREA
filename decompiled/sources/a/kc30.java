package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class kc30 {
    public static final jc30 Companion = new jc30();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18041a;
    public final Integer b;
    public final Integer c;
    public final List d;

    static {
        wez wezVar = wez.f39042a;
        e = new a8z[]{maz.a(wezVar, new n230((byte) 10)), null, null, maz.a(wezVar, new n230((byte) 11))};
    }

    public /* synthetic */ kc30(int i, List list, Integer num, Integer num2, List list2) {
        if ((i & 1) == 0) {
            this.f18041a = null;
        } else {
            this.f18041a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc30)) {
            return false;
        }
        kc30 kc30Var = (kc30) obj;
        return Intrinsics.d(this.f18041a, kc30Var.f18041a) && Intrinsics.d(this.b, kc30Var.b) && Intrinsics.d(this.c, kc30Var.c) && Intrinsics.d(this.d, kc30Var.d);
    }

    public final int hashCode() {
        List list = this.f18041a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list2 = this.d;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = cs0.r(this.b, "MatchProgressCricketStatisticResponse(teams=", ", sportId=", ", subSportId=", this.f18041a);
        sbR.append(this.c);
        sbR.append(", response=");
        sbR.append(this.d);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
