package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l2o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19320a;
    public final a4x b;
    public final dxh0 c;

    public l2o(int i, i4 i4Var, dxh0 dxh0Var) {
        i4Var.getClass();
        this.f19320a = i;
        this.b = i4Var;
        this.c = dxh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2o)) {
            return false;
        }
        l2o l2oVar = (l2o) obj;
        return this.f19320a == l2oVar.f19320a && Intrinsics.d(this.b, l2oVar.b) && this.c.equals(l2oVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cs0.b(this.b, Integer.hashCode(this.f19320a) * 31, 31);
    }

    public final String toString() {
        return "EsportSegmentControlUiModel(currentTab=" + this.f19320a + ", availableTabs=" + this.b + ", segmentedControlStyle=" + this.c + Separators.RPAREN;
    }
}
