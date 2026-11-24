package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class h2q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12347a;
    public final boolean b;

    public h2q(boolean z, boolean z2) {
        this.f12347a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2q)) {
            return false;
        }
        h2q h2qVar = (h2q) obj;
        return this.f12347a == h2qVar.f12347a && this.b == h2qVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f12347a) * 31);
    }

    public final String toString() {
        return hne.n("SharePersonalDataConfirmation(isRequired=", ", isSharePersonalDataConfirmation=", Separators.RPAREN, this.f12347a, this.b);
    }
}
