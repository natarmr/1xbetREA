package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class blr implements jlr {
    public final long b;
    public final long c;

    public blr(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blr)) {
            return false;
        }
        blr blrVar = (blr) obj;
        return bds.a(this.b, blrVar.b) && wen.d(this.c, blrVar.c);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.b) * 31;
        uen uenVar = wen.b;
        return Long.hashCode(this.c) + iHashCode;
    }

    public final String toString() {
        return b1j.k("FindLive(gameId=", bds.b(this.b), ", before=", wen.m(this.c), Separators.RPAREN);
    }
}
