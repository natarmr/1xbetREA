package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final class gpm implements ipm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11689a;

    public gpm() {
        pz40 pz40Var = s6t0.f31722a;
        this.f11689a = StaticColors.INSTANCE.m125getWhite100d7_KjU();
    }

    @Override // a.ipm
    public final long a() {
        return this.f11689a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpm)) {
            return false;
        }
        long j = ((gpm) obj).f11689a;
        int i = y3d.h;
        return h2t0.a(this.f11689a, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f11689a);
    }

    public final String toString() {
        return kng0.l("Static(borderColor=", y3d.i(this.f11689a), Separators.RPAREN);
    }
}
