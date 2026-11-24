package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class vd10 implements xd10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f37211a;

    public vd10(mdm mdmVar) {
        this.f37211a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vd10) && this.f37211a.equals(((vd10) obj).f37211a);
    }

    public final int hashCode() {
        return this.f37211a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfigurator=", this.f37211a, Separators.RPAREN);
    }
}
