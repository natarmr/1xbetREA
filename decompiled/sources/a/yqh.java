package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class yqh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43075a;
    public final c280 b;
    public final n0x c;

    public yqh(String str, c280 c280Var, n0x n0xVar) {
        this.f43075a = str;
        this.b = c280Var;
        this.c = n0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqh)) {
            return false;
        }
        yqh yqhVar = (yqh) obj;
        return this.f43075a.equals(yqhVar.f43075a) && this.b.equals(yqhVar.b) && this.c.equals(yqhVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + hne.g(this.b, this.f43075a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbP = f140.p(this.b, "CyberUfcCardOpponentModel(opponentName=", this.f43075a, ", opponentIcon=", ", countryIcon=");
        sbP.append(this.c);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
