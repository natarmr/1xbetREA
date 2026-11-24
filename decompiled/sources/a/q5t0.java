package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q5t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28170a;
    public final Object b;
    public final Object c;
    public final Object d;

    public q5t0(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f28170a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5t0)) {
            return false;
        }
        q5t0 q5t0Var = (q5t0) obj;
        Object obj2 = q5t0Var.f28170a;
        e0g0 e0g0Var = j0g0.b;
        return Intrinsics.d(this.f28170a, obj2) && Intrinsics.d(this.b, q5t0Var.b) && Intrinsics.d(this.c, q5t0Var.c) && Intrinsics.d(this.d, q5t0Var.d);
    }

    public final int hashCode() {
        return j0g0.b(this.d) + twn.c(twn.c(j0g0.b(this.f28170a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        String strD = j0g0.d(this.f28170a);
        String strD2 = j0g0.d(this.b);
        return ua80.m(b1j.n("UfcPostGameScenarioModel(shortGameResult=", strD, ", fightInfoResult=", strD2, ", fighterStatsResult="), j0g0.d(this.c), ", headToHeadModel=", j0g0.d(this.d), Separators.RPAREN);
    }
}
