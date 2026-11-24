package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class i1q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14012a;
    public final int b;

    public i1q(boolean z, int i) {
        this.f14012a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1q)) {
            return false;
        }
        i1q i1qVar = (i1q) obj;
        return this.f14012a == i1qVar.f14012a && this.b == i1qVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.f14012a) * 31);
    }

    public final String toString() {
        return "DocumentType(isRequired=" + this.f14012a + ", id=" + this.b + Separators.RPAREN;
    }
}
