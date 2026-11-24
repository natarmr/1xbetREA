package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class eis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f7874a;

    public eis(sjd sjdVar) {
        this.f7874a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eis) && this.f7874a.equals(((eis) obj).f7874a);
    }

    public final int hashCode() {
        return this.f7874a.hashCode();
    }

    public final String toString() {
        return vqd.n("SendGameCardSideEffect(internalEffect=", this.f7874a, Separators.RPAREN);
    }
}
