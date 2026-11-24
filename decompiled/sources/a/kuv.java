package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class kuv {
    public static final juv Companion = new juv();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18932a;
    public final List b;
    public final Integer c;
    public final List d;

    static {
        wez wezVar = wez.f39042a;
        e = new a8z[]{maz.a(wezVar, new ldv((byte) 19)), maz.a(wezVar, new ldv((byte) 20)), null, maz.a(wezVar, new ldv((byte) 21))};
    }

    public /* synthetic */ kuv(int i, Integer num, List list, List list2, List list3) {
        if ((i & 1) == 0) {
            this.f18932a = null;
        } else {
            this.f18932a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kuv)) {
            return false;
        }
        kuv kuvVar = (kuv) obj;
        return Intrinsics.d(this.f18932a, kuvVar.f18932a) && Intrinsics.d(this.b, kuvVar.b) && Intrinsics.d(this.c, kuvVar.c) && Intrinsics.d(this.d, kuvVar.d);
    }

    public final int hashCode() {
        List list = this.f18932a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List list3 = this.d;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("HeatMapStatisticResponse(teams=", ", players=", this.f18932a, ", sportId=", this.b);
        sbT.append(this.c);
        sbT.append(", response=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
