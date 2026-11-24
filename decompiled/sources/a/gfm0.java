package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gfm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pm80 f11214a;
    public final a4d b;

    public gfm0(pm80 pm80Var, m78 m78Var) {
        pm80Var.getClass();
        this.f11214a = pm80Var;
        this.b = m78Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfm0)) {
            return false;
        }
        gfm0 gfm0Var = (gfm0) obj;
        return Intrinsics.d(this.f11214a, gfm0Var.f11214a) && Intrinsics.d(this.b, gfm0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f11214a.hashCode() * 31;
        a4d a4dVar = this.b;
        return iHashCode + (a4dVar == null ? 0 : a4dVar.hashCode());
    }

    public final String toString() {
        return "StatisticPainter(painter=" + this.f11214a + ", colorFilter=" + this.b + Separators.RPAREN;
    }
}
