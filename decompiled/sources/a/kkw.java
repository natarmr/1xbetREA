package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kkw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g5h f18461a;
    public final boolean b;
    public final l7m0 c;
    public final th90 d;

    public kkw(g5h g5hVar, boolean z, l7m0 l7m0Var, th90 th90Var) {
        l7m0Var.getClass();
        th90Var.getClass();
        this.f18461a = g5hVar;
        this.b = z;
        this.c = l7m0Var;
        this.d = th90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkw)) {
            return false;
        }
        kkw kkwVar = (kkw) obj;
        return this.f18461a == kkwVar.f18461a && this.b == kkwVar.b && Intrinsics.d(this.c, kkwVar.c) && Intrinsics.d(this.d, kkwVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h97.c(this.c, brm0.e(this.f18461a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "HomeUiState(screenStyle=" + this.f18461a + ", popular=" + this.b + ", toolbarState=" + this.c + ", screenState=" + this.d + Separators.RPAREN;
    }
}
