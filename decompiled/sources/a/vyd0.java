package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class vyd0 {
    public static final uyd0 Companion = new uyd0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hzd0 f38243a;
    public final hzd0 b;

    static {
        gzd0 gzd0Var = hzd0.Companion;
    }

    public /* synthetic */ vyd0(int i, hzd0 hzd0Var, hzd0 hzd0Var2) {
        if ((i & 1) == 0) {
            this.f38243a = null;
        } else {
            this.f38243a = hzd0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = hzd0Var2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vyd0)) {
            return false;
        }
        vyd0 vyd0Var = (vyd0) obj;
        return Intrinsics.d(this.f38243a, vyd0Var.f38243a) && Intrinsics.d(this.b, vyd0Var.b);
    }

    public final int hashCode() {
        hzd0 hzd0Var = this.f38243a;
        int iHashCode = (hzd0Var == null ? 0 : hzd0Var.hashCode()) * 31;
        hzd0 hzd0Var2 = this.b;
        return iHashCode + (hzd0Var2 != null ? hzd0Var2.hashCode() : 0);
    }

    public final String toString() {
        return "RainbowStatisticMatchesComparisonResponse(team1=" + this.f38243a + ", team2=" + this.b + Separators.RPAREN;
    }
}
