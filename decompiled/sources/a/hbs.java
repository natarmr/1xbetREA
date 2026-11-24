package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class hbs {
    public static final gbs Companion = new gbs();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12785a;
    public final List b;
    public final Integer c;
    public final List d;

    static {
        wez wezVar = wez.f39042a;
        e = new a8z[]{maz.a(wezVar, new o9s((byte) 4)), maz.a(wezVar, new o9s((byte) 5)), null, maz.a(wezVar, new o9s((byte) 6))};
    }

    public /* synthetic */ hbs(int i, Integer num, List list, List list2, List list3) {
        if ((i & 1) == 0) {
            this.f12785a = null;
        } else {
            this.f12785a = list;
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
        if (!(obj instanceof hbs)) {
            return false;
        }
        hbs hbsVar = (hbs) obj;
        return Intrinsics.d(this.f12785a, hbsVar.f12785a) && Intrinsics.d(this.b, hbsVar.b) && Intrinsics.d(this.c, hbsVar.c) && Intrinsics.d(this.d, hbsVar.d);
    }

    public final int hashCode() {
        List list = this.f12785a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List list3 = this.d;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("GameEventsBaseResponse(teams=", ", players=", this.f12785a, ", sportId=", this.b);
        sbT.append(this.c);
        sbT.append(", response=");
        sbT.append(this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
