package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class njg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f23635a;
    public final n0x b;
    public final n0x c;

    public njg0(n0x n0xVar, n0x n0xVar2, n0x n0xVar3) {
        this.f23635a = n0xVar;
        this.b = n0xVar2;
        this.c = n0xVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njg0)) {
            return false;
        }
        njg0 njg0Var = (njg0) obj;
        return this.f23635a.equals(njg0Var.f23635a) && this.b.equals(njg0Var.b) && this.c.equals(njg0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f140.f(this.b, this.f23635a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "RpsPlayerHandUiModel(currentPlayerHand=" + this.f23635a + ", defaultHandRes=" + this.b + ", gameHandRes=" + this.c + Separators.RPAREN;
    }
}
