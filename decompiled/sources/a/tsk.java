package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tsk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n2o f34464a;
    public final l7m0 b;
    public final gsk c;

    public tsk(n2o n2oVar, l7m0 l7m0Var, gsk gskVar) {
        l7m0Var.getClass();
        gskVar.getClass();
        this.f34464a = n2oVar;
        this.b = l7m0Var;
        this.c = gskVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsk)) {
            return false;
        }
        tsk tskVar = (tsk) obj;
        return this.f34464a == tskVar.f34464a && Intrinsics.d(this.b, tskVar.b) && Intrinsics.d(this.c, tskVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h97.c(this.b, this.f34464a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DisciplineDetailsUiState(screenStyle=" + this.f34464a + ", toolbarState=" + this.b + ", screenState=" + this.c + Separators.RPAREN;
    }
}
