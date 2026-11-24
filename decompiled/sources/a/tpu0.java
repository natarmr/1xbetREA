package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tpu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f34354a;

    public tpu0(sjd sjdVar) {
        this.f34354a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tpu0) && this.f34354a.equals(((tpu0) obj).f34354a);
    }

    public final int hashCode() {
        return this.f34354a.hashCode();
    }

    public final String toString() {
        return vqd.n("ComposeSendGameCardSideEffect(internalEffect=", this.f34354a, Separators.RPAREN);
    }
}
