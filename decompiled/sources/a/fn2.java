package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fn2 implements jn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f9812a;

    public final boolean equals(Object obj) {
        if (obj instanceof fn2) {
            return this.f9812a.equals(((fn2) obj).f9812a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9812a.hashCode();
    }

    public final String toString() {
        return vqd.n("CardSideEffect(value=", this.f9812a, Separators.RPAREN);
    }
}
