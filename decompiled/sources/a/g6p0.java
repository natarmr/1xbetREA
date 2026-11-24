package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g6p0 implements h6p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u5p0 f10779a;
    public final boolean b;
    public final a4x c;

    public g6p0(u5p0 u5p0Var, boolean z, a4x a4xVar) {
        a4xVar.getClass();
        this.f10779a = u5p0Var;
        this.b = z;
        this.c = a4xVar;
    }

    @Override // a.h6p0
    public final boolean a() {
        return this.b;
    }

    @Override // a.h6p0
    public final u5p0 b() {
        return this.f10779a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6p0)) {
            return false;
        }
        g6p0 g6p0Var = (g6p0) obj;
        return this.f10779a.equals(g6p0Var.f10779a) && this.b == g6p0Var.b && Intrinsics.d(this.c, g6p0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f10779a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(headerUiState=");
        sb.append(this.f10779a);
        sb.append(", rtlSupport=");
        sb.append(this.b);
        sb.append(", contentList=");
        return cs0.n(sb, this.c, Separators.RPAREN);
    }
}
