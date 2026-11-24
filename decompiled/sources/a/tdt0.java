package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tdt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cqg f33787a;
    public final boolean b;
    public final r2s0 c;
    public final String d;
    public final yws e;

    public tdt0(cqg cqgVar, boolean z, r2s0 r2s0Var, String str, yws ywsVar) {
        str.getClass();
        this.f33787a = cqgVar;
        this.b = z;
        this.c = r2s0Var;
        this.d = str;
        this.e = ywsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdt0)) {
            return false;
        }
        tdt0 tdt0Var = (tdt0) obj;
        return Intrinsics.d(this.f33787a, tdt0Var.f33787a) && this.b == tdt0Var.b && Intrinsics.d(this.c, tdt0Var.c) && Intrinsics.d(this.d, tdt0Var.d) && Intrinsics.d(this.e, tdt0Var.e);
    }

    public final int hashCode() {
        cqg cqgVar = this.f33787a;
        int iE = brm0.e((cqgVar == null ? 0 : cqgVar.hashCode()) * 31, 31, this.b);
        r2s0 r2s0Var = this.c;
        int iB = ua80.b((iE + (r2s0Var == null ? 0 : r2s0Var.f29752a.hashCode())) * 31, 31, this.d);
        yws ywsVar = this.e;
        return iB + (ywsVar != null ? ywsVar.hashCode() : 0);
    }

    public final String toString() {
        return "UniversalStatisticModel(statisticGameModel=" + this.f33787a + ", loadImagesSuccess=" + this.b + ", tournamentModel=" + this.c + ", typefacePath=" + this.d + ", video=" + this.e + Separators.RPAREN;
    }
}
