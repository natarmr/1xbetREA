package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vto0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jge0 f38018a;
    public final float b;

    public vto0(jge0 jge0Var, float f) {
        this.f38018a = jge0Var;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vto0)) {
            return false;
        }
        vto0 vto0Var = (vto0) obj;
        return this.f38018a.equals(vto0Var.f38018a) && ycl.b(this.b, vto0Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.f38018a.hashCode() * 31);
    }

    public final String toString() {
        return "TargetArea(rect=" + this.f38018a + ", radiusDp=" + ycl.c(this.b) + Separators.RPAREN;
    }
}
