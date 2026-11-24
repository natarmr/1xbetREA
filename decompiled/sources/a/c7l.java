package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class c7l implements e7l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3869a;

    public final boolean equals(Object obj) {
        if (obj instanceof c7l) {
            return this.f3869a.equals(((c7l) obj).f3869a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3869a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackbar(message=", this.f3869a, Separators.RPAREN);
    }
}
