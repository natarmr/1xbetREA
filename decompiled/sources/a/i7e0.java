package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i7e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h7e0 f14288a;
    public final a4x b;
    public final dxh0 c;

    public i7e0(h7e0 h7e0Var, i4 i4Var, dxh0 dxh0Var) {
        i4Var.getClass();
        this.f14288a = h7e0Var;
        this.b = i4Var;
        this.c = dxh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7e0)) {
            return false;
        }
        i7e0 i7e0Var = (i7e0) obj;
        return this.f14288a.equals(i7e0Var.f14288a) && Intrinsics.d(this.b, i7e0Var.b) && this.c.equals(i7e0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cs0.b(this.b, this.f14288a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "RatingSegmentsUiModel(currentSegment=" + this.f14288a + ", segmentList=" + this.b + ", segmentedControlStyle=" + this.c + Separators.RPAREN;
    }
}
