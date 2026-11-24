package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class dn8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6356a;
    public final skk0 b;

    public dn8(float f, skk0 skk0Var) {
        this.f6356a = f;
        this.b = skk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn8)) {
            return false;
        }
        dn8 dn8Var = (dn8) obj;
        return ycl.b(this.f6356a, dn8Var.f6356a) && this.b.equals(dn8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.f6356a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ycl.c(this.f6356a) + ", brush=" + this.b + Separators.RPAREN;
    }
}
