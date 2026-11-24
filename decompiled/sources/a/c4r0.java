package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c4r0 implements f0r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2r0 f3740a;
    public final j1r0 b;
    public final List c;

    public c4r0(f2r0 f2r0Var, j1r0 j1r0Var, List list) {
        list.getClass();
        this.f3740a = f2r0Var;
        this.b = j1r0Var;
        this.c = list;
    }

    public static c4r0 b(c4r0 c4r0Var, j1r0 j1r0Var, List list, int i) {
        f2r0 f2r0Var = c4r0Var.f3740a;
        if ((i & 4) != 0) {
            list = c4r0Var.c;
        }
        j1r0Var.getClass();
        list.getClass();
        return new c4r0(f2r0Var, j1r0Var, list);
    }

    @Override // a.f0r0
    public final j1r0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4r0)) {
            return false;
        }
        c4r0 c4r0Var = (c4r0) obj;
        return this.f3740a.equals(c4r0Var.f3740a) && this.b.equals(c4r0Var.b) && Intrinsics.d(this.c, c4r0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.h(this.b, this.f3740a.hashCode() * 31, 31);
    }

    public final String toString() {
        return dw9.r(brm0.s("TopEventsState(contentType=", this.f3740a, ", contentStatus=", this.b, ", list="), this.c, Separators.RPAREN);
    }
}
