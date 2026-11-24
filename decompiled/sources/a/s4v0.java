package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class s4v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31627a;
    public final int b;

    public s4v0(String str, int i) {
        this.f31627a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4v0)) {
            return false;
        }
        s4v0 s4v0Var = (s4v0) obj;
        return this.f31627a.equals(s4v0Var.f31627a) && this.b == s4v0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f31627a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "WebStatSettings(fullUrl=", this.f31627a, ", projectId=", Separators.RPAREN);
    }
}
