package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class s0m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31415a;
    public final String b;

    public s0m(String str, String str2) {
        this.f31415a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0m)) {
            return false;
        }
        s0m s0mVar = (s0m) obj;
        return this.f31415a.equals(s0mVar.f31415a) && this.b.equals(s0mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f31415a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("DsCountryModel(title=", this.f31415a, ", image=", this.b, Separators.RPAREN);
    }
}
