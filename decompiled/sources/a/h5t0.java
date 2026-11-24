package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h5t0 implements k5t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7m0 f12498a;
    public final boolean b;

    public h5t0(l7m0 l7m0Var, boolean z) {
        l7m0Var.getClass();
        this.f12498a = l7m0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5t0)) {
            return false;
        }
        h5t0 h5t0Var = (h5t0) obj;
        return Intrinsics.d(this.f12498a, h5t0Var.f12498a) && this.b == h5t0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f12498a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(itemsState=" + this.f12498a + ", resetScroll=" + this.b + Separators.RPAREN;
    }
}
