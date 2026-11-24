package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class uar implements xar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f35346a;

    public uar(mdm mdmVar) {
        this.f35346a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uar) && this.f35346a.equals(((uar) obj).f35346a);
    }

    public final int hashCode() {
        return this.f35346a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(lottieConfig=", this.f35346a, Separators.RPAREN);
    }
}
