package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pwr implements uwr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27724a;

    public final boolean equals(Object obj) {
        if (obj instanceof pwr) {
            return this.f27724a.equals(((pwr) obj).f27724a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27724a.hashCode();
    }

    public final String toString() {
        return kng0.l("GameLabel(value=", this.f27724a, Separators.RPAREN);
    }
}
