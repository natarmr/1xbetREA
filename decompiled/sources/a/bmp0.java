package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bmp0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2847a;
    public final String b;
    public final String c;

    public bmp0(long j, String str, String str2) {
        str.getClass();
        this.f2847a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmp0)) {
            return false;
        }
        bmp0 bmp0Var = (bmp0) obj;
        long j = bmp0Var.f2847a;
        int i = y3d.h;
        return h2t0.a(this.f2847a, j) && Intrinsics.d(this.b, bmp0Var.b) && this.c.equals(bmp0Var.c);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f2847a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("TeamStatisticsItemUiModel(labelColor=", y3d.i(this.f2847a), ", title=", this.b, ", value="), this.c, Separators.RPAREN);
    }
}
