package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class hqz implements iqz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13507a;

    public hqz(String str) {
        this.f13507a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hqz) && this.f13507a.equals(((hqz) obj).f13507a);
    }

    public final int hashCode() {
        return this.f13507a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorDialog(message=", this.f13507a, Separators.RPAREN);
    }
}
