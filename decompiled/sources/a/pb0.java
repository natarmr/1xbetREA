package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class pb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql5 f26680a;

    public pb0(ql5 ql5Var) {
        this.f26680a = ql5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pb0) && Intrinsics.d(this.f26680a, ((pb0) obj).f26680a);
    }

    public final int hashCode() {
        ql5 ql5Var = this.f26680a;
        if (ql5Var == null) {
            return 0;
        }
        return ql5Var.hashCode();
    }

    public final String toString() {
        return cs0.j(this.f26680a, "AggregatorBalanceDelegateState(balance=", Separators.RPAREN);
    }
}
