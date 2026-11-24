package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class cca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4100a;
    public final c280 b;

    public cca(c280 c280Var, String str) {
        this.f4100a = str;
        this.b = c280Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cca)) {
            return false;
        }
        cca ccaVar = (cca) obj;
        return this.f4100a.equals(ccaVar.f4100a) && this.b.equals(ccaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4100a.hashCode() * 31);
    }

    public final String toString() {
        return "V3(opponentLabel=" + this.f4100a + ", opponentIcon=" + this.b + Separators.RPAREN;
    }
}
