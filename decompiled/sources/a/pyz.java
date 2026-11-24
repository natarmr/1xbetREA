package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class pyz implements qyz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27821a;

    public final boolean equals(Object obj) {
        if (obj instanceof pyz) {
            return this.f27821a.equals(((pyz) obj).f27821a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27821a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorDialog(message=", this.f27821a, Separators.RPAREN);
    }
}
