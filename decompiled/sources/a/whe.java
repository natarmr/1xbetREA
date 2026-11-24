package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class whe implements fie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39163a;
    public final boolean b;

    public whe(int i, boolean z) {
        this.f39163a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whe)) {
            return false;
        }
        whe wheVar = (whe) obj;
        return this.f39163a == wheVar.f39163a && this.b == wheVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f39163a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f39163a, "Shimmers(count=", ", isTablet=", Separators.RPAREN, this.b);
    }
}
