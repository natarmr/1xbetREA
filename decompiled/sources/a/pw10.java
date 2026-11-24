package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pw10 implements qw10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27689a;
    public final int b;

    public pw10(String str, int i) {
        this.f27689a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pw10)) {
            return false;
        }
        pw10 pw10Var = (pw10) obj;
        return this.f27689a.equals(pw10Var.f27689a) && this.b == pw10Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f27689a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "Url(value=", this.f27689a, ", defaultLogoRes=", Separators.RPAREN);
    }
}
