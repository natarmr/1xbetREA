package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class aht {
    public static final zgt Companion = new zgt();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new tet(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f889a;
    public final List b;

    public /* synthetic */ aht(int i, Double d, List list) {
        if ((i & 1) == 0) {
            this.f889a = null;
        } else {
            this.f889a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aht)) {
            return false;
        }
        aht ahtVar = (aht) obj;
        return Intrinsics.d(this.f889a, ahtVar.f889a) && Intrinsics.d(this.b, ahtVar.b);
    }

    public final int hashCode() {
        Double d = this.f889a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "GenerateCouponDataResponse(coefficient=" + this.f889a + ", findCouponDescs=" + this.b + Separators.RPAREN;
    }
}
