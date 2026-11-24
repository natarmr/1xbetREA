package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wl4 implements xl4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39336a;

    public wl4(String str) {
        this.f39336a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wl4) && this.f39336a.equals(((wl4) obj).f39336a);
    }

    public final int hashCode() {
        return this.f39336a.hashCode();
    }

    public final String toString() {
        return kng0.l("UpdateVerified(authCode=", this.f39336a, Separators.RPAREN);
    }
}
