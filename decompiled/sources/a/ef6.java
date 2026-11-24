package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ef6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v30 f7706a;
    public final rw7 b;

    public ef6(v30 v30Var, rw7 rw7Var) {
        rw7Var.getClass();
        this.f7706a = v30Var;
        this.b = rw7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef6)) {
            return false;
        }
        ef6 ef6Var = (ef6) obj;
        return this.f7706a.equals(ef6Var.f7706a) && Intrinsics.d(this.b, ef6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7706a.hashCode() * 31);
    }

    public final String toString() {
        return "BetBalanceUiState(advanceBalanceState=" + this.f7706a + ", bettingBalanceValue=" + this.b + Separators.RPAREN;
    }
}
