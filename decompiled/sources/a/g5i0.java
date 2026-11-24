package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class g5i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final blv f10720a;
    public final long b;
    public final f5i0 c;
    public final boolean d;

    public g5i0(blv blvVar, long j, f5i0 f5i0Var, boolean z) {
        this.f10720a = blvVar;
        this.b = j;
        this.c = f5i0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5i0)) {
            return false;
        }
        g5i0 g5i0Var = (g5i0) obj;
        return this.f10720a == g5i0Var.f10720a && ne60.c(this.b, g5i0Var.b) && this.c == g5i0Var.c && this.d == g5i0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + rw2.b(this.f10720a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.f10720a + ", position=" + ne60.h(this.b) + ", anchor=" + this.c + ", visible=" + this.d + Separators.RPAREN;
    }
}
