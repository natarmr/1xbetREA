package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k1h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f17523a;
    public final long b;
    public final cfq c;

    public k1h0(float f, long j, cfq cfqVar) {
        this.f17523a = f;
        this.b = j;
        this.c = cfqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1h0)) {
            return false;
        }
        k1h0 k1h0Var = (k1h0) obj;
        return Float.compare(this.f17523a, k1h0Var.f17523a) == 0 && ils0.a(this.b, k1h0Var.b) && Intrinsics.d(this.c, k1h0Var.c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f17523a) * 31;
        int i = ils0.c;
        return this.c.hashCode() + rw2.b(iHashCode, 31, this.b);
    }

    public final String toString() {
        return "Scale(scale=" + this.f17523a + ", transformOrigin=" + ils0.b(this.b) + ", animationSpec=" + this.c + Separators.RPAREN;
    }
}
