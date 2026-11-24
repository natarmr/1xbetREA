package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class h49 implements i49 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12423a;

    public final boolean equals(Object obj) {
        if (obj instanceof h49) {
            return this.f12423a.equals(((h49) obj).f12423a);
        }
        return false;
    }

    @Override // a.i49
    public final String getDescription() {
        return this.f12423a;
    }

    public final int hashCode() {
        return this.f12423a.hashCode();
    }

    public final String toString() {
        return kng0.l("Zone(description=", this.f12423a, Separators.RPAREN);
    }
}
