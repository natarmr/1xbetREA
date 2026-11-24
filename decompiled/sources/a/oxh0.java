package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class oxh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26012a;
    public final a4x b;
    public final dxh0 c;

    public oxh0(int i, a4x a4xVar, dxh0 dxh0Var) {
        a4xVar.getClass();
        this.f26012a = i;
        this.b = a4xVar;
        this.c = dxh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxh0)) {
            return false;
        }
        oxh0 oxh0Var = (oxh0) obj;
        return this.f26012a == oxh0Var.f26012a && Intrinsics.d(this.b, oxh0Var.b) && this.c.equals(oxh0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cs0.b(this.b, Integer.hashCode(this.f26012a) * 31, 31);
    }

    public final String toString() {
        return "SegmentsModel(selectedIndex=" + this.f26012a + ", segments=" + this.b + ", segmentedControlStyle=" + this.c + Separators.RPAREN;
    }
}
