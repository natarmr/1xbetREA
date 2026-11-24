package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class r5b0 implements w5b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f29877a;

    public final boolean equals(Object obj) {
        if (obj instanceof r5b0) {
            return this.f29877a.equals(((r5b0) obj).f29877a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29877a.hashCode();
    }

    public final String toString() {
        return twn.n("DsGameCardAction(action=", this.f29877a, Separators.RPAREN);
    }
}
