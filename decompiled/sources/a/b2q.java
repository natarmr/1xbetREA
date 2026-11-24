package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class b2q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1865a;
    public final boolean b;

    public b2q(boolean z, boolean z2) {
        this.f1865a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2q)) {
            return false;
        }
        b2q b2qVar = (b2q) obj;
        return this.f1865a == b2qVar.f1865a && this.b == b2qVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f1865a) * 31);
    }

    public final String toString() {
        return hne.n("RulesConfirmationAll(isRequired=", ", isRulesConfirmationAll=", Separators.RPAREN, this.f1865a, this.b);
    }
}
