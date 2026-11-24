package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class n6b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udl0 f22988a;
    public final boolean b;

    public n6b(udl0 udl0Var, boolean z) {
        this.f22988a = udl0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6b)) {
            return false;
        }
        n6b n6bVar = (n6b) obj;
        return this.f22988a == n6bVar.f22988a && this.b == n6bVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f22988a.hashCode() * 31);
    }

    public final String toString() {
        return "CategoryMarketsSettingsModel(sportGameType=" + this.f22988a + ", isNewEventParams=" + this.b + Separators.RPAREN;
    }
}
