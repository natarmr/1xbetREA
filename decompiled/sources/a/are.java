package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class are {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1342a;
    public final boolean b;

    public are(int i, boolean z) {
        this.f1342a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof are)) {
            return false;
        }
        are areVar = (are) obj;
        return this.f1342a == areVar.f1342a && this.b == areVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f1342a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f1342a, "CountryModel(country=", ", fCountry=", Separators.RPAREN, this.b);
    }
}
