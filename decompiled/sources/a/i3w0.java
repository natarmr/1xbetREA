package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class i3w0 implements k3w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14118a;

    public final boolean equals(Object obj) {
        if (obj instanceof i3w0) {
            return this.f14118a.equals(((i3w0) obj).f14118a);
        }
        return false;
    }

    @Override // a.k3w0
    public final String getValue() {
        return this.f14118a;
    }

    public final int hashCode() {
        return this.f14118a.hashCode();
    }

    public final String toString() {
        return kng0.l("Max(value=", this.f14118a, Separators.RPAREN);
    }
}
