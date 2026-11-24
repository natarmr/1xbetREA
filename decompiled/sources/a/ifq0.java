package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ifq0 extends ofq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s470 f14702a;

    public ifq0(s470 s470Var) {
        s470Var.getClass();
        this.f14702a = s470Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ifq0) && this.f14702a == ((ifq0) obj).f14702a;
    }

    public final int hashCode() {
        return this.f14702a.hashCode();
    }

    public final String toString() {
        return "CreateGameField(gameType=" + this.f14702a + Separators.RPAREN;
    }
}
