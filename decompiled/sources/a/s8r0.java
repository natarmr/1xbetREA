package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s8r0 implements f0r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2r0 f31816a;
    public final j1r0 b;
    public final List c;

    public s8r0(f2r0 f2r0Var, j1r0 j1r0Var, List list) {
        list.getClass();
        this.f31816a = f2r0Var;
        this.b = j1r0Var;
        this.c = list;
    }

    public static s8r0 b(s8r0 s8r0Var, j1r0 j1r0Var, List list, int i) {
        f2r0 f2r0Var = s8r0Var.f31816a;
        if ((i & 4) != 0) {
            list = s8r0Var.c;
        }
        j1r0Var.getClass();
        list.getClass();
        return new s8r0(f2r0Var, j1r0Var, list);
    }

    @Override // a.f0r0
    public final j1r0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8r0)) {
            return false;
        }
        s8r0 s8r0Var = (s8r0) obj;
        return this.f31816a.equals(s8r0Var.f31816a) && this.b.equals(s8r0Var.b) && Intrinsics.d(this.c, s8r0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.h(this.b, this.f31816a.hashCode() * 31, 31);
    }

    public final String toString() {
        return dw9.r(brm0.s("TopOneXGamesCategoriesState(contentType=", this.f31816a, ", contentStatus=", this.b, ", list="), this.c, Separators.RPAREN);
    }
}
