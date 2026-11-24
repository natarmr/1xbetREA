package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class fpo implements gpo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9938a;

    public final boolean equals(Object obj) {
        if (obj instanceof fpo) {
            return this.f9938a.equals(((fpo) obj).f9938a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9938a.hashCode();
    }

    public final String toString() {
        return kng0.l("TitleText(value=", this.f9938a, Separators.RPAREN);
    }
}
