package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kjp implements ujp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18398a;

    public kjp(int i) {
        this.f18398a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kjp) && this.f18398a == ((kjp) obj).f18398a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18398a);
    }

    public final String toString() {
        return ua80.e(this.f18398a, "OnRemoveCountry(countryUd=", Separators.RPAREN);
    }
}
