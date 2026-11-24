package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zph0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dxh0 f44760a;
    public final a4x b;
    public final oqh0 c;
    public final int d;

    public zph0(dxh0 dxh0Var, a4x a4xVar, oqh0 oqh0Var, int i) {
        a4xVar.getClass();
        this.f44760a = dxh0Var;
        this.b = a4xVar;
        this.c = oqh0Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zph0)) {
            return false;
        }
        zph0 zph0Var = (zph0) obj;
        return this.f44760a.equals(zph0Var.f44760a) && Intrinsics.d(this.b, zph0Var.b) && this.c == zph0Var.c && this.d == zph0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + cs0.b(this.b, this.f44760a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "SecurityGiftContainerUiState(segmentedControlStyle=" + this.f44760a + ", segmentedControlPages=" + this.b + ", selectedScreen=" + this.c + ", currentPage=" + this.d + Separators.RPAREN;
    }
}
