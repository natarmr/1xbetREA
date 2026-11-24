package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j2r0 implements f0r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2r0 f15796a;
    public final j1r0 b;
    public final List c;

    public j2r0(f2r0 f2r0Var, j1r0 j1r0Var, List list) {
        list.getClass();
        this.f15796a = f2r0Var;
        this.b = j1r0Var;
        this.c = list;
    }

    public static j2r0 b(j2r0 j2r0Var, j1r0 j1r0Var, List list, int i) {
        f2r0 f2r0Var = j2r0Var.f15796a;
        if ((i & 4) != 0) {
            list = j2r0Var.c;
        }
        j1r0Var.getClass();
        list.getClass();
        return new j2r0(f2r0Var, j1r0Var, list);
    }

    @Override // a.f0r0
    public final j1r0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2r0)) {
            return false;
        }
        j2r0 j2r0Var = (j2r0) obj;
        return this.f15796a.equals(j2r0Var.f15796a) && this.b.equals(j2r0Var.b) && Intrinsics.d(this.c, j2r0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.h(this.b, this.f15796a.hashCode() * 31, 31);
    }

    public final String toString() {
        return dw9.r(brm0.s("TopCyberChampsLiveState(contentType=", this.f15796a, ", contentStatus=", this.b, ", list="), this.c, Separators.RPAREN);
    }
}
