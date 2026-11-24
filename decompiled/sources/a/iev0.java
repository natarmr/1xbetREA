package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class iev0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ieu0 f14656a;
    public final ieu0 b;
    public final mpm c;
    public final String d;

    public iev0(ieu0 ieu0Var, ieu0 ieu0Var2, mpm mpmVar, String str) {
        str.getClass();
        this.f14656a = ieu0Var;
        this.b = ieu0Var2;
        this.c = mpmVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iev0)) {
            return false;
        }
        iev0 iev0Var = (iev0) obj;
        return this.f14656a.equals(iev0Var.f14656a) && this.b.equals(iev0Var.b) && this.c.equals(iev0Var.c) && Intrinsics.d(this.d, iev0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ohs0.e(this.c, (this.b.hashCode() + (this.f14656a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "WidgetScoreUiModel(firstTeamVictoryIndicator=" + this.f14656a + ", secondTeamVictoryIndicator=" + this.b + ", score=" + this.c + ", label=" + this.d + Separators.RPAREN;
    }
}
