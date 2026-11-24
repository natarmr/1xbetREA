package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bhk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2611a;
    public final String b;

    public bhk(String str, String str2) {
        this.f2611a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhk)) {
            return false;
        }
        bhk bhkVar = (bhk) obj;
        return this.f2611a.equals(bhkVar.f2611a) && this.b.equals(bhkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2611a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("DeviceName(retailBranding=", this.f2611a, ", marketingName=", this.b, Separators.RPAREN);
    }
}
