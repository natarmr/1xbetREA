package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g9o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7m0 f10924a;
    public final t8o b;

    public g9o(l7m0 l7m0Var, t8o t8oVar) {
        l7m0Var.getClass();
        this.f10924a = l7m0Var;
        this.b = t8oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9o)) {
            return false;
        }
        g9o g9oVar = (g9o) obj;
        return Intrinsics.d(this.f10924a, g9oVar.f10924a) && this.b.equals(g9oVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10924a.hashCode() * 31);
    }

    public final String toString() {
        return "EsportsWorldCupUiState(toolbarState=" + this.f10924a + ", screenState=" + this.b + Separators.RPAREN;
    }
}
