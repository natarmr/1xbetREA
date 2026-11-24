package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ukb implements wkb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f35820a;

    public ukb(sjd sjdVar) {
        this.f35820a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ukb) && this.f35820a.equals(((ukb) obj).f35820a);
    }

    public final int hashCode() {
        return this.f35820a.hashCode();
    }

    public final String toString() {
        return vqd.n("SendGameCardSideEffect(internalEffect=", this.f35820a, Separators.RPAREN);
    }
}
