package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class dpo implements gpo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6478a;

    public final boolean equals(Object obj) {
        if (obj instanceof dpo) {
            return this.f6478a.equals(((dpo) obj).f6478a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6478a.hashCode();
    }

    public final String toString() {
        return kng0.l("CoefLabelText(value=", this.f6478a, Separators.RPAREN);
    }
}
