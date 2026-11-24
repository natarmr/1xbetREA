package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class w8o implements y8o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f38732a;

    public w8o(sjd sjdVar) {
        this.f38732a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w8o) && this.f38732a.equals(((w8o) obj).f38732a);
    }

    public final int hashCode() {
        return this.f38732a.hashCode();
    }

    public final String toString() {
        return vqd.n("ComposeSendGameCardSideEffect(internalEffect=", this.f38732a, Separators.RPAREN);
    }
}
