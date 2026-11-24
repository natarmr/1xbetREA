package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rkq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f30660a;
    public final float b;
    public final long c;

    public rkq(float f, float f2, long j) {
        this.f30660a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rkq)) {
            return false;
        }
        rkq rkqVar = (rkq) obj;
        return Float.compare(this.f30660a, rkqVar.f30660a) == 0 && Float.compare(this.b, rkqVar.b) == 0 && this.c == rkqVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + defpackage.c.a(Float.hashCode(this.f30660a) * 31, this.b, 31);
    }

    public final String toString() {
        return brm0.k(this.c, Separators.RPAREN, dw9.s(this.f30660a, this.b, "FlingInfo(initialVelocity=", ", distance=", ", duration="));
    }
}
