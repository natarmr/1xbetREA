package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class sbh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f31933a;

    public sbh(sjd sjdVar) {
        this.f31933a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sbh) && this.f31933a.equals(((sbh) obj).f31933a);
    }

    public final int hashCode() {
        return this.f31933a.hashCode();
    }

    public final String toString() {
        return vqd.n("SendGameCardSideEffect(internalEffect=", this.f31933a, Separators.RPAREN);
    }
}
