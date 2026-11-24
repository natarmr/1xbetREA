package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vwh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f38150a;
    public final int b;
    public final dxh0 c;

    public vwh0(int i, a4x a4xVar, dxh0 dxh0Var) {
        a4xVar.getClass();
        dxh0Var.getClass();
        this.f38150a = a4xVar;
        this.b = i;
        this.c = dxh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwh0)) {
            return false;
        }
        vwh0 vwh0Var = (vwh0) obj;
        return Intrinsics.d(this.f38150a, vwh0Var.f38150a) && this.b == vwh0Var.b && Intrinsics.d(this.c, vwh0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f38150a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "SegmentUiState(pages=" + this.f38150a + ", selectedIndex=" + this.b + ", style=" + this.c + Separators.RPAREN;
    }
}
