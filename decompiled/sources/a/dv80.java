package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class dv80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6732a;
    public final imm b;
    public final ot80 c;
    public final cv80 d;
    public final ku80 e;

    public dv80(boolean z, imm immVar, ot80 ot80Var, cv80 cv80Var, ku80 ku80Var) {
        immVar.getClass();
        ot80Var.getClass();
        cv80Var.getClass();
        ku80Var.getClass();
        this.f6732a = z;
        this.b = immVar;
        this.c = ot80Var;
        this.d = cv80Var;
        this.e = ku80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv80)) {
            return false;
        }
        dv80 dv80Var = (dv80) obj;
        return this.f6732a == dv80Var.f6732a && Intrinsics.d(this.b, dv80Var.b) && Intrinsics.d(this.c, dv80Var.c) && Intrinsics.d(this.d, dv80Var.d) && Intrinsics.d(this.e, dv80Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + h97.a(this.b, Boolean.hashCode(this.f6732a) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PartTypeTwoGamesUiState(isPinnedNavigationBar=" + this.f6732a + ", partTypeTwoGamesNavigationBarUiModel=" + this.b + ", partTypeTwoGamesAccountSelectionUiModel=" + this.c + ", partTypeTwoGamesGamesUiModel=" + this.d + ", partTypeTwoGamesBannerUiModel=" + this.e + Separators.RPAREN;
    }
}
