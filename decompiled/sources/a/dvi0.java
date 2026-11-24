package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dvi0 implements pvi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0x f6745a;
    public final y3d b;

    public dvi0(m0x m0xVar, y3d y3dVar, int i) {
        this.f6745a = m0xVar;
        this.b = y3dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvi0)) {
            return false;
        }
        dvi0 dvi0Var = (dvi0) obj;
        return Intrinsics.d(this.f6745a, dvi0Var.f6745a) && Intrinsics.d(this.b, dvi0Var.b);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f6745a.hashCode() * 31;
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
        return "ButtonImage(placeholderResId=null, imageLink=" + this.f6745a + ", imageTint=" + this.b + Separators.RPAREN;
    }
}
