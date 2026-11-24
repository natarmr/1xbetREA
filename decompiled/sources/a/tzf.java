package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tzf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34800a;
    public final boolean b;

    public tzf(boolean z, boolean z2) {
        this.f34800a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzf)) {
            return false;
        }
        tzf tzfVar = (tzf) obj;
        return this.f34800a == tzfVar.f34800a && this.b == tzfVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f34800a) * 31);
    }

    public final String toString() {
        return hne.n("CutCoefsStateModel(lnC=", ", lvC=", Separators.RPAREN, this.f34800a, this.b);
    }
}
