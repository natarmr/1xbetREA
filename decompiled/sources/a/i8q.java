package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i8q implements j8q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zwb f14352a;
    public final ib8 b;

    public i8q(zwb zwbVar, ib8 ib8Var) {
        this.f14352a = zwbVar;
        this.b = ib8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8q)) {
            return false;
        }
        i8q i8qVar = (i8q) obj;
        return Intrinsics.d(this.f14352a, i8qVar.f14352a) && Intrinsics.d(this.b, i8qVar.b);
    }

    public final int hashCode() {
        zwb zwbVar = this.f14352a;
        int iHashCode = (zwbVar == null ? 0 : zwbVar.hashCode()) * 31;
        ib8 ib8Var = this.b;
        return iHashCode + (ib8Var != null ? ib8Var.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateFinBetData(chartUpdateUIModel=" + this.f14352a + ", boardUpdateUIModel=" + this.b + Separators.RPAREN;
    }
}
