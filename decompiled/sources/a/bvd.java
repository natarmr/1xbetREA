package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bvd implements evd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3274a;

    public bvd(String str) {
        this.f3274a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bvd) && this.f3274a.equals(((bvd) obj).f3274a);
    }

    public final int hashCode() {
        return this.f3274a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowNoAuthenticatorErrorDialog(message=", this.f3274a, Separators.RPAREN);
    }
}
