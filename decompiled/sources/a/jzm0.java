package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class jzm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17422a;
    public final String b;

    public jzm0(String str, String str2) {
        this.f17422a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzm0)) {
            return false;
        }
        jzm0 jzm0Var = (jzm0) obj;
        return this.f17422a.equals(jzm0Var.f17422a) && this.b.equals(jzm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17422a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("SubScoreModel(opponent1=", this.f17422a, ", opponent2=", this.b, Separators.RPAREN);
    }
}
