package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class iwe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15486a;
    public final mtl b;

    public iwe0(boolean z, mtl mtlVar) {
        this.f15486a = z;
        this.b = mtlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwe0)) {
            return false;
        }
        iwe0 iwe0Var = (iwe0) obj;
        return this.f15486a == iwe0Var.f15486a && this.b.equals(iwe0Var.b);
    }

    public final int hashCode() {
        return this.b.f22376a.hashCode() + (Boolean.hashCode(this.f15486a) * 31);
    }

    public final String toString() {
        return "RegistrationDefaultBottomBarUiModel(isVisible=" + this.f15486a + ", bottomBarModel=" + this.b + Separators.RPAREN;
    }
}
