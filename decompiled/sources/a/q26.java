package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q26 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27986a;
    public final lk50 b;
    public final List c;
    public final boolean d;
    public final boolean e;

    public q26(String str, lk50 lk50Var, List list, boolean z, boolean z2) {
        str.getClass();
        list.getClass();
        this.f27986a = str;
        this.b = lk50Var;
        this.c = list;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q26)) {
            return false;
        }
        q26 q26Var = (q26) obj;
        return Intrinsics.d(this.f27986a, q26Var.f27986a) && Intrinsics.d(this.b, q26Var.b) && Intrinsics.d(this.c, q26Var.c) && this.d == q26Var.d && this.e == q26Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.f27986a.hashCode() * 31;
        lk50 lk50Var = this.b;
        return Boolean.hashCode(this.e) + brm0.e(dw9.a((iHashCode + (lk50Var == null ? 0 : lk50Var.hashCode())) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchUiModel(searchTextResult=");
        sb.append(this.f27986a);
        sb.append(", currentResult=");
        sb.append(this.b);
        sb.append(", allResult=");
        rz4.z(sb, ", previousActive=", this.c, ", nextActive=", this.d);
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
