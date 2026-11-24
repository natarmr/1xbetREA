package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jpm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mm40 f16909a;
    public final long b;
    public final y9q0 c;
    public final long d;

    public jpm(mm40 mm40Var, long j, y9q0 y9q0Var, long j2) {
        mm40Var.getClass();
        this.f16909a = mm40Var;
        this.b = j;
        this.c = y9q0Var;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpm)) {
            return false;
        }
        jpm jpmVar = (jpm) obj;
        if (!Intrinsics.d(this.f16909a, jpmVar.f16909a) || !daq0.a(this.b, jpmVar.b) || !this.c.equals(jpmVar.c)) {
            return false;
        }
        long j = jpmVar.d;
        int i = y3d.h;
        return h2t0.a(this.d, j);
    }

    public final int hashCode() {
        int iHashCode = this.f16909a.hashCode() * 31;
        eaq0[] eaq0VarArr = daq0.b;
        int iG = brm0.g(this.c, rw2.b(iHashCode, 31, this.b), 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.d) + iG;
    }

    public final String toString() {
        return "DsScoreConfig(containerModifier=" + this.f16909a + ", minTextSize=" + daq0.f(this.b) + ", textStyle=" + this.c + ", color=" + y3d.i(this.d) + Separators.RPAREN;
    }
}
