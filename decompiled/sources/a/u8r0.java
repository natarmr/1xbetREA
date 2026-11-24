package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u8r0 implements f0r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2r0 f35245a;
    public final j1r0 b;
    public final List c;

    public u8r0(f2r0 f2r0Var, j1r0 j1r0Var, List list) {
        list.getClass();
        this.f35245a = f2r0Var;
        this.b = j1r0Var;
        this.c = list;
    }

    public static u8r0 b(u8r0 u8r0Var, j1r0 j1r0Var, List list, int i) {
        f2r0 f2r0Var = u8r0Var.f35245a;
        if ((i & 4) != 0) {
            list = u8r0Var.c;
        }
        j1r0Var.getClass();
        list.getClass();
        return new u8r0(f2r0Var, j1r0Var, list);
    }

    @Override // a.f0r0
    public final j1r0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8r0)) {
            return false;
        }
        u8r0 u8r0Var = (u8r0) obj;
        return this.f35245a.equals(u8r0Var.f35245a) && this.b.equals(u8r0Var.b) && Intrinsics.d(this.c, u8r0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.h(this.b, this.f35245a.hashCode() * 31, 31);
    }

    public final String toString() {
        return dw9.r(brm0.s("TopOneXGamesTapeState(contentType=", this.f35245a, ", contentStatus=", this.b, ", list="), this.c, Separators.RPAREN);
    }
}
