package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class alr implements jlr {
    public final long b;
    public final sip c;

    public alr(long j, sip sipVar) {
        sipVar.getClass();
        this.b = j;
        this.c = sipVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alr)) {
            return false;
        }
        alr alrVar = (alr) obj;
        return bds.a(this.b, alrVar.b) && this.c == alrVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "Error(gameId=" + bds.b(this.b) + ", feedKind=" + this.c + Separators.RPAREN;
    }
}
