package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kt00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18840a;
    public final a4x b;

    public kt00(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f18840a = z;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt00)) {
            return false;
        }
        kt00 kt00Var = (kt00) obj;
        return this.f18840a == kt00Var.f18840a && Intrinsics.d(this.b, kt00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f18840a) * 31);
    }

    public final String toString() {
        return "UiState(loading=" + this.f18840a + ", items=" + this.b + Separators.RPAREN;
    }
}
