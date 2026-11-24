package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cfg0 implements ffg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4260a;

    public final boolean equals(Object obj) {
        if (obj instanceof cfg0) {
            return this.f4260a.equals(((cfg0) obj).f4260a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4260a.hashCode();
    }

    public final String toString() {
        return kng0.l("RoundNumber(value=", this.f4260a, Separators.RPAREN);
    }
}
