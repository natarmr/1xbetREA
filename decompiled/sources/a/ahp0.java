package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ahp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f885a;
    public final int b;
    public final List c;

    public ahp0(int i, int i2, List list) {
        list.getClass();
        this.f885a = i;
        this.b = i2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahp0)) {
            return false;
        }
        ahp0 ahp0Var = (ahp0) obj;
        return this.f885a == ahp0Var.f885a && this.b == ahp0Var.b && Intrinsics.d(this.c, ahp0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f885a) * 31, 31);
    }

    public final String toString() {
        return dw9.r(dw9.t("TeamRatingChartModel(currentFIFARanking=", this.f885a, ", averagePosition=", ", pointList=", this.b), this.c, Separators.RPAREN);
    }
}
