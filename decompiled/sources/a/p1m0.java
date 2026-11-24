package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p1m0 implements q1m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0m0 f26210a;
    public final List b;
    public final xhh0 c;

    public p1m0(z0m0 z0m0Var, List list, xhh0 xhh0Var) {
        list.getClass();
        this.f26210a = z0m0Var;
        this.b = list;
        this.c = xhh0Var;
    }

    @Override // a.q1m0
    public final boolean a() {
        return true;
    }

    @Override // a.q1m0
    public final z0m0 b() {
        return this.f26210a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1m0)) {
            return false;
        }
        p1m0 p1m0Var = (p1m0) obj;
        return this.f26210a.equals(p1m0Var.f26210a) && Intrinsics.d(this.b, p1m0Var.b) && this.c.equals(p1m0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(brm0.e(this.f26210a.hashCode() * 31, 31, true), 31, this.b);
    }

    public final String toString() {
        return "Success(headerUiState=" + this.f26210a + ", rtlSupport=true, data=" + this.b + ", searchResult=" + this.c + Separators.RPAREN;
    }
}
