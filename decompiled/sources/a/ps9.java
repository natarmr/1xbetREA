package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ps9 implements ts9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f27505a;

    public ps9(mdm mdmVar) {
        this.f27505a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ps9) && this.f27505a.equals(((ps9) obj).f27505a);
    }

    public final int hashCode() {
        return this.f27505a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfig=", this.f27505a, Separators.RPAREN);
    }
}
