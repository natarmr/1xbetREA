package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g3c0 {
    public static final g3c0 c = new g3c0(0.0f, new cvc(0.0f, 0.0f));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10603a;
    public final cvc b;

    public g3c0(float f, cvc cvcVar) {
        this.f10603a = f;
        this.b = cvcVar;
        if (Float.isNaN(f)) {
            jf4.o("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3c0)) {
            return false;
        }
        g3c0 g3c0Var = (g3c0) obj;
        return this.f10603a == g3c0Var.f10603a && Intrinsics.d(this.b, g3c0Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (Float.hashCode(this.f10603a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.f10603a + ", range=" + this.b + ", steps=0)";
    }
}
