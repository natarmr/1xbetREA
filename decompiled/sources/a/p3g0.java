package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class p3g0 implements q3g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f26299a;

    public final boolean equals(Object obj) {
        if (obj instanceof p3g0) {
            return this.f26299a.equals(((p3g0) obj).f26299a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26299a.hashCode();
    }

    public final String toString() {
        return twn.n("ResultGameCardAction(action=", this.f26299a, Separators.RPAREN);
    }
}
