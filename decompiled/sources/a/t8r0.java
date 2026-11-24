package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t8r0 implements f0r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2r0 f33525a;
    public final j1r0 b;
    public final List c;

    public t8r0(f2r0 f2r0Var, j1r0 j1r0Var, List list) {
        list.getClass();
        this.f33525a = f2r0Var;
        this.b = j1r0Var;
        this.c = list;
    }

    public static t8r0 b(t8r0 t8r0Var, j1r0 j1r0Var, List list, int i) {
        f2r0 f2r0Var = t8r0Var.f33525a;
        if ((i & 4) != 0) {
            list = t8r0Var.c;
        }
        j1r0Var.getClass();
        list.getClass();
        return new t8r0(f2r0Var, j1r0Var, list);
    }

    @Override // a.f0r0
    public final j1r0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8r0)) {
            return false;
        }
        t8r0 t8r0Var = (t8r0) obj;
        return this.f33525a.equals(t8r0Var.f33525a) && this.b.equals(t8r0Var.b) && Intrinsics.d(this.c, t8r0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.h(this.b, this.f33525a.hashCode() * 31, 31);
    }

    public final String toString() {
        return dw9.r(brm0.s("TopOneXGamesSpotlightState(contentType=", this.f33525a, ", contentStatus=", this.b, ", list="), this.c, Separators.RPAREN);
    }
}
