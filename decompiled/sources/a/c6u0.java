package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class c6u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3836a;
    public final int b;

    public c6u0(String str, int i) {
        this.f3836a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6u0)) {
            return false;
        }
        c6u0 c6u0Var = (c6u0) obj;
        return this.f3836a.equals(c6u0Var.f3836a) && this.b == c6u0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f3836a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "VeloJerseyModel(veloJerseyLeaderType=", this.f3836a, ", veloJerseyType=", Separators.RPAREN);
    }
}
