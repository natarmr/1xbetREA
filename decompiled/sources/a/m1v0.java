package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m1v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f21028a;
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final String h;
    public final boolean i;

    public m1v0(Integer num, String str, boolean z, String str2, boolean z2, String str3, boolean z3, String str4, boolean z4) {
        this.f21028a = num;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = z2;
        this.f = str3;
        this.g = z3;
        this.h = str4;
        this.i = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1v0)) {
            return false;
        }
        m1v0 m1v0Var = (m1v0) obj;
        return Intrinsics.d(this.f21028a, m1v0Var.f21028a) && this.b.equals(m1v0Var.b) && this.c == m1v0Var.c && this.d.equals(m1v0Var.d) && this.e == m1v0Var.e && this.f.equals(m1v0Var.f) && this.g == m1v0Var.g && this.h.equals(m1v0Var.h) && this.i == m1v0Var.i;
    }

    public final int hashCode() {
        Integer num = this.f21028a;
        return Boolean.hashCode(this.i) + ua80.b(brm0.e(ua80.b(brm0.e(ua80.b(brm0.e(ua80.b((num == null ? 0 : num.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f21028a, "WeatherInfoUiModel(weatherIcon=", ", temperature=", this.b, ", hasTemperatureInfo=");
        f140.s(", windSpeed=", this.d, ", hasWindInfo=", sbN, this.c);
        f140.s(", pressure=", this.f, ", hasPressureInfo=", sbN, this.e);
        f140.s(", humidity=", this.h, ", hasHumidityInfo=", sbN, this.g);
        return rw2.p(sbN, this.i, Separators.RPAREN);
    }
}
