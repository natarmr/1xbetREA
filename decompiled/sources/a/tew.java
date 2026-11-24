package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tew {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0g0 f33842a;
    public final j0g0 b;

    public tew(j0g0 j0g0Var, j0g0 j0g0Var2) {
        this.f33842a = j0g0Var;
        this.b = j0g0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tew)) {
            return false;
        }
        tew tewVar = (tew) obj;
        return Intrinsics.d(this.f33842a, tewVar.f33842a) && Intrinsics.d(this.b, tewVar.b);
    }

    public final int hashCode() {
        j0g0 j0g0Var = this.f33842a;
        int iB = (j0g0Var == null ? 0 : j0g0.b(j0g0Var.f15681a)) * 31;
        j0g0 j0g0Var2 = this.b;
        return iB + (j0g0Var2 != null ? j0g0.b(j0g0Var2.f15681a) : 0);
    }

    public final String toString() {
        return "HltvAwardsStatisticScenarioModel(statistics=" + this.f33842a + ", promotions=" + this.b + Separators.RPAREN;
    }
}
