package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class bp6 implements ip6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2966a;
    public final boolean b;

    public bp6(boolean z, boolean z2) {
        this.f2966a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp6)) {
            return false;
        }
        bp6 bp6Var = (bp6) obj;
        return this.f2966a == bp6Var.f2966a && this.b == bp6Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f2966a) * 31);
    }

    public final String toString() {
        return hne.n("ShowMakeBetDialog(isAltDesign=", ", isPromoBetEnabled=", Separators.RPAREN, this.f2966a, this.b);
    }
}
