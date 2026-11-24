package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class vfm0 {
    public static final sfm0 Companion = new sfm0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz10 f37340a;

    public /* synthetic */ vfm0(int i, iz10 iz10Var) {
        if ((i & 1) == 0) {
            this.f37340a = null;
        } else {
            this.f37340a = iz10Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vfm0) && Intrinsics.d(this.f37340a, ((vfm0) obj).f37340a);
    }

    public final int hashCode() {
        iz10 iz10Var = this.f37340a;
        if (iz10Var == null) {
            return 0;
        }
        return iz10Var.hashCode();
    }

    public final String toString() {
        return "StatisticResponse(mainResponse=" + this.f37340a + Separators.RPAREN;
    }
}
