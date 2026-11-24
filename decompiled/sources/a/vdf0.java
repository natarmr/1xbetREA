package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class vdf0 implements xdf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f37229a;

    public final boolean equals(Object obj) {
        if (obj instanceof vdf0) {
            return this.f37229a.equals(((vdf0) obj).f37229a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37229a.hashCode();
    }

    public final String toString() {
        return twn.n("GameCardAction(action=", this.f37229a, Separators.RPAREN);
    }
}
