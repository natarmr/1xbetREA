package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k4h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p310 f17669a;
    public final boolean b;
    public final y3h c;
    public final ic6 d;
    public final ljg e;

    public k4h(p310 p310Var, boolean z, y3h y3hVar, ic6 ic6Var, ljg ljgVar) {
        y3hVar.getClass();
        ljgVar.getClass();
        this.f17669a = p310Var;
        this.b = z;
        this.c = y3hVar;
        this.d = ic6Var;
        this.e = ljgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4h)) {
            return false;
        }
        k4h k4hVar = (k4h) obj;
        return this.f17669a.equals(k4hVar.f17669a) && this.b == k4hVar.b && Intrinsics.d(this.c, k4hVar.c) && this.d.equals(k4hVar.d) && Intrinsics.d(this.e, k4hVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + brm0.e(this.f17669a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        return "CyberLolStatisticModel(statisticInfoModel=" + this.f17669a + ", hasStatistics=" + this.b + ", playersComposition=" + this.c + ", bestHeroes=" + this.d + ", lastMatchesInfoModel=" + this.e + Separators.RPAREN;
    }
}
