package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z3o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7m0 f43730a;
    public final l2o b;
    public final e4o c;

    public z3o(l7m0 l7m0Var, l2o l2oVar, e4o e4oVar) {
        l7m0Var.getClass();
        this.f43730a = l7m0Var;
        this.b = l2oVar;
        this.c = e4oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3o)) {
            return false;
        }
        z3o z3oVar = (z3o) obj;
        return Intrinsics.d(this.f43730a, z3oVar.f43730a) && Intrinsics.d(this.b, z3oVar.b) && this.c.equals(z3oVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.f43730a.hashCode() * 31;
        l2o l2oVar = this.b;
        return this.c.hashCode() + ((iHashCode + (l2oVar == null ? 0 : l2oVar.hashCode())) * 31);
    }

    public final String toString() {
        return "EsportsGamesUiState(toolbarState=" + this.f43730a + ", segmentedControl=" + this.b + ", screenState=" + this.c + Separators.RPAREN;
    }
}
