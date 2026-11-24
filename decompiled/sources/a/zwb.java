package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zwb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f45097a;
    public final int b;
    public final double c;
    public final double d;
    public final List e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final List i;

    public zwb(List list, int i, double d, double d2, List list2, boolean z, int i2, boolean z2, List list3) {
        b1j.B(list, list2, list3);
        this.f45097a = list;
        this.b = i;
        this.c = d;
        this.d = d2;
        this.e = list2;
        this.f = z;
        this.g = i2;
        this.h = z2;
        this.i = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwb)) {
            return false;
        }
        zwb zwbVar = (zwb) obj;
        return Intrinsics.d(this.f45097a, zwbVar.f45097a) && this.b == zwbVar.b && Double.compare(this.c, zwbVar.c) == 0 && Double.compare(this.d, zwbVar.d) == 0 && Intrinsics.d(this.e, zwbVar.e) && this.f == zwbVar.f && this.g == zwbVar.g && this.h == zwbVar.h && Intrinsics.d(this.i, zwbVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + brm0.e(twn.a(this.g, brm0.e(dw9.a(brm0.d(this.d, brm0.d(this.c, twn.a(this.b, this.f45097a.hashCode() * 31, 31), 31), 31), 31, this.e), 31, this.f), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChartUpdateUIModel(financeEvents=");
        sb.append(this.f45097a);
        sb.append(", dataSize=");
        sb.append(this.b);
        sb.append(", maxPrice=");
        sb.append(this.c);
        ohs0.A(sb, this.d, ", minPrice=", ", fullValues=");
        rz4.z(sb, ", needReset=", this.e, ", noBetsPeriod=", this.f);
        brm0.w(this.g, ", is24HourFormat=", ", dates=", sb, this.h);
        return dw9.r(sb, this.i, Separators.RPAREN);
    }
}
