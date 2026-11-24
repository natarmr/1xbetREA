package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ghp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final shp0 f11312a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public ghp0(shp0 shp0Var, boolean z, boolean z2, boolean z3) {
        this.f11312a = shp0Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghp0)) {
            return false;
        }
        ghp0 ghp0Var = (ghp0) obj;
        return Intrinsics.d(this.f11312a, ghp0Var.f11312a) && this.b == ghp0Var.b && this.c == ghp0Var.c && this.d == ghp0Var.d;
    }

    public final int hashCode() {
        shp0 shp0Var = this.f11312a;
        return Boolean.hashCode(this.d) + brm0.e(brm0.e((shp0Var == null ? 0 : shp0Var.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamRatingChartState(teamRatingModel=");
        sb.append(this.f11312a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", isError=");
        return ohs0.p(", isEmpty=", Separators.RPAREN, sb, this.c, this.d);
    }
}
