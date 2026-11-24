package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qer0 implements f0r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2r0 f28597a;
    public final j1r0 b;
    public final List c;

    public qer0(f2r0 f2r0Var, j1r0 j1r0Var, List list) {
        list.getClass();
        this.f28597a = f2r0Var;
        this.b = j1r0Var;
        this.c = list;
    }

    public static qer0 b(qer0 qer0Var, j1r0 j1r0Var, List list, int i) {
        f2r0 f2r0Var = qer0Var.f28597a;
        if ((i & 4) != 0) {
            list = qer0Var.c;
        }
        j1r0Var.getClass();
        list.getClass();
        return new qer0(f2r0Var, j1r0Var, list);
    }

    @Override // a.f0r0
    public final j1r0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qer0)) {
            return false;
        }
        qer0 qer0Var = (qer0) obj;
        return this.f28597a.equals(qer0Var.f28597a) && this.b.equals(qer0Var.b) && Intrinsics.d(this.c, qer0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.h(this.b, this.f28597a.hashCode() * 31, 31);
    }

    public final String toString() {
        return dw9.r(brm0.s("TopSportGamesLiveState(contentType=", this.f28597a, ", contentStatus=", this.b, ", list="), this.c, Separators.RPAREN);
    }
}
