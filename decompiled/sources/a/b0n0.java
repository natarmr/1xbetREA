package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class b0n0 implements d0n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1773a;

    public b0n0(int i) {
        this.f1773a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0n0) && this.f1773a == ((b0n0) obj).f1773a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1773a);
    }

    public final String toString() {
        return ua80.e(this.f1773a, "SelectCountry(countryId=", Separators.RPAREN);
    }
}
