package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jvi0 implements pvi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17205a;
    public final y3d b;

    public jvi0(String str, y3d y3dVar) {
        str.getClass();
        this.f17205a = str;
        this.b = y3dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvi0)) {
            return false;
        }
        jvi0 jvi0Var = (jvi0) obj;
        return Intrinsics.d(this.f17205a, jvi0Var.f17205a) && Intrinsics.d(this.b, jvi0Var.b);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f17205a.hashCode() * 31;
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
        return "Label(labelText=" + this.f17205a + ", labelColor=" + this.b + Separators.RPAREN;
    }
}
