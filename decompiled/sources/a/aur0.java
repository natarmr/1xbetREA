package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class aur0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final me80 f1493a;
    public final he80 b;
    public final a4x c;
    public final mtl d;

    public aur0(me80 me80Var, he80 he80Var, i4 i4Var, mtl mtlVar) {
        i4Var.getClass();
        this.f1493a = me80Var;
        this.b = he80Var;
        this.c = i4Var;
        this.d = mtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aur0)) {
            return false;
        }
        aur0 aur0Var = (aur0) obj;
        return this.f1493a.equals(aur0Var.f1493a) && this.b.equals(aur0Var.b) && Intrinsics.d(this.c, aur0Var.c) && this.d.equals(aur0Var.d);
    }

    public final int hashCode() {
        return this.d.f22376a.hashCode() + cs0.b(this.c, (this.b.hashCode() + (this.f1493a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "TotoOutcomesSelectionUiState(navBarUiModel=" + this.f1493a + ", headerUiModel=" + this.b + ", outcomesContainersList=" + this.c + ", bottomBarModel=" + this.d + Separators.RPAREN;
    }
}
