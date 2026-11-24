package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class q6m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f28205a;
    public final float b;

    public q6m(float f, float f2) {
        this.f28205a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6m)) {
            return false;
        }
        q6m q6mVar = (q6m) obj;
        return ycl.b(this.f28205a, q6mVar.f28205a) && ycl.b(40.0f, 40.0f) && ycl.b(this.b, q6mVar.b) && ycl.b(32.0f, 32.0f);
    }

    public final int hashCode() {
        return Float.hashCode(32.0f) + defpackage.c.a(defpackage.c.a(Float.hashCode(this.f28205a) * 31, 40.0f, 31), this.b, 31);
    }

    public final String toString() {
        String strC = ycl.c(this.f28205a);
        String strC2 = ycl.c(40.0f);
        return ua80.m(b1j.n("DsCyberGamePickBanPanelHeroCellConfig(heroCellWidth=", strC, ", heroCellHeight=", strC2, ", iconWidth="), ycl.c(this.b), ", iconHeight=", ycl.c(32.0f), Separators.RPAREN);
    }
}
