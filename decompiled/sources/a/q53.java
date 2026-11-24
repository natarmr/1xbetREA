package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class q53 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28130a;
    public final db8 b;

    public q53(String str, db8 db8Var) {
        this.f28130a = str;
        this.b = db8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q53)) {
            return false;
        }
        q53 q53Var = (q53) obj;
        return this.f28130a.equals(q53Var.f28130a) && this.b == q53Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28130a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimatedDeltaUiModel(deltaText=" + this.f28130a + ", boardDeltaChangeState=" + this.b + Separators.RPAREN;
    }
}
