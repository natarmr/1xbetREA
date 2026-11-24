package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pqg implements qqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27415a;

    public pqg(int i) {
        this.f27415a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pqg) && this.f27415a == ((pqg) obj).f27415a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27415a);
    }

    public final String toString() {
        return ua80.e(this.f27415a, "ShowSnackbar(message=", Separators.RPAREN);
    }
}
