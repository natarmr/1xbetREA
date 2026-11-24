package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class kl90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18476a;
    public final boolean b;

    public kl90(int i, boolean z) {
        this.f18476a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl90)) {
            return false;
        }
        kl90 kl90Var = (kl90) obj;
        return this.f18476a == kl90Var.f18476a && this.b == kl90Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f18476a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f18476a, "PhoneCodeManuallySelectedParams(countryId=", ", countryAllowed=", Separators.RPAREN, this.b);
    }
}
