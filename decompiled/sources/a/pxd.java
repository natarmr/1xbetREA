package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pxd implements vxd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27748a;

    public pxd(String str) {
        this.f27748a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pxd) && this.f27748a.equals(((pxd) obj).f27748a);
    }

    public final int hashCode() {
        return this.f27748a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowExitDialog(message=", this.f27748a, Separators.RPAREN);
    }
}
