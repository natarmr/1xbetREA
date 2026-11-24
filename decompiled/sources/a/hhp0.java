package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hhp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13077a;
    public final String b;
    public final a4x c;

    public hhp0(a4x a4xVar, String str, String str2) {
        w6x.x(a4xVar, str, str2);
        this.f13077a = str;
        this.b = str2;
        this.c = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhp0)) {
            return false;
        }
        hhp0 hhp0Var = (hhp0) obj;
        return Intrinsics.d(this.f13077a, hhp0Var.f13077a) && Intrinsics.d(this.b, hhp0Var.b) && Intrinsics.d(this.c, hhp0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f13077a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return cs0.n(b1j.n("TeamRatingChartUiModel(currentFIFARanking=", this.f13077a, ", averagePosition=", this.b, ", pointList="), this.c, Separators.RPAREN);
    }
}
