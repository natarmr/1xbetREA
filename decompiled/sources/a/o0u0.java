package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o0u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24448a;
    public final boolean b;
    public final List c;

    public o0u0(int i, List list, boolean z) {
        list.getClass();
        this.f24448a = i;
        this.b = z;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0u0)) {
            return false;
        }
        o0u0 o0u0Var = (o0u0) obj;
        return this.f24448a == o0u0Var.f24448a && this.b == o0u0Var.b && Intrinsics.d(this.c, o0u0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Integer.hashCode(this.f24448a) * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(h97.l(this.f24448a, "ValorantStatisticMatchesMatchTeamModel(score=", ", isWinner=", ", players=", this.b), this.c, Separators.RPAREN);
    }
}
