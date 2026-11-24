package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h0r0 implements a1r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1r0 f12249a;
    public final uhc0 b;

    public h0r0(h1r0 h1r0Var) {
        this.f12249a = h1r0Var;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0r0)) {
            return false;
        }
        h0r0 h0r0Var = (h0r0) obj;
        return Intrinsics.d(this.f12249a, h0r0Var.f12249a) && Intrinsics.d(this.b, h0r0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f12249a.hashCode() * 31;
        uhc0 uhc0Var = this.b;
        return iHashCode + (uhc0Var == null ? 0 : uhc0Var.hashCode());
    }

    public final String toString() {
        return "AggregatorMonthProvider(status=" + this.f12249a + ", value=" + this.b + Separators.RPAREN;
    }

    public h0r0(h1r0 h1r0Var, uhc0 uhc0Var) {
        this.f12249a = h1r0Var;
        this.b = uhc0Var;
    }
}
