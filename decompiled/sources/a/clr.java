package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class clr implements jlr {
    public final long b;

    public clr(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof clr) && bds.a(this.b, ((clr) obj).b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return kng0.l("Finished(gameId=", bds.b(this.b), Separators.RPAREN);
    }
}
