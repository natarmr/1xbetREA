package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nxc0 implements pxc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24277a;

    public nxc0(String str) {
        this.f24277a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nxc0) && this.f24277a.equals(((nxc0) obj).f24277a);
    }

    public final int hashCode() {
        return this.f24277a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenDeepLink(deeplink=", this.f24277a, Separators.RPAREN);
    }
}
