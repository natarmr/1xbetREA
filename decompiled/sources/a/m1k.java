package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class m1k implements u1k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21012a;

    public final boolean equals(Object obj) {
        if (obj instanceof m1k) {
            return this.f21012a.equals(((m1k) obj).f21012a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21012a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnRegistrationClick(deviceId=", this.f21012a, Separators.RPAREN);
    }
}
