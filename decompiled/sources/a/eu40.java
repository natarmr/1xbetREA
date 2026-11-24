package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class eu40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8401a;
    public final long b;
    public final boolean c;

    public eu40(long j, boolean z, long j2) {
        this.f8401a = j;
        this.b = j2;
        this.c = z;
    }

    public final eu40 a(eu40 eu40Var) {
        return new eu40(ne60.f(this.f8401a, eu40Var.f8401a), this.c, Math.max(this.b, eu40Var.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu40)) {
            return false;
        }
        eu40 eu40Var = (eu40) obj;
        return ne60.c(this.f8401a, eu40Var.f8401a) && this.b == eu40Var.b && this.c == eu40Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rw2.b(Long.hashCode(this.f8401a) * 31, 31, this.b);
    }

    public final String toString() {
        return f140.n(f140.o(this.b, "MouseWheelScrollDelta(value=", ne60.h(this.f8401a), ", timeMillis="), ", shouldApplyImmediately=", this.c, Separators.RPAREN);
    }
}
