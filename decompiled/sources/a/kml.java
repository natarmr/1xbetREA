package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4 f18545a;
    public final i4 b;
    public final i4 c;

    public kml(i4 i4Var, i4 i4Var2, i4 i4Var3) {
        i4Var.getClass();
        i4Var2.getClass();
        i4Var3.getClass();
        this.f18545a = i4Var;
        this.b = i4Var2;
        this.c = i4Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kml)) {
            return false;
        }
        kml kmlVar = (kml) obj;
        return Intrinsics.d(this.f18545a, kmlVar.f18545a) && Intrinsics.d(this.b, kmlVar.b) && Intrinsics.d(this.c, kmlVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f140.c(this.b, this.f18545a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DsAggregatorGamesSpinnerColumns(left=" + this.f18545a + ", center=" + this.b + ", right=" + this.c + Separators.RPAREN;
    }
}
