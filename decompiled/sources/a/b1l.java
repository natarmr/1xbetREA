package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b1l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f1811a;

    public b1l(i4 i4Var) {
        i4Var.getClass();
        this.f1811a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1l) && Intrinsics.d(this.f1811a, ((b1l) obj).f1811a) && Float.compare(15.0f, 15.0f) == 0 && ycl.b(6.0f, 6.0f) && Float.compare(-65.0f, -65.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-65.0f) + defpackage.c.a(defpackage.c.a(this.f1811a.hashCode() * 31, 15.0f, 31), 6.0f, 31);
    }

    public final String toString() {
        return "DonutChartUiModel(pieDataPoints=" + this.f1811a + ", gapDegrees=15.0, strokeWidth=" + ycl.c(6.0f) + ", angle=-65.0)";
    }
}
