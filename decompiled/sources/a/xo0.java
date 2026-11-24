package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class xo0 {
    public static final wo0 Companion = new wo0();
    public static final a8z[] e = {null, null, null, maz.a(wez.f39042a, new mg0(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41193a;
    public final String b;
    public final Integer c;
    public final List d;

    public /* synthetic */ xo0(int i, Integer num, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f41193a = null;
        } else {
            this.f41193a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo0)) {
            return false;
        }
        xo0 xo0Var = (xo0) obj;
        return Intrinsics.d(this.f41193a, xo0Var.f41193a) && Intrinsics.d(this.b, xo0Var.b) && Intrinsics.d(this.c, xo0Var.c) && Intrinsics.d(this.d, xo0Var.d);
    }

    public final int hashCode() {
        String str = this.f41193a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AggregatorFilterGroupsDataResponse(id=", this.f41193a, ", name=", this.b, ", filterType=");
        sbN.append(this.c);
        sbN.append(", filters=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
