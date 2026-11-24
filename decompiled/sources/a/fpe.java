package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fpe implements ope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3d f9924a;
    public final boolean b;

    public fpe(y3d y3dVar, boolean z, int i) {
        y3dVar = (i & 1) != 0 ? null : y3dVar;
        z = (i & 2) != 0 ? false : z;
        this.f9924a = y3dVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpe)) {
            return false;
        }
        fpe fpeVar = (fpe) obj;
        return Intrinsics.d(this.f9924a, fpeVar.f9924a) && this.b == fpeVar.b;
    }

    @Override // a.ope
    public final boolean g() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode;
        y3d y3dVar = this.f9924a;
        if (y3dVar == null) {
            iHashCode = 0;
        } else {
            long j = y3dVar.f41946a;
            g2t0 g2t0Var = h2t0.b;
            iHashCode = Long.hashCode(j);
        }
        return Boolean.hashCode(this.b) + (iHashCode * 31);
    }

    public final String toString() {
        return "Clear(textColor=" + this.f9924a + ", isStatic=" + this.b + Separators.RPAREN;
    }
}
