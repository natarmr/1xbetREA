package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qb70 implements vb70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c5v0 f28434a;

    public qb70(c5v0 c5v0Var) {
        this.f28434a = c5v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qb70) && Intrinsics.d(this.f28434a, ((qb70) obj).f28434a);
    }

    public final int hashCode() {
        c5v0 c5v0Var = this.f28434a;
        if (c5v0Var == null) {
            return 0;
        }
        return c5v0Var.hashCode();
    }

    public final String toString() {
        return "ClearCache(webViewHolder=" + this.f28434a + Separators.RPAREN;
    }
}
