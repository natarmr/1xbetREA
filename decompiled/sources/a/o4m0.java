package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o4m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f24645a;
    public final a4x b;
    public final boolean c;

    public o4m0(i4 i4Var, i4 i4Var2, boolean z) {
        i4Var.getClass();
        i4Var2.getClass();
        this.f24645a = i4Var;
        this.b = i4Var2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4m0)) {
            return false;
        }
        o4m0 o4m0Var = (o4m0) obj;
        return Intrinsics.d(this.f24645a, o4m0Var.f24645a) && Intrinsics.d(this.b, o4m0Var.b) && this.c == o4m0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cs0.b(this.b, this.f24645a.hashCode() * 31, 31);
    }

    public final String toString() {
        return rw2.p(rw2.q("StandingsUiModel(teams=", this.f24645a, ", statisticsTable=", this.b, ", isTablet="), this.c, Separators.RPAREN);
    }
}
