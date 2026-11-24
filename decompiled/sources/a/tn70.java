package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tn70 extends io70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s470 f34221a;

    public tn70(s470 s470Var) {
        s470Var.getClass();
        this.f34221a = s470Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tn70) && this.f34221a == ((tn70) obj).f34221a;
    }

    public final int hashCode() {
        return this.f34221a.hashCode();
    }

    public final String toString() {
        return "AddToolbar(gameType=" + this.f34221a + Separators.RPAREN;
    }
}
