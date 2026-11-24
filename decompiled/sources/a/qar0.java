package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qar0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final par0 f28411a;
    public final int b;

    public qar0(par0 par0Var, int i) {
        this.f28411a = par0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qar0)) {
            return false;
        }
        qar0 qar0Var = (qar0) obj;
        return this.f28411a == qar0Var.f28411a && this.b == qar0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f28411a.hashCode() * 31);
    }

    public final String toString() {
        return "TopPlayersLottieModel(errorType=" + this.f28411a + ", configType=" + this.b + Separators.RPAREN;
    }
}
