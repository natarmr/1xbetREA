package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tge implements cie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f33906a;

    public tge(mdm mdmVar) {
        this.f33906a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tge) && this.f33906a.equals(((tge) obj).f33906a);
    }

    public final int hashCode() {
        return this.f33906a.hashCode();
    }

    public final String toString() {
        return b1j.j("ConnectionError(lottieConfig=", this.f33906a, Separators.RPAREN);
    }
}
