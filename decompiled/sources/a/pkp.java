package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pkp implements rkp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27146a;
    public final boolean b;

    public pkp(int i, boolean z) {
        this.f27146a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkp)) {
            return false;
        }
        pkp pkpVar = (pkp) obj;
        return this.f27146a == pkpVar.f27146a && this.b == pkpVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f27146a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f27146a, "Feedback(rate=", ", resolved=", Separators.RPAREN, this.b);
    }
}
