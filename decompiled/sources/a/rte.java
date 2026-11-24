package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class rte implements ute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31074a;

    public final boolean equals(Object obj) {
        if (obj instanceof rte) {
            return this.f31074a.equals(((rte) obj).f31074a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31074a.hashCode();
    }

    public final String toString() {
        return kng0.l("TagText(value=", this.f31074a, Separators.RPAREN);
    }
}
