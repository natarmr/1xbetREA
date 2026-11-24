package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class otd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25824a;
    public final ktd0 b;

    static {
        ktd0 ktd0Var = ktd0.k;
    }

    public otd0(long j, ktd0 ktd0Var) {
        ktd0Var.getClass();
        this.f25824a = j;
        this.b = ktd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otd0)) {
            return false;
        }
        otd0 otd0Var = (otd0) obj;
        return this.f25824a == otd0Var.f25824a && Intrinsics.d(this.b, otd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f25824a) * 31);
    }

    public final String toString() {
        return "RacesStatisticModel(sportId=" + this.f25824a + ", info=" + this.b + Separators.RPAREN;
    }
}
