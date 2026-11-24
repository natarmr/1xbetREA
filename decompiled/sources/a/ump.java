package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ump implements wmp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f35928a;

    public ump(sjd sjdVar) {
        this.f35928a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ump) && this.f35928a.equals(((ump) obj).f35928a);
    }

    public final int hashCode() {
        return this.f35928a.hashCode();
    }

    public final String toString() {
        return vqd.n("ComposeDelegateSideEffect(internal=", this.f35928a, Separators.RPAREN);
    }
}
