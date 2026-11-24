package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y7v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x7v0 f42172a;
    public final a4x b;

    public y7v0(x7v0 x7v0Var, a4x a4xVar) {
        a4xVar.getClass();
        this.f42172a = x7v0Var;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7v0)) {
            return false;
        }
        y7v0 y7v0Var = (y7v0) obj;
        return Intrinsics.d(this.f42172a, y7v0Var.f42172a) && Intrinsics.d(this.b, y7v0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42172a.hashCode() * 31);
    }

    public final String toString() {
        return "WeightClassRatingScreenStateUiModel(contentState=" + this.f42172a + ", uiItems=" + this.b + Separators.RPAREN;
    }

    public y7v0(w7v0 w7v0Var) {
        this(w7v0Var, lak0.c);
    }
}
