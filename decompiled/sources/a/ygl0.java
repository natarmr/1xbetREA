package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final class ygl0 implements ahl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42591a;
    public final long b;

    public ygl0() {
        pz40 pz40Var = s6t0.f31722a;
        StaticColors staticColors = StaticColors.INSTANCE;
        long jM130getWhite600d7_KjU = staticColors.m130getWhite600d7_KjU();
        long jM123getWhite0d7_KjU = staticColors.m123getWhite0d7_KjU();
        this.f42591a = jM130getWhite600d7_KjU;
        this.b = jM123getWhite0d7_KjU;
    }

    @Override // a.ahl0
    public final long a() {
        return this.b;
    }

    @Override // a.ahl0
    public final long b() {
        return this.f42591a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygl0)) {
            return false;
        }
        ygl0 ygl0Var = (ygl0) obj;
        long j = ygl0Var.f42591a;
        int i = y3d.h;
        return h2t0.a(this.f42591a, j) && h2t0.a(this.b, ygl0Var.b);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.f42591a) * 31);
    }

    public final String toString() {
        return b1j.k("Static(marketLabelColor=", y3d.i(this.f42591a), ", coefficientLabelColor=", y3d.i(this.b), Separators.RPAREN);
    }
}
