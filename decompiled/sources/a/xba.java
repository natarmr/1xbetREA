package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class xba implements aca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cca f40592a;
    public final cca b;
    public final z1m c;

    public xba(cca ccaVar, cca ccaVar2, z1m z1mVar) {
        this.f40592a = ccaVar;
        this.b = ccaVar2;
        this.c = z1mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xba)) {
            return false;
        }
        xba xbaVar = (xba) obj;
        return this.f40592a.equals(xbaVar.f40592a) && this.b.equals(xbaVar.b) && this.c.equals(xbaVar.c);
    }

    public final int hashCode() {
        return this.c.f43628a.hashCode() + ((this.b.hashCode() + (this.f40592a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TwoOpponents(firstOpponentModel=" + this.f40592a + ", secondOpponentModel=" + this.b + ", score=" + this.c + Separators.RPAREN;
    }
}
