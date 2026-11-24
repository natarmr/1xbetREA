package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class gf6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vtn f11193a;
    public final x30 b;
    public final tw7 c;

    public gf6(vtn vtnVar, x30 x30Var, tw7 tw7Var) {
        this.f11193a = vtnVar;
        this.b = x30Var;
        this.c = tw7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf6)) {
            return false;
        }
        gf6 gf6Var = (gf6) obj;
        return Intrinsics.d(this.f11193a, gf6Var.f11193a) && this.b.equals(gf6Var.b) && this.c.equals(gf6Var.c);
    }

    public final int hashCode() {
        vtn vtnVar = this.f11193a;
        int iHashCode = vtnVar == null ? 0 : vtnVar.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "BetBalanceUiState(emptyBalanceUiModel=" + this.f11193a + ", advanceBalanceState=" + this.b + ", bettingBalanceValue=" + this.c + Separators.RPAREN;
    }
}
