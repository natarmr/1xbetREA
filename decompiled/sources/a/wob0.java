package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class wob0 implements yob0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39487a;

    public final boolean equals(Object obj) {
        if (obj instanceof wob0) {
            return this.f39487a.equals(((wob0) obj).f39487a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39487a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorDialog(errorMessage=", this.f39487a, Separators.RPAREN);
    }
}
