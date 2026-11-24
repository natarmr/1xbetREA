package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yzd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43510a;
    public final boolean b;
    public final List c;

    public yzd0(int i, List list, boolean z) {
        list.getClass();
        this.f43510a = i;
        this.b = z;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzd0)) {
            return false;
        }
        yzd0 yzd0Var = (yzd0) obj;
        return this.f43510a == yzd0Var.f43510a && this.b == yzd0Var.b && Intrinsics.d(this.c, yzd0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Integer.hashCode(this.f43510a) * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(h97.l(this.f43510a, "RainbowStatisticMatchesMatchTeamModel(score=", ", isWinner=", ", players=", this.b), this.c, Separators.RPAREN);
    }
}
