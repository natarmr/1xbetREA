package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lxd0 implements nxd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20810a;

    public final boolean equals(Object obj) {
        if (obj instanceof lxd0) {
            return this.f20810a.equals(((lxd0) obj).f20810a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20810a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackbar(message=", this.f20810a, Separators.RPAREN);
    }
}
