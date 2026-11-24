package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vvd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bvd0 f38093a;
    public final boolean b;
    public final ljg c;
    public final g0e0 d;
    public final oxd0 e;

    public vvd0(bvd0 bvd0Var, boolean z, ljg ljgVar, g0e0 g0e0Var, oxd0 oxd0Var) {
        ljgVar.getClass();
        g0e0Var.getClass();
        oxd0Var.getClass();
        this.f38093a = bvd0Var;
        this.b = z;
        this.c = ljgVar;
        this.d = g0e0Var;
        this.e = oxd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvd0)) {
            return false;
        }
        vvd0 vvd0Var = (vvd0) obj;
        return this.f38093a.equals(vvd0Var.f38093a) && this.b == vvd0Var.b && Intrinsics.d(this.c, vvd0Var.c) && Intrinsics.d(this.d, vvd0Var.d) && Intrinsics.d(this.e, vvd0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + brm0.e(this.f38093a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        return "RainbowGameStatisticModel(statisticInfoModel=" + this.f38093a + ", hasStatistics=" + this.b + ", lastMatchesInfoModel=" + this.c + ", statisticMatches=" + this.d + ", playersComposition=" + this.e + Separators.RPAREN;
    }
}
