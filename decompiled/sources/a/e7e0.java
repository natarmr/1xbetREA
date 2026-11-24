package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e7e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7e0 f7324a;
    public final a4x b;

    public e7e0(d7e0 d7e0Var, a4x a4xVar) {
        a4xVar.getClass();
        this.f7324a = d7e0Var;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7e0)) {
            return false;
        }
        e7e0 e7e0Var = (e7e0) obj;
        return Intrinsics.d(this.f7324a, e7e0Var.f7324a) && Intrinsics.d(this.b, e7e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7324a.hashCode() * 31);
    }

    public final String toString() {
        return "RatingScreenStateUiModel(contentState=" + this.f7324a + ", uiItems=" + this.b + Separators.RPAREN;
    }

    public e7e0(c7e0 c7e0Var) {
        this(c7e0Var, lak0.c);
    }
}
