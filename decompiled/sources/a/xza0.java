package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xza0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41746a;
    public final boolean b;
    public final List c;

    public xza0(List list, boolean z, boolean z2) {
        this.f41746a = z;
        this.b = z2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xza0)) {
            return false;
        }
        xza0 xza0Var = (xza0) obj;
        return this.f41746a == xza0Var.f41746a && this.b == xza0Var.b && Intrinsics.d(this.c, xza0Var.c);
    }

    public final int hashCode() {
        int iE = brm0.e(Boolean.hashCode(this.f41746a) * 31, 31, this.b);
        List list = this.c;
        return iE + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return dw9.r(f140.q("BannersState(isLoading=", ", isError=", ", bannersList=", this.f41746a, this.b), this.c, Separators.RPAREN);
    }
}
