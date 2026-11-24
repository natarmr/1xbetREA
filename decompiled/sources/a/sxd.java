package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class sxd implements vxd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32972a;

    public sxd(String str) {
        this.f32972a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sxd) && this.f32972a.equals(((sxd) obj).f32972a);
    }

    public final int hashCode() {
        return this.f32972a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowNoAuthenticatorErrorDialog(message=", this.f32972a, Separators.RPAREN);
    }
}
