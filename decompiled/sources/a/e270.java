package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e270 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f7072a;
    public final q070 b;
    public final y170 c;

    public e270(imm immVar, q070 q070Var, y170 y170Var) {
        immVar.getClass();
        y170Var.getClass();
        this.f7072a = immVar;
        this.b = q070Var;
        this.c = y170Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e270)) {
            return false;
        }
        e270 e270Var = (e270) obj;
        return Intrinsics.d(this.f7072a, e270Var.f7072a) && this.b.equals(e270Var.b) && Intrinsics.d(this.c, e270Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f7072a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "OneXGamesPromoUiModel(navigationBarUiModel=" + this.f7072a + ", accountSelectionUiModel=" + this.b + ", screenUiModel=" + this.c + Separators.RPAREN;
    }
}
