package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qtk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f29303a;
    public final ixb0 b;

    public qtk0(btk0 btk0Var, ixb0 ixb0Var) {
        btk0Var.getClass();
        this.f29303a = btk0Var;
        this.b = ixb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qtk0)) {
            return false;
        }
        qtk0 qtk0Var = (qtk0) obj;
        return Intrinsics.d(this.f29303a, qtk0Var.f29303a) && Intrinsics.d(this.b, qtk0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f29303a.hashCode() * 31;
        ixb0 ixb0Var = this.b;
        return iHashCode + (ixb0Var == null ? 0 : ixb0Var.hashCode());
    }

    public final String toString() {
        return "SpecialEventTabPrizeDistributionStateModel(contentStatus=" + this.f29303a + ", content=" + this.b + Separators.RPAREN;
    }
}
