package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class a9h0 implements e9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f477a;

    public a9h0(int i) {
        this.f477a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a9h0) && this.f477a == ((a9h0) obj).f477a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f477a);
    }

    public final String toString() {
        return ua80.e(this.f477a, "StartTaxStatusWorker(countryId=", Separators.RPAREN);
    }
}
