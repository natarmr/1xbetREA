package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class jdq {
    public static final idq Companion = new idq();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16341a;
    public final List b;
    public final List c;
    public final List d;

    static {
        wez wezVar = wez.f39042a;
        e = new a8z[]{maz.a(wezVar, new v9q((byte) 10)), maz.a(wezVar, new v9q((byte) 11)), maz.a(wezVar, new v9q((byte) 12)), maz.a(wezVar, new v9q((byte) 13))};
    }

    public /* synthetic */ jdq(int i, List list, List list2, List list3, List list4) {
        if ((i & 1) == 0) {
            this.f16341a = null;
        } else {
            this.f16341a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdq)) {
            return false;
        }
        jdq jdqVar = (jdq) obj;
        return Intrinsics.d(this.f16341a, jdqVar.f16341a) && Intrinsics.d(this.b, jdqVar.b) && Intrinsics.d(this.c, jdqVar.c) && Intrinsics.d(this.d, jdqVar.d);
    }

    public final int hashCode() {
        List list = this.f16341a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.c;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.d;
        return iHashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        return kng0.n(", timeRangeList=", Separators.RPAREN, w6x.t("FindCouponResponse(couponsTypeList=", ", sportsTypeList=", this.f16341a, ", eventOutcomesList=", this.b), this.c, this.d);
    }
}
