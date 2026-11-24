package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xh40 f2193a;
    public final int b;

    public b960(xh40 xh40Var, int i) {
        xh40Var.getClass();
        this.f2193a = xh40Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b960)) {
            return false;
        }
        b960 b960Var = (b960) obj;
        return Intrinsics.d(this.f2193a, b960Var.f2193a) && this.b == b960Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f2193a.hashCode() * 31);
    }

    public final String toString() {
        return "NumberedStep(step=" + this.f2193a + ", number=" + this.b + Separators.RPAREN;
    }
}
