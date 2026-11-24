package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ws60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final koa f39677a;
    public final int b;

    public ws60(koa koaVar, int i) {
        this.f39677a = koaVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws60)) {
            return false;
        }
        ws60 ws60Var = (ws60) obj;
        return this.f39677a == ws60Var.f39677a && this.b == ws60Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f39677a.hashCode() * 31);
    }

    public final String toString() {
        return "OneXGamesCardUiModel(cardSuit=" + this.f39677a + ", cardValue=" + this.b + Separators.RPAREN;
    }
}
