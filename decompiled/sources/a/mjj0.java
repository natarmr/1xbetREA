package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mjj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21898a;
    public final float b;
    public final int c;

    public mjj0(float f, float f2, int i) {
        this.f21898a = f;
        this.b = f2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjj0)) {
            return false;
        }
        mjj0 mjj0Var = (mjj0) obj;
        return Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f21898a, mjj0Var.f21898a) == 0 && Float.compare(this.b, mjj0Var.b) == 0 && Float.compare(0.0f, 0.0f) == 0 && this.c == mjj0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + defpackage.c.a(defpackage.c.a(defpackage.c.a(Float.hashCode(0.0f) * 31, this.f21898a, 31), this.b, 31), 0.0f, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, dw9.s(this.f21898a, this.b, "ShadowConfig(offsetX=0.0, offsetY=", ", blurRadius=", ", spreadRadius=0.0, color="));
    }
}
