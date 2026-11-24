package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hyq0 implements f0r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2r0 f13871a;
    public final j1r0 b;
    public final List c;
    public final List d;

    public hyq0(f2r0 f2r0Var, j1r0 j1r0Var, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f13871a = f2r0Var;
        this.b = j1r0Var;
        this.c = list;
        this.d = list2;
    }

    public static hyq0 b(hyq0 hyq0Var, j1r0 j1r0Var, List list, lc00 lc00Var, int i) {
        f2r0 f2r0Var = hyq0Var.f13871a;
        if ((i & 4) != 0) {
            list = hyq0Var.c;
        }
        List list2 = lc00Var;
        if ((i & 8) != 0) {
            list2 = hyq0Var.d;
        }
        j1r0Var.getClass();
        list.getClass();
        list2.getClass();
        return new hyq0(f2r0Var, j1r0Var, list, list2);
    }

    @Override // a.f0r0
    public final j1r0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hyq0)) {
            return false;
        }
        hyq0 hyq0Var = (hyq0) obj;
        return this.f13871a.equals(hyq0Var.f13871a) && this.b.equals(hyq0Var.b) && Intrinsics.d(this.c, hyq0Var.c) && Intrinsics.d(this.d, hyq0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(brm0.h(this.b, this.f13871a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return kng0.n(", games=", Separators.RPAREN, brm0.s("TopAggregatorRecommendedState(contentType=", this.f13871a, ", contentStatus=", this.b, ", list="), this.c, this.d);
    }
}
