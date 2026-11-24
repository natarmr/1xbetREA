package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class cxv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5144a;
    public final float b;

    public cxv0(float f, long j) {
        this.f5144a = j;
        this.b = f;
        zcl zclVar = qmk.f28987a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxv0)) {
            return false;
        }
        cxv0 cxv0Var = (cxv0) obj;
        long j = cxv0Var.f5144a;
        int i = y3d.h;
        return h2t0.a(this.f5144a, j) && ycl.b(this.b, cxv0Var.b);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Float.hashCode(this.b) + (Long.hashCode(this.f5144a) * 31);
    }

    public final String toString() {
        return b1j.k("XBottomSheetSurfaceStyle(backgroundColor=", y3d.i(this.f5144a), ", cornerRadius=", ycl.c(this.b), Separators.RPAREN);
    }
}
