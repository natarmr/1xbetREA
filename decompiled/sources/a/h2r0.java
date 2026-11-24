package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h2r0 implements f0r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2r0 f12349a;
    public final j1r0 b;
    public final List c;

    public h2r0(f2r0 f2r0Var, j1r0 j1r0Var, List list) {
        list.getClass();
        this.f12349a = f2r0Var;
        this.b = j1r0Var;
        this.c = list;
    }

    public static h2r0 b(h2r0 h2r0Var, j1r0 j1r0Var, List list, int i) {
        f2r0 f2r0Var = h2r0Var.f12349a;
        if ((i & 4) != 0) {
            list = h2r0Var.c;
        }
        j1r0Var.getClass();
        list.getClass();
        return new h2r0(f2r0Var, j1r0Var, list);
    }

    @Override // a.f0r0
    public final j1r0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2r0)) {
            return false;
        }
        h2r0 h2r0Var = (h2r0) obj;
        return this.f12349a.equals(h2r0Var.f12349a) && this.b.equals(h2r0Var.b) && Intrinsics.d(this.c, h2r0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.h(this.b, this.f12349a.hashCode() * 31, 31);
    }

    public final String toString() {
        return dw9.r(brm0.s("TopCyberChampsLineState(contentType=", this.f12349a, ", contentStatus=", this.b, ", list="), this.c, Separators.RPAREN);
    }
}
