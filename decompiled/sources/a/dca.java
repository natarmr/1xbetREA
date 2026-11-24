package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5841a;
    public final c280 b;

    public dca(c280 c280Var, String str) {
        this.f5841a = str;
        this.b = c280Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dca)) {
            return false;
        }
        dca dcaVar = (dca) obj;
        return this.f5841a.equals(dcaVar.f5841a) && this.b.equals(dcaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5841a.hashCode() * 31);
    }

    public final String toString() {
        return "V4(opponentLabel=" + this.f5841a + ", opponentIcon=" + this.b + Separators.RPAREN;
    }
}
