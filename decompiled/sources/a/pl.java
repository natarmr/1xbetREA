package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27158a;
    public final String b;

    public pl(String str, String str2) {
        this.f27158a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl)) {
            return false;
        }
        pl plVar = (pl) obj;
        return this.f27158a.equals(plVar.f27158a) && this.b.equals(plVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f27158a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ActiveCallDomainsModel(domain=", this.f27158a, ", domainAddress=", this.b, Separators.RPAREN);
    }
}
