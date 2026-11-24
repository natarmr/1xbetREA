package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class hvd0 implements iqg {
    public static final gvd0 Companion = new gvd0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qvd0 f13722a;
    public final qvd0 b;
    public final pyd0 c;

    static {
        oyd0 oyd0Var = pyd0.Companion;
        pvd0 pvd0Var = qvd0.Companion;
    }

    public /* synthetic */ hvd0(int i, qvd0 qvd0Var, qvd0 qvd0Var2, pyd0 pyd0Var) {
        if ((i & 1) == 0) {
            this.f13722a = null;
        } else {
            this.f13722a = qvd0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = qvd0Var2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = pyd0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvd0)) {
            return false;
        }
        hvd0 hvd0Var = (hvd0) obj;
        return Intrinsics.d(this.f13722a, hvd0Var.f13722a) && Intrinsics.d(this.b, hvd0Var.b) && Intrinsics.d(this.c, hvd0Var.c);
    }

    public final int hashCode() {
        qvd0 qvd0Var = this.f13722a;
        int iHashCode = (qvd0Var == null ? 0 : qvd0Var.hashCode()) * 31;
        qvd0 qvd0Var2 = this.b;
        int iHashCode2 = (iHashCode + (qvd0Var2 == null ? 0 : qvd0Var2.hashCode())) * 31;
        pyd0 pyd0Var = this.c;
        return iHashCode2 + (pyd0Var != null ? pyd0Var.hashCode() : 0);
    }

    public final String toString() {
        return "RainbowGameStatisticMainResponse(stat1=" + this.f13722a + ", stat2=" + this.b + ", rainbowSixStatistic=" + this.c + Separators.RPAREN;
    }

    public hvd0() {
        this.f13722a = null;
        this.b = null;
        this.c = null;
    }
}
