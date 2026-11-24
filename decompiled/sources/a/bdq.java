package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class bdq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2411a;
    public final List b;
    public final List c;
    public final List d;

    public bdq(List list, List list2, List list3, List list4) {
        hne.C(list, list2, list3, list4);
        this.f2411a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdq)) {
            return false;
        }
        bdq bdqVar = (bdq) obj;
        return Intrinsics.d(this.f2411a, bdqVar.f2411a) && Intrinsics.d(this.b, bdqVar.b) && Intrinsics.d(this.c, bdqVar.c) && Intrinsics.d(this.d, bdqVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(dw9.a(this.f2411a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return kng0.n(", timeRangeList=", Separators.RPAREN, w6x.t("FindCouponModel(couponsTypeList=", ", sportsTypeList=", this.f2411a, ", eventOutcomesList=", this.b), this.c, this.d);
    }
}
