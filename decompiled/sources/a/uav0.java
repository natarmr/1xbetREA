package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class uav0 implements wav0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35352a;
    public final Integer b;

    public uav0(int i, Integer num) {
        this.f35352a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uav0)) {
            return false;
        }
        uav0 uav0Var = (uav0) obj;
        return this.f35352a == uav0Var.f35352a && Intrinsics.d(this.b, uav0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f35352a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "OnMarketClick(opponentId=" + this.f35352a + ", gameId=" + this.b + Separators.RPAREN;
    }
}
