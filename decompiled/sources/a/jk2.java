package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jk2 implements xk2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f16644a;

    public final boolean equals(Object obj) {
        if (obj instanceof jk2) {
            return this.f16644a.equals(((jk2) obj).f16644a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16644a.hashCode();
    }

    public final String toString() {
        return twn.n("GameCardAction(action=", this.f16644a, Separators.RPAREN);
    }
}
