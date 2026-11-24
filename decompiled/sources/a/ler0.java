package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ler0 implements f0r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2r0 f19918a;
    public final j1r0 b;
    public final List c;

    public ler0(f2r0 f2r0Var, j1r0 j1r0Var, List list) {
        list.getClass();
        this.f19918a = f2r0Var;
        this.b = j1r0Var;
        this.c = list;
    }

    public static ler0 b(ler0 ler0Var, j1r0 j1r0Var, List list, int i) {
        f2r0 f2r0Var = ler0Var.f19918a;
        if ((i & 4) != 0) {
            list = ler0Var.c;
        }
        j1r0Var.getClass();
        list.getClass();
        return new ler0(f2r0Var, j1r0Var, list);
    }

    @Override // a.f0r0
    public final j1r0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ler0)) {
            return false;
        }
        ler0 ler0Var = (ler0) obj;
        return this.f19918a.equals(ler0Var.f19918a) && this.b.equals(ler0Var.b) && Intrinsics.d(this.c, ler0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.h(this.b, this.f19918a.hashCode() * 31, 31);
    }

    public final String toString() {
        return dw9.r(brm0.s("TopSportFilterTapeState(contentType=", this.f19918a, ", contentStatus=", this.b, ", list="), this.c, Separators.RPAREN);
    }
}
