package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xm8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vz2 f41111a = null;
    public uw2 b = null;
    public a6a c = null;
    public w03 d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm8)) {
            return false;
        }
        xm8 xm8Var = (xm8) obj;
        return Intrinsics.d(this.f41111a, xm8Var.f41111a) && Intrinsics.d(this.b, xm8Var.b) && Intrinsics.d(this.c, xm8Var.c) && Intrinsics.d(this.d, xm8Var.d);
    }

    public final int hashCode() {
        vz2 vz2Var = this.f41111a;
        int iHashCode = (vz2Var == null ? 0 : vz2Var.hashCode()) * 31;
        uw2 uw2Var = this.b;
        int iHashCode2 = (iHashCode + (uw2Var == null ? 0 : uw2Var.hashCode())) * 31;
        a6a a6aVar = this.c;
        int iHashCode3 = (iHashCode2 + (a6aVar == null ? 0 : a6aVar.hashCode())) * 31;
        w03 w03Var = this.d;
        return iHashCode3 + (w03Var != null ? w03Var.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f41111a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + Separators.RPAREN;
    }
}
