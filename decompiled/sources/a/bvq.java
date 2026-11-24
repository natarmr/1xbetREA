package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bvq implements ivw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vuq f3290a;
    public final ufp0 b;
    public final ufp0 c;

    public bvq(vuq vuqVar, ufp0 ufp0Var, ufp0 ufp0Var2) {
        vuqVar.getClass();
        this.f3290a = vuqVar;
        this.b = ufp0Var;
        this.c = ufp0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvq)) {
            return false;
        }
        bvq bvqVar = (bvq) obj;
        return Intrinsics.d(this.f3290a, bvqVar.f3290a) && this.b.equals(bvqVar.b) && this.c.equals(bvqVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.f(this.b, this.f3290a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ForecastUiModel(forecastStatisticModel=" + this.f3290a + ", firstTeam=" + this.b + ", secondTeam=" + this.c + Separators.RPAREN;
    }
}
