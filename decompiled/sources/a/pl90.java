package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pl90 implements ul90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27172a;

    public final boolean equals(Object obj) {
        if (obj instanceof pl90) {
            return this.f27172a.equals(((pl90) obj).f27172a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27172a.hashCode();
    }

    public final String toString() {
        return kng0.l("Error(value=", this.f27172a, Separators.RPAREN);
    }
}
