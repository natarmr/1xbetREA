package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bba0 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2299a;

    public final boolean equals(Object obj) {
        if (obj instanceof bba0) {
            return this.f2299a.equals(((bba0) obj).f2299a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2299a.hashCode();
    }

    public final String toString() {
        return kng0.l("HeroImage(value=", this.f2299a, Separators.RPAREN);
    }
}
