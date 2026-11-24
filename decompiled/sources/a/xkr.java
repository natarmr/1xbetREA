package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xkr implements jlr {
    public final long b;
    public final sip c;
    public final m9s d;
    public final long e;

    public xkr(long j, sip sipVar, m9s m9sVar, long j2) {
        sipVar.getClass();
        m9sVar.getClass();
        this.b = j;
        this.c = sipVar;
        this.d = m9sVar;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkr)) {
            return false;
        }
        xkr xkrVar = (xkr) obj;
        return bds.a(this.b, xkrVar.b) && this.c == xkrVar.c && Intrinsics.d(this.d, xkrVar.d) && this.e == xkrVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + (Long.hashCode(this.b) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Active(gameId=" + bds.b(this.b) + ", feedKind=" + this.c + ", gameDetails=" + this.d + ", marketTypeId=" + this.e + Separators.RPAREN;
    }
}
