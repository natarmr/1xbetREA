package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class df90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5989a;
    public final tf90 b;

    public df90(int i, tf90 tf90Var) {
        tf90Var.getClass();
        this.f5989a = i;
        this.b = tf90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df90)) {
            return false;
        }
        df90 df90Var = (df90) obj;
        return this.f5989a == df90Var.f5989a && Intrinsics.d(this.b, df90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f5989a) * 31);
    }

    public final String toString() {
        return "PeriodScoreZip(periodKey=" + this.f5989a + ", periodValue=" + this.b + Separators.RPAREN;
    }
}
