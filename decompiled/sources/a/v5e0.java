package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v5e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36823a;
    public final boolean b;
    public final List c;

    public v5e0(List list, boolean z, boolean z2) {
        list.getClass();
        this.f36823a = z;
        this.b = z2;
        this.c = list;
    }

    public static v5e0 a(v5e0 v5e0Var, boolean z, int i) {
        boolean z2 = (i & 2) != 0 ? v5e0Var.b : true;
        List list = v5e0Var.c;
        v5e0Var.getClass();
        list.getClass();
        return new v5e0(list, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5e0)) {
            return false;
        }
        v5e0 v5e0Var = (v5e0) obj;
        return this.f36823a == v5e0Var.f36823a && this.b == v5e0Var.b && Intrinsics.d(this.c, v5e0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Boolean.hashCode(this.f36823a) * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(f140.q("RatingHistoryTableState(isLoading=", ", hasError=", ", ratingModelList=", this.f36823a, this.b), this.c, Separators.RPAREN);
    }
}
