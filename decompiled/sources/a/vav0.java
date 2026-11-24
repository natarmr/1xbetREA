package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vav0 implements wav0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37110a;
    public final Integer b;

    public vav0(int i, Integer num) {
        this.f37110a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vav0)) {
            return false;
        }
        vav0 vav0Var = (vav0) obj;
        return this.f37110a == vav0Var.f37110a && Intrinsics.d(this.b, vav0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f37110a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "OnMarketLongClick(opponentId=" + this.f37110a + ", gameId=" + this.b + Separators.RPAREN;
    }
}
