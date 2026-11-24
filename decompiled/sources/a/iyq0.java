package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class iyq0 implements f0r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2r0 f15601a;
    public final j1r0 b;
    public final List c;

    public iyq0(f2r0 f2r0Var, j1r0 j1r0Var, List list) {
        list.getClass();
        this.f15601a = f2r0Var;
        this.b = j1r0Var;
        this.c = list;
    }

    public static iyq0 b(iyq0 iyq0Var, j1r0 j1r0Var, List list, int i) {
        f2r0 f2r0Var = iyq0Var.f15601a;
        if ((i & 4) != 0) {
            list = iyq0Var.c;
        }
        j1r0Var.getClass();
        list.getClass();
        return new iyq0(f2r0Var, j1r0Var, list);
    }

    @Override // a.f0r0
    public final j1r0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyq0)) {
            return false;
        }
        iyq0 iyq0Var = (iyq0) obj;
        return this.f15601a.equals(iyq0Var.f15601a) && this.b.equals(iyq0Var.b) && Intrinsics.d(this.c, iyq0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.h(this.b, this.f15601a.hashCode() * 31, 31);
    }

    public final String toString() {
        return dw9.r(brm0.s("TopAggregatorTournamentState(contentType=", this.f15601a, ", contentStatus=", this.b, ", list="), this.c, Separators.RPAREN);
    }
}
