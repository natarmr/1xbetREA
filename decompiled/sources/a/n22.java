package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class n22 implements s22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f22779a;

    public n22(bem bemVar) {
        this.f22779a = bemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n22) && this.f22779a.equals(((n22) obj).f22779a);
    }

    public final int hashCode() {
        return this.f22779a.hashCode();
    }

    public final String toString() {
        return twn.n("DsGameCardAction(action=", this.f22779a, Separators.RPAREN);
    }
}
