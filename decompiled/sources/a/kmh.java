package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kmh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f18538a;
    public final l7m0 b;
    public final jjh c;

    public kmh(imm immVar, l7m0 l7m0Var, jjh jjhVar) {
        l7m0Var.getClass();
        this.f18538a = immVar;
        this.b = l7m0Var;
        this.c = jjhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmh)) {
            return false;
        }
        kmh kmhVar = (kmh) obj;
        return this.f18538a.equals(kmhVar.f18538a) && Intrinsics.d(this.b, kmhVar.b) && this.c.equals(kmhVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h97.c(this.b, this.f18538a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CyberTournamentBracketUiStateModel(toolbarUiModel=" + this.f18538a + ", gameBackgroundUiState=" + this.b + ", contentState=" + this.c + Separators.RPAREN;
    }
}
