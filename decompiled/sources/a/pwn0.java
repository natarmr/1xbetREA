package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pwn0 implements uwn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27720a;

    public final boolean equals(Object obj) {
        if (obj instanceof pwn0) {
            return this.f27720a.equals(((pwn0) obj).f27720a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27720a.hashCode();
    }

    public final String toString() {
        return kng0.l("Coef(value=", this.f27720a, Separators.RPAREN);
    }
}
