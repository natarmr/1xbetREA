package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class xe50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40728a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public xe50(float f, float f2, float f3, int i, long j) {
        this.f40728a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xe50.class == obj.getClass()) {
            xe50 xe50Var = (xe50) obj;
            return this.c == xe50Var.c && this.d == xe50Var.d && this.b == xe50Var.b && this.f40728a == xe50Var.f40728a && this.e == xe50Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + twn.a(this.f40728a, defpackage.c.a(defpackage.c.a(Float.hashCode(this.c) * 31, this.d, 31), this.b, 31), 31);
    }

    public final String toString() {
        StringBuilder sbS = dw9.s(this.c, this.d, "NavigationEvent(touchX=", ", touchY=", ", progress=");
        sbS.append(this.b);
        sbS.append(", swipeEdge=");
        sbS.append(this.f40728a);
        sbS.append(", frameTimeMillis=");
        return brm0.k(this.e, Separators.RPAREN, sbS);
    }
}
