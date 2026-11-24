package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class a2q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f135a;
    public final boolean b;

    public a2q(boolean z, boolean z2) {
        this.f135a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2q)) {
            return false;
        }
        a2q a2qVar = (a2q) obj;
        return this.f135a == a2qVar.f135a && this.b == a2qVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f135a) * 31);
    }

    public final String toString() {
        return hne.n("RulesConfirmation(isRequired=", ", isRulesConfirmation=", Separators.RPAREN, this.f135a, this.b);
    }
}
