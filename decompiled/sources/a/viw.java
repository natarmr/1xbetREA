package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class viw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f37502a;
    public final Object b;
    public final ypl0 c;
    public final j0g0 d;

    public viw(Object obj, Object obj2, ypl0 ypl0Var, j0g0 j0g0Var) {
        ypl0Var.getClass();
        this.f37502a = obj;
        this.b = obj2;
        this.c = ypl0Var;
        this.d = j0g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof viw)) {
            return false;
        }
        viw viwVar = (viw) obj;
        Object obj2 = viwVar.f37502a;
        e0g0 e0g0Var = j0g0.b;
        return Intrinsics.d(this.f37502a, obj2) && Intrinsics.d(this.b, viwVar.b) && Intrinsics.d(this.c, viwVar.c) && this.d.equals(viwVar.d);
    }

    public final int hashCode() {
        return j0g0.b(this.d.f15681a) + ((this.c.hashCode() + twn.c(j0g0.b(this.f37502a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("HomeScenarioModel(liveGamesResult=", j0g0.d(this.f37502a), ", lineGamesResult=", j0g0.d(this.b), ", sportSimpleModel=");
        sbN.append(this.c);
        sbN.append(", topGame=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
