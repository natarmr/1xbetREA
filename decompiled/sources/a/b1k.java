package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class b1k implements u1k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1809a;

    public final boolean equals(Object obj) {
        if (obj instanceof b1k) {
            return this.f1809a.equals(((b1k) obj).f1809a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1809a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnDepositClick(deviceId=", this.f1809a, Separators.RPAREN);
    }
}
