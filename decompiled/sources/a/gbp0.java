package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gbp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fbp0 f11026a;
    public final a4x b;
    public final dxh0 c;

    public gbp0(fbp0 fbp0Var, a4x a4xVar, dxh0 dxh0Var) {
        a4xVar.getClass();
        this.f11026a = fbp0Var;
        this.b = a4xVar;
        this.c = dxh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbp0)) {
            return false;
        }
        gbp0 gbp0Var = (gbp0) obj;
        return this.f11026a.equals(gbp0Var.f11026a) && Intrinsics.d(this.b, gbp0Var.b) && this.c.equals(gbp0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cs0.b(this.b, this.f11026a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "TeamDetailsSegmentsUiModel(currentSegment=" + this.f11026a + ", segmentList=" + this.b + ", segmentedControlStyle=" + this.c + Separators.RPAREN;
    }
}
