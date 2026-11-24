package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fkk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9697a;
    public final ekk b;

    public fkk(int i, ekk ekkVar) {
        this.f9697a = i;
        this.b = ekkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkk)) {
            return false;
        }
        fkk fkkVar = (fkk) obj;
        return this.f9697a == fkkVar.f9697a && this.b.equals(fkkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f9697a) * 31);
    }

    public final String toString() {
        return "DicePokerCubeUiModel(diceImg=" + this.f9697a + ", coordinates=" + this.b + Separators.RPAREN;
    }
}
