package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ub70 implements vb70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c5v0 f35367a;

    public ub70(c5v0 c5v0Var) {
        this.f35367a = c5v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ub70) && Intrinsics.d(this.f35367a, ((ub70) obj).f35367a);
    }

    public final int hashCode() {
        c5v0 c5v0Var = this.f35367a;
        if (c5v0Var == null) {
            return 0;
        }
        return c5v0Var.hashCode();
    }

    public final String toString() {
        return "StopLoading(webViewHolder=" + this.f35367a + Separators.RPAREN;
    }
}
