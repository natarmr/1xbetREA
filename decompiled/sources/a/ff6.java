package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ff6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w30 f9436a;
    public final sw7 b;

    public ff6(w30 w30Var, sw7 sw7Var) {
        sw7Var.getClass();
        this.f9436a = w30Var;
        this.b = sw7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff6)) {
            return false;
        }
        ff6 ff6Var = (ff6) obj;
        return this.f9436a.equals(ff6Var.f9436a) && Intrinsics.d(this.b, ff6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9436a.hashCode() * 31);
    }

    public final String toString() {
        return "BetBalanceUiState(advanceBalanceState=" + this.f9436a + ", bettingBalanceValue=" + this.b + Separators.RPAREN;
    }
}
