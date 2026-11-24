package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hc f30214a;
    public final long b;

    public rc(hc hcVar, long j) {
        this.f30214a = hcVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc)) {
            return false;
        }
        rc rcVar = (rc) obj;
        return this.f30214a == rcVar.f30214a && this.b == rcVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f30214a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionSelected(type=" + this.f30214a + ", balanceId=" + this.b + Separators.RPAREN;
    }
}
