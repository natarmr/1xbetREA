package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class b5p implements c5p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f2014a;

    public b5p(sjd sjdVar) {
        this.f2014a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b5p) && this.f2014a.equals(((b5p) obj).f2014a);
    }

    public final int hashCode() {
        return this.f2014a.hashCode();
    }

    public final String toString() {
        return vqd.n("SendGameCardSideEffect(internalEffect=", this.f2014a, Separators.RPAREN);
    }
}
