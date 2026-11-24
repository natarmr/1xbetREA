package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o2a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f24523a;
    public final float b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final float g;
    public final boolean h;
    public final String i;

    public o2a0(float f, float f2, String str, String str2, long j, long j2, float f3, boolean z, String str3) {
        brm0.B(str, str2, str3);
        this.f24523a = f;
        this.b = f2;
        this.c = str;
        this.d = str2;
        this.e = j;
        this.f = j2;
        this.g = f3;
        this.h = z;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2a0)) {
            return false;
        }
        o2a0 o2a0Var = (o2a0) obj;
        if (Float.compare(this.f24523a, o2a0Var.f24523a) != 0 || Float.compare(this.b, o2a0Var.b) != 0 || !Intrinsics.d(this.c, o2a0Var.c) || !Intrinsics.d(this.d, o2a0Var.d)) {
            return false;
        }
        long j = o2a0Var.e;
        int i = y3d.h;
        return h2t0.a(this.e, j) && h2t0.a(this.f, o2a0Var.f) && Float.compare(this.g, o2a0Var.g) == 0 && this.h == o2a0Var.h && Intrinsics.d(this.i, o2a0Var.i);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(defpackage.c.a(Float.hashCode(this.f24523a) * 31, this.b, 31), 31, this.c), 31, this.d);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.i.hashCode() + brm0.e(defpackage.c.a(rw2.b(rw2.b(iB, 31, this.e), 31, this.f), this.g, 31), 31, this.h);
    }

    public final String toString() {
        String strI = y3d.i(this.e);
        String strI2 = y3d.i(this.f);
        StringBuilder sbS = dw9.s(this.f24523a, this.b, "PlayerDuelStatValueUiModel(firstPlayerValue=", ", secondPlayerValue=", ", firstPlayerValueText=");
        f140.v(sbS, this.c, ", secondPlayerValueText=", this.d, ", firstPlayerTextColor=");
        f140.v(sbS, strI, ", secondPlayerTextColor=", strI2, ", maxMetric=");
        sbS.append(this.g);
        sbS.append(", lowerIsBetter=");
        sbS.append(this.h);
        sbS.append(", label=");
        return axq.n(sbS, this.i, Separators.RPAREN);
    }
}
