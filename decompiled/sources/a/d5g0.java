package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class d5g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5504a;
    public final String b;

    public d5g0(String str, String str2) {
        this.f5504a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5g0)) {
            return false;
        }
        d5g0 d5g0Var = (d5g0) obj;
        return this.f5504a.equals(d5g0Var.f5504a) && this.b.equals(d5g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5504a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ResultValuesModel(title=", this.f5504a, ", value=", this.b, Separators.RPAREN);
    }
}
