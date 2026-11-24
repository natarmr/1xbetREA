package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class bfq0 extends dfq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s470 f2515a;

    public bfq0(s470 s470Var) {
        s470Var.getClass();
        this.f2515a = s470Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bfq0) && this.f2515a == ((bfq0) obj).f2515a;
    }

    public final int hashCode() {
        return this.f2515a.hashCode();
    }

    public final String toString() {
        return "CreateCoeffViews(gameType=" + this.f2515a + Separators.RPAREN;
    }
}
