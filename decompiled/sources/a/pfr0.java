package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pfr0 implements f0r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2r0 f26919a;
    public final j1r0 b;
    public final List c;
    public final List d;

    public pfr0(f2r0 f2r0Var, j1r0 j1r0Var, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f26919a = f2r0Var;
        this.b = j1r0Var;
        this.c = list;
        this.d = list2;
    }

    public static pfr0 b(pfr0 pfr0Var, j1r0 j1r0Var, List list, lc00 lc00Var, int i) {
        f2r0 f2r0Var = pfr0Var.f26919a;
        if ((i & 4) != 0) {
            list = pfr0Var.c;
        }
        List list2 = lc00Var;
        if ((i & 8) != 0) {
            list2 = pfr0Var.d;
        }
        j1r0Var.getClass();
        list.getClass();
        list2.getClass();
        return new pfr0(f2r0Var, j1r0Var, list, list2);
    }

    @Override // a.f0r0
    public final j1r0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfr0)) {
            return false;
        }
        pfr0 pfr0Var = (pfr0) obj;
        return this.f26919a.equals(pfr0Var.f26919a) && this.b.equals(pfr0Var.b) && Intrinsics.d(this.c, pfr0Var.c) && Intrinsics.d(this.d, pfr0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(brm0.h(this.b, this.f26919a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return kng0.n(", games=", Separators.RPAREN, brm0.s("TopVirtualGamesState(contentType=", this.f26919a, ", contentStatus=", this.b, ", list="), this.c, this.d);
    }
}
