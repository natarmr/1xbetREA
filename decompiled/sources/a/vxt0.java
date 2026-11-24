package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vxt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0u0 f38218a;
    public final boolean b;
    public final qrh c;
    public final ljg d;

    public vxt0(d0u0 d0u0Var, boolean z, qrh qrhVar, ljg ljgVar) {
        qrhVar.getClass();
        ljgVar.getClass();
        this.f38218a = d0u0Var;
        this.b = z;
        this.c = qrhVar;
        this.d = ljgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxt0)) {
            return false;
        }
        vxt0 vxt0Var = (vxt0) obj;
        return this.f38218a.equals(vxt0Var.f38218a) && this.b == vxt0Var.b && Intrinsics.d(this.c, vxt0Var.c) && Intrinsics.d(this.d, vxt0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + brm0.e(this.f38218a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "ValorantGameStatisticModel(statisticInfoModel=" + this.f38218a + ", hasStatistics=" + this.b + ", playersComposition=" + this.c + ", lastMatchesInfoModel=" + this.d + Separators.RPAREN;
    }
}
