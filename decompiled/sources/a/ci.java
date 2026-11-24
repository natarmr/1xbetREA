package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ci {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mtl f4387a;
    public final hqt0 b;
    public final z1s0 c;

    public ci(mtl mtlVar, hqt0 hqt0Var, z1s0 z1s0Var) {
        this.f4387a = mtlVar;
        this.b = hqt0Var;
        this.c = z1s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci)) {
            return false;
        }
        ci ciVar = (ci) obj;
        return this.f4387a.equals(ciVar.f4387a) && this.b == ciVar.b && this.c == ciVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f4387a.f22376a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ActionButtonUiModel(bottomBarModel=" + this.f4387a + ", buttonAction=" + this.b + ", tournamentKind=" + this.c + Separators.RPAREN;
    }
}
