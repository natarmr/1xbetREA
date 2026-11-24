package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class k1j0 implements o1j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17527a;

    public k1j0(String str) {
        this.f17527a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1j0) && this.f17527a.equals(((k1j0) obj).f17527a);
    }

    public final int hashCode() {
        return this.f17527a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackBarError(message=", this.f17527a, Separators.RPAREN);
    }
}
