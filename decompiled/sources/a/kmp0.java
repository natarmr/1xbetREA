package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kmp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18553a;
    public final String b;
    public final String c;
    public final b1l d;
    public final a4x e;

    public kmp0(String str, String str2, String str3, b1l b1lVar, i4 i4Var) {
        str.getClass();
        str2.getClass();
        i4Var.getClass();
        this.f18553a = str;
        this.b = str2;
        this.c = str3;
        this.d = b1lVar;
        this.e = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmp0)) {
            return false;
        }
        kmp0 kmp0Var = (kmp0) obj;
        return Intrinsics.d(this.f18553a, kmp0Var.f18553a) && Intrinsics.d(this.b, kmp0Var.b) && this.c.equals(kmp0Var.c) && this.d.equals(kmp0Var.d) && Intrinsics.d(this.e, kmp0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ua80.b(ua80.b(this.f18553a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TeamStatisticsUiModel(goalDifference=", this.f18553a, ", points=", this.b, ", numberOfMatches=");
        sbN.append(this.c);
        sbN.append(", donutChart=");
        sbN.append(this.d);
        sbN.append(", statisticsValues=");
        return cs0.n(sbN, this.e, Separators.RPAREN);
    }
}
