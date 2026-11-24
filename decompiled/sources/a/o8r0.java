package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class o8r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8r0 f24845a;
    public final int b;

    public o8r0(n8r0 n8r0Var, int i) {
        this.f24845a = n8r0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8r0)) {
            return false;
        }
        o8r0 o8r0Var = (o8r0) obj;
        return this.f24845a == o8r0Var.f24845a && this.b == o8r0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f24845a.hashCode() * 31);
    }

    public final String toString() {
        return "TopLottieModel(errorType=" + this.f24845a + ", configType=" + this.b + Separators.RPAREN;
    }
}
