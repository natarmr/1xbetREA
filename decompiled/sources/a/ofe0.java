package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ofe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f25164a;
    public final see0 b;
    public final yee0 c;

    public ofe0(imm immVar, see0 see0Var, yee0 yee0Var) {
        immVar.getClass();
        see0Var.getClass();
        this.f25164a = immVar;
        this.b = see0Var;
        this.c = yee0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofe0)) {
            return false;
        }
        ofe0 ofe0Var = (ofe0) obj;
        return Intrinsics.d(this.f25164a, ofe0Var.f25164a) && Intrinsics.d(this.b, ofe0Var.b) && this.c.equals(ofe0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f25164a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RecommendedGamesUiState(recommendedGamesNavigationBarUiModel=" + this.f25164a + ", recommendedGamesAuthSectionUiModel=" + this.b + ", recommendedGamesContentUiModel=" + this.c + Separators.RPAREN;
    }
}
