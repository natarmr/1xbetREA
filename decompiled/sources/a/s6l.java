package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class s6l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31709a;

    public final boolean equals(Object obj) {
        if (obj instanceof s6l) {
            return this.f31709a.equals(((s6l) obj).f31709a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31709a.hashCode();
    }

    public final String toString() {
        return kng0.l("HeroIcon(value=", this.f31709a, Separators.RPAREN);
    }
}
