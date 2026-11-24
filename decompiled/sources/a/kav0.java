package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class kav0 extends lav0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17985a;
    public final yxk0 b;

    public kav0(boolean z, yxk0 yxk0Var) {
        yxk0Var.getClass();
        this.f17985a = z;
        this.b = yxk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kav0)) {
            return false;
        }
        kav0 kav0Var = (kav0) obj;
        return this.f17985a == kav0Var.f17985a && this.b == kav0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f17985a) * 31);
    }

    public final String toString() {
        return "SpinWheel(spin=" + this.f17985a + ", result=" + this.b + Separators.RPAREN;
    }
}
