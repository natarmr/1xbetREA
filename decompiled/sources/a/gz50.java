package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gz50 implements iz50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dn60 f12164a;

    public final boolean equals(Object obj) {
        if (obj instanceof gz50) {
            return this.f12164a.equals(((gz50) obj).f12164a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12164a.hashCode();
    }

    public final String toString() {
        return "OneXGames(delegateAction=" + this.f12164a + Separators.RPAREN;
    }
}
