package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class vam0 extends ufx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f37097a;

    public vam0(mdm mdmVar) {
        this.f37097a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vam0) && this.f37097a.equals(((vam0) obj).f37097a);
    }

    public final int hashCode() {
        return this.f37097a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfig=", this.f37097a, Separators.RPAREN);
    }
}
