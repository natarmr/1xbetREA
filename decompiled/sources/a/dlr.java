package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dlr implements jlr {
    public final long b;

    public dlr(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dlr) && bds.a(this.b, ((dlr) obj).b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return kng0.l("Found(gameId=", bds.b(this.b), Separators.RPAREN);
    }
}
