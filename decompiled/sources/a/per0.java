package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class per0 implements f0r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2r0 f26867a;
    public final j1r0 b;
    public final List c;

    public per0(f2r0 f2r0Var, j1r0 j1r0Var, List list) {
        list.getClass();
        this.f26867a = f2r0Var;
        this.b = j1r0Var;
        this.c = list;
    }

    public static per0 b(per0 per0Var, j1r0 j1r0Var, List list, int i) {
        f2r0 f2r0Var = per0Var.f26867a;
        if ((i & 4) != 0) {
            list = per0Var.c;
        }
        j1r0Var.getClass();
        list.getClass();
        return new per0(f2r0Var, j1r0Var, list);
    }

    @Override // a.f0r0
    public final j1r0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof per0)) {
            return false;
        }
        per0 per0Var = (per0) obj;
        return this.f26867a.equals(per0Var.f26867a) && this.b.equals(per0Var.b) && Intrinsics.d(this.c, per0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.h(this.b, this.f26867a.hashCode() * 31, 31);
    }

    public final String toString() {
        return dw9.r(brm0.s("TopSportGamesLineState(contentType=", this.f26867a, ", contentStatus=", this.b, ", list="), this.c, Separators.RPAREN);
    }
}
