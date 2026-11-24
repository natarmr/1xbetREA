package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mvi0 implements pvi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22458a;
    public final y3d b;

    public mvi0(String str, y3d y3dVar) {
        str.getClass();
        this.f22458a = str;
        this.b = y3dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvi0)) {
            return false;
        }
        mvi0 mvi0Var = (mvi0) obj;
        return Intrinsics.d(this.f22458a, mvi0Var.f22458a) && Intrinsics.d(this.b, mvi0Var.b);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f22458a.hashCode() * 31;
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
        return "MediumLabel(labelText=" + this.f22458a + ", labelColor=" + this.b + Separators.RPAREN;
    }
}
