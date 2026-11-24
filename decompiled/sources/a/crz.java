package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class crz implements drz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4867a;

    public crz(String str) {
        this.f4867a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof crz) && this.f4867a.equals(((crz) obj).f4867a);
    }

    public final int hashCode() {
        return this.f4867a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorDialog(message=", this.f4867a, Separators.RPAREN);
    }
}
