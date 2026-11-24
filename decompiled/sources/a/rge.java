package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class rge implements die {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f30430a;

    public rge(mdm mdmVar) {
        this.f30430a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rge) && this.f30430a.equals(((rge) obj).f30430a);
    }

    public final int hashCode() {
        return this.f30430a.hashCode();
    }

    public final String toString() {
        return b1j.j("ConnectionError(lottieConfig=", this.f30430a, Separators.RPAREN);
    }
}
