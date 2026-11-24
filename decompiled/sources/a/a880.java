package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class a880 implements c880 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f414a;

    public a880(mdm mdmVar) {
        this.f414a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a880) && this.f414a.equals(((a880) obj).f414a);
    }

    public final int hashCode() {
        return this.f414a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfig=", this.f414a, Separators.RPAREN);
    }
}
