package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class her0 implements f0r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2r0 f12936a;
    public final j1r0 b;
    public final List c;
    public final Set d;

    public her0(f2r0 f2r0Var, j1r0 j1r0Var, List list, Set set) {
        list.getClass();
        set.getClass();
        this.f12936a = f2r0Var;
        this.b = j1r0Var;
        this.c = list;
        this.d = set;
    }

    public static her0 b(her0 her0Var, j1r0 j1r0Var, List list, Set set, int i) {
        f2r0 f2r0Var = her0Var.f12936a;
        if ((i & 4) != 0) {
            list = her0Var.c;
        }
        if ((i & 8) != 0) {
            set = her0Var.d;
        }
        j1r0Var.getClass();
        list.getClass();
        set.getClass();
        return new her0(f2r0Var, j1r0Var, list, set);
    }

    @Override // a.f0r0
    public final j1r0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof her0)) {
            return false;
        }
        her0 her0Var = (her0) obj;
        return this.f12936a.equals(her0Var.f12936a) && this.b.equals(her0Var.b) && Intrinsics.d(this.c, her0Var.c) && Intrinsics.d(this.d, her0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(brm0.h(this.b, this.f12936a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbS = brm0.s("TopSportChampsLiveState(contentType=", this.f12936a, ", contentStatus=", this.b, ", list=");
        sbS.append(this.c);
        sbS.append(", champIds=");
        sbS.append(this.d);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
