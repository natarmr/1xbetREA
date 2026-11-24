package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class g3w0 implements k3w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10633a;

    public final boolean equals(Object obj) {
        if (obj instanceof g3w0) {
            return this.f10633a.equals(((g3w0) obj).f10633a);
        }
        return false;
    }

    @Override // a.k3w0
    public final String getValue() {
        return this.f10633a;
    }

    public final int hashCode() {
        return this.f10633a.hashCode();
    }

    public final String toString() {
        return kng0.l("Default(value=", this.f10633a, Separators.RPAREN);
    }
}
