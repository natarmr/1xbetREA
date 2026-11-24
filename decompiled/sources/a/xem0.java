package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xem0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40750a;
    public final int b;
    public final boolean c;
    public final float d;
    public final long e;

    public xem0(int i, int i2, boolean z, float f, long j) {
        this.f40750a = i;
        this.b = i2;
        this.c = z;
        this.d = f;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xem0)) {
            return false;
        }
        xem0 xem0Var = (xem0) obj;
        if (this.f40750a != xem0Var.f40750a || this.b != xem0Var.b || this.c != xem0Var.c || Float.compare(this.d, xem0Var.d) != 0) {
            return false;
        }
        long j = xem0Var.e;
        int i = y3d.h;
        return h2t0.a(this.e, j);
    }

    public final int hashCode() {
        int iA = defpackage.c.a(brm0.e(twn.a(this.b, Integer.hashCode(this.f40750a) * 31, 31), 31, this.c), this.d, 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.e) + iA;
    }

    public final String toString() {
        String strI = y3d.i(this.e);
        StringBuilder sbT = dw9.t("StatisticItemUiModel(icon=", this.f40750a, ", value=", ", showValue=", this.b);
        sbT.append(this.c);
        sbT.append(", alpha=");
        sbT.append(this.d);
        sbT.append(", background=");
        return axq.n(sbT, strI, Separators.RPAREN);
    }
}
