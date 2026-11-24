package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xhh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40892a;
    public final lk50 b;
    public final List c;
    public final boolean d;
    public final boolean e;

    public xhh0(String str, lk50 lk50Var, List list, boolean z, boolean z2) {
        str.getClass();
        list.getClass();
        this.f40892a = str;
        this.b = lk50Var;
        this.c = list;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhh0)) {
            return false;
        }
        xhh0 xhh0Var = (xhh0) obj;
        return Intrinsics.d(this.f40892a, xhh0Var.f40892a) && Intrinsics.d(this.b, xhh0Var.b) && Intrinsics.d(this.c, xhh0Var.c) && this.d == xhh0Var.d && this.e == xhh0Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.f40892a.hashCode() * 31;
        lk50 lk50Var = this.b;
        return Boolean.hashCode(this.e) + brm0.e(dw9.a((iHashCode + (lk50Var == null ? 0 : lk50Var.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchUiModel(searchTextResult=");
        sb.append(this.f40892a);
        sb.append(", currentResult=");
        sb.append(this.b);
        sb.append(", allResult=");
        rz4.z(sb, ", previousActive=", this.c, ", nextActive=", this.d);
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
