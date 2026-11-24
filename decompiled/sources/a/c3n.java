package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c3n implements e3n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f3685a;
    public final y3d b;

    public c3n(a4x a4xVar, y3d y3dVar) {
        a4xVar.getClass();
        this.f3685a = a4xVar;
        this.b = y3dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3n)) {
            return false;
        }
        c3n c3nVar = (c3n) obj;
        return Intrinsics.d(this.f3685a, c3nVar.f3685a) && Intrinsics.d(this.b, c3nVar.b);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f3685a.hashCode() * 31;
        y3d y3dVar = this.b;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        return "Default(items=" + this.f3685a + ", backgroundColor=" + this.b + Separators.RPAREN;
    }
}
