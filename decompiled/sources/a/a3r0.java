package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a3r0 implements f0r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2r0 f187a;
    public final j1r0 b;
    public final List c;

    public a3r0(f2r0 f2r0Var, j1r0 j1r0Var, List list) {
        list.getClass();
        this.f187a = f2r0Var;
        this.b = j1r0Var;
        this.c = list;
    }

    public static a3r0 b(a3r0 a3r0Var, j1r0 j1r0Var, List list, int i) {
        f2r0 f2r0Var = a3r0Var.f187a;
        if ((i & 4) != 0) {
            list = a3r0Var.c;
        }
        j1r0Var.getClass();
        list.getClass();
        return new a3r0(f2r0Var, j1r0Var, list);
    }

    @Override // a.f0r0
    public final j1r0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3r0)) {
            return false;
        }
        a3r0 a3r0Var = (a3r0) obj;
        return this.f187a.equals(a3r0Var.f187a) && this.b.equals(a3r0Var.b) && Intrinsics.d(this.c, a3r0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.h(this.b, this.f187a.hashCode() * 31, 31);
    }

    public final String toString() {
        return dw9.r(brm0.s("TopCyberPopularLineState(contentType=", this.f187a, ", contentStatus=", this.b, ", list="), this.c, Separators.RPAREN);
    }
}
