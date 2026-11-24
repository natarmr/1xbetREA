package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bzp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3481a;
    public final tip0 b;
    public final tip0 c;

    public bzp(String str, tip0 tip0Var, tip0 tip0Var2) {
        str.getClass();
        tip0Var.getClass();
        tip0Var2.getClass();
        this.f3481a = str;
        this.b = tip0Var;
        this.c = tip0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzp)) {
            return false;
        }
        bzp bzpVar = (bzp) obj;
        return Intrinsics.d(this.f3481a, bzpVar.f3481a) && Intrinsics.d(this.b, bzpVar.b) && Intrinsics.d(this.c, bzpVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f3481a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FightingScoreUiModel(title=" + this.f3481a + ", firstTeamScoreUiModel=" + this.b + ", secondTeamScoreUiModel=" + this.c + Separators.RPAREN;
    }
}
