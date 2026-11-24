package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r4g0 implements x4g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f29833a;
    public final boolean b;

    public r4g0(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f29833a = a4xVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4g0)) {
            return false;
        }
        r4g0 r4g0Var = (r4g0) obj;
        return Intrinsics.d(this.f29833a, r4g0Var.f29833a) && this.b == r4g0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f29833a.hashCode() * 31);
    }

    public final String toString() {
        return "Loaded(items=" + this.f29833a + ", needScrollTop=" + this.b + Separators.RPAREN;
    }
}
