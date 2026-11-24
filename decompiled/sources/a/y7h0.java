package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y7h0 implements z7h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f42151a;
    public final String b;

    public y7h0(Integer num, String str) {
        this.f42151a = num;
        this.b = str;
    }

    @Override // a.z7h0
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7h0)) {
            return false;
        }
        y7h0 y7h0Var = (y7h0) obj;
        return Intrinsics.d(this.f42151a, y7h0Var.f42151a) && Intrinsics.d(this.b, y7h0Var.b);
    }

    public final int hashCode() {
        Integer num = this.f42151a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.f(this.f42151a, "PitchSelects(lineUpType=", ", playerId=", this.b, Separators.RPAREN);
    }
}
