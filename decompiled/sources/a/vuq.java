package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vuq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38061a;
    public final int b;
    public final List c;

    static {
        new vuq(0, 0, iun.f15405a);
    }

    public vuq(int i, int i2, List list) {
        list.getClass();
        this.f38061a = i;
        this.b = i2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vuq)) {
            return false;
        }
        vuq vuqVar = (vuq) obj;
        return this.f38061a == vuqVar.f38061a && this.b == vuqVar.b && Intrinsics.d(this.c, vuqVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f38061a) * 31, 31);
    }

    public final String toString() {
        return dw9.r(dw9.t("ForecastStatisticModel(scoreOne=", this.f38061a, ", scoreTwo=", ", forecastsList=", this.b), this.c, Separators.RPAREN);
    }
}
