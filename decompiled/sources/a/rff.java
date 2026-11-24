package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class rff extends uff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lgf f30385a;
    public final boolean b;

    public rff(lgf lgfVar, boolean z) {
        this.f30385a = lgfVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rff)) {
            return false;
        }
        rff rffVar = (rff) obj;
        return this.f30385a.equals(rffVar.f30385a) && this.b == rffVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f30385a.hashCode() * 31);
    }

    public final String toString() {
        return "RestoreGame(gameModel=" + this.f30385a + ", gameInProcess=" + this.b + Separators.RPAREN;
    }
}
