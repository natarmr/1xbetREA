package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fec implements jec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9399a;

    public fec(int i) {
        this.f9399a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fec) && this.f9399a == ((fec) obj).f9399a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9399a);
    }

    public final String toString() {
        return ua80.e(this.f9399a, "OnItemClicked(countryId=", Separators.RPAREN);
    }
}
