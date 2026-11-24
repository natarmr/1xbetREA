package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ulp implements xlp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f35884a;

    public ulp(mdm mdmVar) {
        this.f35884a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ulp) && this.f35884a.equals(((ulp) obj).f35884a);
    }

    public final int hashCode() {
        return this.f35884a.hashCode();
    }

    public final String toString() {
        return b1j.j("EmptyViewWithTimer(lottieConfig=", this.f35884a, Separators.RPAREN);
    }
}
