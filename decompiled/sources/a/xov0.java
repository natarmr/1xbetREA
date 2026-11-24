package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xov0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41241a;
    public final int b;

    public xov0(String str, int i) {
        str.getClass();
        this.f41241a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xov0)) {
            return false;
        }
        xov0 xov0Var = (xov0) obj;
        return Intrinsics.d(this.f41241a, xov0Var.f41241a) && this.b == xov0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f41241a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "WorkGenerationalId(workSpecId=", this.f41241a, ", generation=", Separators.RPAREN);
    }
}
