package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z2n implements b3n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f43678a;
    public final y3d b;

    public z2n(a4x a4xVar, y3d y3dVar) {
        a4xVar.getClass();
        this.f43678a = a4xVar;
        this.b = y3dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2n)) {
            return false;
        }
        z2n z2nVar = (z2n) obj;
        return Intrinsics.d(this.f43678a, z2nVar.f43678a) && Intrinsics.d(this.b, z2nVar.b);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f43678a.hashCode() * 31;
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
        return "Default(items=" + this.f43678a + ", backgroundColor=" + this.b + Separators.RPAREN;
    }
}
