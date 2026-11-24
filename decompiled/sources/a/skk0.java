package a;

import android.gov.nist.core.Separators;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class skk0 extends t89 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32354a;

    public skk0(long j) {
        this.f32354a = j;
    }

    @Override // a.t89
    public final void a(float f, long j, ucs0 ucs0Var) {
        ucs0Var.q(1.0f);
        long jC = this.f32354a;
        if (f != 1.0f) {
            jC = y3d.c(y3d.d(jC) * f, jC);
        }
        ucs0Var.s(jC);
        if (((Shader) ucs0Var.d) != null) {
            ucs0Var.w(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skk0)) {
            return false;
        }
        long j = ((skk0) obj).f32354a;
        int i = y3d.h;
        return h2t0.a(this.f32354a, j);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f32354a);
    }

    public final String toString() {
        return kng0.l("SolidColor(value=", y3d.i(this.f32354a), Separators.RPAREN);
    }
}
