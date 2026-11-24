package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gaj0 implements taj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql5 f10969a;

    public final boolean equals(Object obj) {
        if (obj instanceof gaj0) {
            return Intrinsics.d(this.f10969a, ((gaj0) obj).f10969a);
        }
        return false;
    }

    public final int hashCode() {
        ql5 ql5Var = this.f10969a;
        if (ql5Var == null) {
            return 0;
        }
        return ql5Var.hashCode();
    }

    public final String toString() {
        return cs0.j(this.f10969a, "ChangeActiveBalance(value=", Separators.RPAREN);
    }
}
