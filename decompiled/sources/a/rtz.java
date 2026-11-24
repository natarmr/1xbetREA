package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class rtz implements stz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31099a;

    public final boolean equals(Object obj) {
        if (obj instanceof rtz) {
            return this.f31099a.equals(((rtz) obj).f31099a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31099a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorDialog(message=", this.f31099a, Separators.RPAREN);
    }
}
