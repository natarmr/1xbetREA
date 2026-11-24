package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rpo implements tpo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30896a;

    public final boolean equals(Object obj) {
        if (obj instanceof rpo) {
            return this.f30896a.equals(((rpo) obj).f30896a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30896a.hashCode();
    }

    public final String toString() {
        return kng0.l("Coeff(value=", this.f30896a, Separators.RPAREN);
    }
}
