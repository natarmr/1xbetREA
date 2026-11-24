package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wwh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f39885a;
    public final a4x b;
    public final dxh0 c;
    public final int d;

    public wwh0(i4 i4Var, a4x a4xVar, dxh0 dxh0Var, int i) {
        i4Var.getClass();
        a4xVar.getClass();
        dxh0Var.getClass();
        this.f39885a = i4Var;
        this.b = a4xVar;
        this.c = dxh0Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwh0)) {
            return false;
        }
        wwh0 wwh0Var = (wwh0) obj;
        return Intrinsics.d(this.f39885a, wwh0Var.f39885a) && Intrinsics.d(this.b, wwh0Var.b) && Intrinsics.d(this.c, wwh0Var.c) && this.d == wwh0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + hne.h(this.c, cs0.b(this.b, this.f39885a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = rw2.q("SegmentUiState(pages=", this.f39885a, ", segments=", this.b, ", style=");
        sbQ.append(this.c);
        sbQ.append(", selectedIndex=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
