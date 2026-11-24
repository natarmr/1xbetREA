package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class xga0 implements yga0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40828a;

    public final boolean equals(Object obj) {
        if (obj instanceof xga0) {
            return this.f40828a.equals(((xga0) obj).f40828a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40828a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnClickPlayer(gameId=", this.f40828a, Separators.RPAREN);
    }
}
