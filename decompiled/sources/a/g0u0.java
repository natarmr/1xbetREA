package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class g0u0 implements iqg {
    public static final f0u0 Companion = new f0u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1u0 f10478a;
    public final r1u0 b;
    public final r1u0 c;

    static {
        q1u0 q1u0Var = r1u0.Companion;
        m1u0 m1u0Var = n1u0.Companion;
    }

    public /* synthetic */ g0u0(int i, n1u0 n1u0Var, r1u0 r1u0Var, r1u0 r1u0Var2) {
        if ((i & 1) == 0) {
            this.f10478a = null;
        } else {
            this.f10478a = n1u0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = r1u0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = r1u0Var2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0u0)) {
            return false;
        }
        g0u0 g0u0Var = (g0u0) obj;
        return Intrinsics.d(this.f10478a, g0u0Var.f10478a) && Intrinsics.d(this.b, g0u0Var.b) && Intrinsics.d(this.c, g0u0Var.c);
    }

    public final int hashCode() {
        n1u0 n1u0Var = this.f10478a;
        int iHashCode = (n1u0Var == null ? 0 : n1u0Var.hashCode()) * 31;
        r1u0 r1u0Var = this.b;
        int iHashCode2 = (iHashCode + (r1u0Var == null ? 0 : r1u0Var.hashCode())) * 31;
        r1u0 r1u0Var2 = this.c;
        return iHashCode2 + (r1u0Var2 != null ? r1u0Var2.hashCode() : 0);
    }

    public final String toString() {
        return "ValorantStatisticMainResponse(valorantStatistic=" + this.f10478a + ", statisticFirstTeam=" + this.b + ", statisticSecondTeam=" + this.c + Separators.RPAREN;
    }

    public g0u0() {
        this.f10478a = null;
        this.b = null;
        this.c = null;
    }
}
