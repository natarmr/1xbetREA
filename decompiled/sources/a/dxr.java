package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dxr implements ixr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6860a;

    public final boolean equals(Object obj) {
        if (obj instanceof dxr) {
            return this.f6860a.equals(((dxr) obj).f6860a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6860a.hashCode();
    }

    public final String toString() {
        return kng0.l("GameLabel(value=", this.f6860a, Separators.RPAREN);
    }
}
