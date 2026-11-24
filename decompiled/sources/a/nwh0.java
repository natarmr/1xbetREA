package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nwh0 implements qwh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f24234a;
    public final int b;
    public final dxh0 c;

    public nwh0(int i, a4x a4xVar, dxh0 dxh0Var) {
        a4xVar.getClass();
        this.f24234a = a4xVar;
        this.b = i;
        this.c = dxh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwh0)) {
            return false;
        }
        nwh0 nwh0Var = (nwh0) obj;
        return Intrinsics.d(this.f24234a, nwh0Var.f24234a) && this.b == nwh0Var.b && this.c.equals(nwh0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f24234a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Data(teams=" + this.f24234a + ", selectedSegmentIndex=" + this.b + ", segmentedControlStyle=" + this.c + Separators.RPAREN;
    }
}
