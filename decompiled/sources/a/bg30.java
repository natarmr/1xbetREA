package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bg30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz10 f2536a;
    public final izm0 b;

    public bg30(pz10 pz10Var, izm0 izm0Var) {
        this.f2536a = pz10Var;
        this.b = izm0Var;
    }

    public static bg30 a(bg30 bg30Var, pz10 pz10Var, izm0 izm0Var, int i) {
        if ((i & 1) != 0) {
            pz10Var = bg30Var.f2536a;
        }
        if ((i & 2) != 0) {
            izm0Var = bg30Var.b;
        }
        return new bg30(pz10Var, izm0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg30)) {
            return false;
        }
        bg30 bg30Var = (bg30) obj;
        return this.f2536a.equals(bg30Var.f2536a) && Intrinsics.d(this.b, bg30Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f2536a.hashCode() * 31;
        izm0 izm0Var = this.b;
        return iHashCode + (izm0Var == null ? 0 : izm0Var.hashCode());
    }

    public final String toString() {
        return "MatchScoreModel(mainScoreModel=" + this.f2536a + ", subScore=" + this.b + Separators.RPAREN;
    }
}
