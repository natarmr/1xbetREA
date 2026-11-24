package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class s0s0 implements y0s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31425a;
    public final int b;

    public s0s0(String str, int i) {
        this.f31425a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0s0)) {
            return false;
        }
        s0s0 s0s0Var = (s0s0) obj;
        return this.f31425a.equals(s0s0Var.f31425a) && this.b == s0s0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f31425a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "ExpectedError(message=", this.f31425a, ", errorCode=", Separators.RPAREN);
    }
}
