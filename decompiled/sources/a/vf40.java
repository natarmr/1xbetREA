package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class vf40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pgs f37314a;
    public final j43 b;

    public vf40(pgs pgsVar, j43 j43Var) {
        this.f37314a = pgsVar;
        this.b = j43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf40)) {
            return false;
        }
        vf40 vf40Var = (vf40) obj;
        return this.f37314a.equals(vf40Var.f37314a) && Intrinsics.d(this.b, vf40Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f37314a.hashCode() * 31;
        j43 j43Var = this.b;
        return iHashCode + (j43Var == null ? 0 : j43Var.hashCode());
    }

    public final String toString() {
        return "MiddleLaneUiModel(gameInfoUiModel=" + this.f37314a + ", animatedCoefficientModel=" + this.b + Separators.RPAREN;
    }
}
