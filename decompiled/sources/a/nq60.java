package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class nq60 {
    public static final jq60 Companion = new jq60();
    public static final a8z[] f = {null, null, null, null, maz.a(wez.f39042a, new fq60(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f23945a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final List e;

    public /* synthetic */ nq60(int i, Boolean bool, Integer num, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f23945a = null;
        } else {
            this.f23945a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq60)) {
            return false;
        }
        nq60 nq60Var = (nq60) obj;
        return Intrinsics.d(this.f23945a, nq60Var.f23945a) && Intrinsics.d(this.b, nq60Var.b) && Intrinsics.d(this.c, nq60Var.c) && Intrinsics.d(this.d, nq60Var.d) && Intrinsics.d(this.e, nq60Var.e);
    }

    public final int hashCode() {
        Integer num = this.f23945a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f23945a, "GameActionOld(id=", ", name=", this.b, ", desc=");
        h97.v(this.d, this.c, ", underMaintenance=", ", fGActionList=", sbN);
        return dw9.r(sbN, this.e, Separators.RPAREN);
    }
}
