package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j7o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y6o0 f16052a;
    public final b7o0 b;
    public final a4x c;
    public final boolean d;

    public j7o0(y6o0 y6o0Var, b7o0 b7o0Var, a4x a4xVar, boolean z) {
        y6o0Var.getClass();
        a4xVar.getClass();
        this.f16052a = y6o0Var;
        this.b = b7o0Var;
        this.c = a4xVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7o0)) {
            return false;
        }
        j7o0 j7o0Var = (j7o0) obj;
        return Intrinsics.d(this.f16052a, j7o0Var.f16052a) && this.b.equals(j7o0Var.b) && Intrinsics.d(this.c, j7o0Var.c) && this.d == j7o0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cs0.b(this.c, (this.b.hashCode() + (this.f16052a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SyntheticResultsUiState(calendarUiModel=");
        sb.append(this.f16052a);
        sb.append(", contentUiModel=");
        sb.append(this.b);
        sb.append(", uiItemList=");
        return rz4.m(sb, this.c, ", loading=", this.d, Separators.RPAREN);
    }
}
