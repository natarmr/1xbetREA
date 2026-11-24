package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vbn0 implements ybn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f37149a;

    public vbn0(sjd sjdVar) {
        this.f37149a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vbn0) && this.f37149a.equals(((vbn0) obj).f37149a);
    }

    public final int hashCode() {
        return this.f37149a.hashCode();
    }

    public final String toString() {
        return vqd.n("ComposeSendGameCardSideEffect(internalEffect=", this.f37149a, Separators.RPAREN);
    }
}
