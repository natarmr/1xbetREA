package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hn8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13337a;
    public final mtl b;

    public hn8(boolean z, mtl mtlVar) {
        this.f13337a = z;
        this.b = mtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn8)) {
            return false;
        }
        hn8 hn8Var = (hn8) obj;
        return this.f13337a == hn8Var.f13337a && this.b.equals(hn8Var.b);
    }

    public final int hashCode() {
        return this.b.f22376a.hashCode() + (Boolean.hashCode(this.f13337a) * 31);
    }

    public final String toString() {
        return "BottomBarStateUiModel(showSelectionButton=" + this.f13337a + ", bottomBarModel=" + this.b + Separators.RPAREN;
    }
}
