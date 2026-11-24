package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class dep0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5961a;
    public final String b;
    public final float c;
    public final long d;
    public final long e;

    public dep0(boolean z, String str, float f, long j, long j2) {
        this.f5961a = z;
        this.b = str;
        this.c = f;
        this.d = j;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dep0)) {
            return false;
        }
        dep0 dep0Var = (dep0) obj;
        if (this.f5961a != dep0Var.f5961a || !this.b.equals(dep0Var.b) || Float.compare(this.c, dep0Var.c) != 0) {
            return false;
        }
        long j = dep0Var.d;
        int i = y3d.h;
        return h2t0.a(this.d, j) && h2t0.a(this.e, dep0Var.e);
    }

    public final int hashCode() {
        int iA = defpackage.c.a(ua80.b(Boolean.hashCode(this.f5961a) * 31, 31, this.b), this.c, 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.e) + rw2.b(iA, 31, this.d);
    }

    public final String toString() {
        String strI = y3d.i(this.d);
        String strI2 = y3d.i(this.e);
        StringBuilder sbQ = axq.q("TeamGoldUiModel(visible=", ", amount=", this.b, this.f5961a, ", alpha=");
        sbQ.append(this.c);
        sbQ.append(", background=");
        sbQ.append(strI);
        sbQ.append(", borderColor=");
        return axq.n(sbQ, strI2, Separators.RPAREN);
    }
}
