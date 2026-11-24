package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class bzb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3457a;
    public final boolean b;

    public bzb(boolean z, boolean z2) {
        this.f3457a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzb)) {
            return false;
        }
        bzb bzbVar = (bzb) obj;
        return this.f3457a == bzbVar.f3457a && this.b == bzbVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f3457a) * 31);
    }

    public final String toString() {
        return hne.n("CheckBlockModel(allowedCountry=", ", allowedPartner=", Separators.RPAREN, this.f3457a, this.b);
    }
}
