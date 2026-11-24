package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class k1m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17533a;
    public final String b;
    public final boolean c;

    public k1m0(String str, String str2) {
        this.f17533a = str;
        this.b = str2;
        this.c = twn.p("[()]", str, "").length() > 0 || twn.p("[()]", str2, "").length() > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1m0)) {
            return false;
        }
        k1m0 k1m0Var = (k1m0) obj;
        return this.f17533a.equals(k1m0Var.f17533a) && this.b.equals(k1m0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17533a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("StageNetSeedModel(firstSeed=", this.f17533a, ", secondSeed=", this.b, Separators.RPAREN);
    }
}
