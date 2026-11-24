package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class bw3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3306a;
    public final float b;
    public final long c;

    public bw3(float f, float f2, long j) {
        this.f3306a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw3)) {
            return false;
        }
        bw3 bw3Var = (bw3) obj;
        if (Float.compare(this.f3306a, bw3Var.f3306a) != 0 || Float.compare(this.b, bw3Var.b) != 0) {
            return false;
        }
        long j = bw3Var.c;
        int i = y3d.h;
        return h2t0.a(this.c, j);
    }

    public final int hashCode() {
        int iA = defpackage.c.a(Float.hashCode(this.f3306a) * 31, this.b, 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + iA;
    }

    public final String toString() {
        return axq.n(dw9.s(this.f3306a, this.b, "ArcDataUiModel(targetSweepAngle=", ", startAngle=", ", color="), y3d.i(this.c), Separators.RPAREN);
    }
}
