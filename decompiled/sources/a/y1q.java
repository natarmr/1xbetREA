package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class y1q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41870a;
    public final int b;

    public y1q(boolean z, int i) {
        this.f41870a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1q)) {
            return false;
        }
        y1q y1qVar = (y1q) obj;
        return this.f41870a == y1qVar.f41870a && this.b == y1qVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.f41870a) * 31);
    }

    public final String toString() {
        return "Region(isRequired=" + this.f41870a + ", id=" + this.b + Separators.RPAREN;
    }
}
