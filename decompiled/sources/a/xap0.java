package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xap0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p9p0 f40569a;
    public final r8p0 b;
    public final qap0 c;
    public final a4x d;
    public final boolean e;

    public xap0(p9p0 p9p0Var, r8p0 r8p0Var, qap0 qap0Var, a4x a4xVar, boolean z) {
        p9p0Var.getClass();
        r8p0Var.getClass();
        this.f40569a = p9p0Var;
        this.b = r8p0Var;
        this.c = qap0Var;
        this.d = a4xVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xap0)) {
            return false;
        }
        xap0 xap0Var = (xap0) obj;
        return Intrinsics.d(this.f40569a, xap0Var.f40569a) && Intrinsics.d(this.b, xap0Var.b) && this.c.equals(xap0Var.c) && this.d.equals(xap0Var.d) && this.e == xap0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + cs0.b(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f40569a.f26619a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamDetailsResultsUiState(navigationBarUiModel=");
        sb.append(this.f40569a);
        sb.append(", calendarUiModel=");
        sb.append(this.b);
        sb.append(", contentUiModel=");
        sb.append(this.c);
        sb.append(", uiItemList=");
        sb.append(this.d);
        sb.append(", loading=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
