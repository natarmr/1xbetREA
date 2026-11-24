package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class uwh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f36392a;
    public final dxh0 b;
    public final int c;

    public uwh0(int i, a4x a4xVar, dxh0 dxh0Var) {
        a4xVar.getClass();
        dxh0Var.getClass();
        this.f36392a = a4xVar;
        this.b = dxh0Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwh0)) {
            return false;
        }
        uwh0 uwh0Var = (uwh0) obj;
        return Intrinsics.d(this.f36392a, uwh0Var.f36392a) && Intrinsics.d(this.b, uwh0Var.b) && this.c == uwh0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + hne.h(this.b, this.f36392a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SegmentUiState(pages=");
        sb.append(this.f36392a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", selectedIndex=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
