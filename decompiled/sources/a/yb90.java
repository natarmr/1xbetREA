package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class yb90 implements dc90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42332a;

    @Override // a.dc90
    public final String a() {
        return this.f42332a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yb90) {
            return this.f42332a.equals(((yb90) obj).f42332a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42332a.hashCode();
    }

    public final String toString() {
        return kng0.l("Inactive(penaltyNumber=", this.f42332a, Separators.RPAREN);
    }
}
