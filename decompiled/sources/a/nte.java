package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class nte implements ute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24095a;

    public final boolean equals(Object obj) {
        if (obj instanceof nte) {
            return this.f24095a.equals(((nte) obj).f24095a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24095a.hashCode();
    }

    public final String toString() {
        return kng0.l("OptionBetText(value=", this.f24095a, Separators.RPAREN);
    }
}
