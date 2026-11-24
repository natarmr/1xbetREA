package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class szf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33068a;
    public final boolean b;

    public szf(boolean z, boolean z2) {
        this.f33068a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szf)) {
            return false;
        }
        szf szfVar = (szf) obj;
        return this.f33068a == szfVar.f33068a && this.b == szfVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f33068a) * 31);
    }

    public final String toString() {
        return hne.n("CutCoefsStateModel(lnC=", ", lvC=", Separators.RPAREN, this.f33068a, this.b);
    }
}
