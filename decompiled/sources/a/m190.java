package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m190 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dxh0 f20996a;
    public final a4x b;
    public final int c;

    public m190(int i, a4x a4xVar, dxh0 dxh0Var) {
        a4xVar.getClass();
        this.f20996a = dxh0Var;
        this.b = a4xVar;
        this.c = i;
    }

    public static m190 a(m190 m190Var, dxh0 dxh0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            dxh0Var = m190Var.f20996a;
        }
        a4x a4xVar = m190Var.b;
        if ((i2 & 4) != 0) {
            i = m190Var.c;
        }
        m190Var.getClass();
        a4xVar.getClass();
        return new m190(i, a4xVar, dxh0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m190)) {
            return false;
        }
        m190 m190Var = (m190) obj;
        return this.f20996a.equals(m190Var.f20996a) && Intrinsics.d(this.b, m190Var.b) && this.c == m190Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cs0.b(this.b, this.f20996a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SegmentedControlUiState(segmentedControlStyle=");
        sb.append(this.f20996a);
        sb.append(", segmentedControlPages=");
        sb.append(this.b);
        sb.append(", currentPage=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
