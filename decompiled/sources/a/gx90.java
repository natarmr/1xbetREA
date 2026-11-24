package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class gx90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12068a;
    public final int b;
    public final int c;
    public final int d;
    public final List e;

    public gx90(long j, int i, int i2, int i3, List list) {
        list.getClass();
        this.f12068a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx90)) {
            return false;
        }
        gx90 gx90Var = (gx90) obj;
        return this.f12068a == gx90Var.f12068a && this.b == gx90Var.b && this.c == gx90Var.c && this.d == gx90Var.d && Intrinsics.d(this.e, gx90Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, twn.a(this.c, twn.a(this.b, Long.hashCode(this.f12068a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f12068a, "PlayLotteryResult(userId=", ", bonusBalance=");
        rw2.s(this.c, this.d, ", rotationCount=", ", winPoints=", sbQ);
        return ohs0.s(sbQ, ", winnings=", this.e, Separators.RPAREN);
    }
}
