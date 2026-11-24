package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class z0j0 implements o1j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43570a;

    public z0j0(String str) {
        this.f43570a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0j0) && this.f43570a.equals(((z0j0) obj).f43570a);
    }

    public final int hashCode() {
        return this.f43570a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowAppInfoDialog(appInfo=", this.f43570a, Separators.RPAREN);
    }
}
