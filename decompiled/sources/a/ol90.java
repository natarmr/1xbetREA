package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ol90 implements ul90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25441a;

    public final boolean equals(Object obj) {
        if (obj instanceof ol90) {
            return this.f25441a.equals(((ol90) obj).f25441a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25441a.hashCode();
    }

    public final String toString() {
        return kng0.l("CountryImage(value=", this.f25441a, Separators.RPAREN);
    }
}
