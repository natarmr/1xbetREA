package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i1u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14019a;
    public final String b;
    public final List c;

    public i1u0(String str, List list, int i) {
        list.getClass();
        this.f14019a = i;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1u0)) {
            return false;
        }
        i1u0 i1u0Var = (i1u0) obj;
        return this.f14019a == i1u0Var.f14019a && this.b.equals(i1u0Var.b) && Intrinsics.d(this.c, i1u0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f14019a) * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(vqd.r(this.f14019a, "ValorantStatisticModel(currentRound=", ", mapName=", this.b, ", matchInfo="), this.c, Separators.RPAREN);
    }
}
