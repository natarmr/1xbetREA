package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class n6y implements o6y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ra10 f23016a;

    public n6y(ra10 ra10Var) {
        this.f23016a = ra10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n6y) && this.f23016a.equals(((n6y) obj).f23016a);
    }

    public final int hashCode() {
        return this.f23016a.hashCode();
    }

    public final String toString() {
        return h97.k("ShowError(config=", this.f23016a, Separators.RPAREN);
    }
}
