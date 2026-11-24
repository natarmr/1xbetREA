package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zyq0 implements f0r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2r0 f45218a;
    public final j1r0 b;
    public final List c;

    public zyq0(f2r0 f2r0Var, j1r0 j1r0Var, List list) {
        list.getClass();
        this.f45218a = f2r0Var;
        this.b = j1r0Var;
        this.c = list;
    }

    public static zyq0 b(zyq0 zyq0Var, j1r0 j1r0Var, List list, int i) {
        f2r0 f2r0Var = zyq0Var.f45218a;
        if ((i & 4) != 0) {
            list = zyq0Var.c;
        }
        j1r0Var.getClass();
        list.getClass();
        return new zyq0(f2r0Var, j1r0Var, list);
    }

    @Override // a.f0r0
    public final j1r0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyq0)) {
            return false;
        }
        zyq0 zyq0Var = (zyq0) obj;
        return this.f45218a.equals(zyq0Var.f45218a) && this.b.equals(zyq0Var.b) && Intrinsics.d(this.c, zyq0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.h(this.b, this.f45218a.hashCode() * 31, 31);
    }

    public final String toString() {
        return dw9.r(brm0.s("TopBannerTapeState(contentType=", this.f45218a, ", contentStatus=", this.b, ", list="), this.c, Separators.RPAREN);
    }
}
