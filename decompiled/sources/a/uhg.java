package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class uhg implements vhg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hhq0 f35676a;

    public uhg(hhq0 hhq0Var) {
        hhq0Var.getClass();
        this.f35676a = hhq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uhg) && Intrinsics.d(this.f35676a, ((uhg) obj).f35676a);
    }

    public final int hashCode() {
        return this.f35676a.hashCode();
    }

    public final String toString() {
        return "ShowTimeFilterDialog(timeFilterModel=" + this.f35676a + Separators.RPAREN;
    }
}
