package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class z5r0 implements n6r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f43833a;

    public final boolean equals(Object obj) {
        if (obj instanceof z5r0) {
            return this.f43833a.equals(((z5r0) obj).f43833a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f43833a.hashCode();
    }

    public final String toString() {
        return twn.n("DsGameCardAction(action=", this.f43833a, Separators.RPAREN);
    }
}
