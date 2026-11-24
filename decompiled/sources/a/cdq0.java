package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cdq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f4174a;
    public final long b;
    public final long c;
    public final long d;

    /* JADX WARN: Multi-variable type inference failed */
    public cdq0(int i, long j, long j2, long j3) {
        this.f4174a = i;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdq0)) {
            return false;
        }
        cdq0 cdq0Var = (cdq0) obj;
        return this.f4174a == cdq0Var.f4174a && wen.d(this.b, cdq0Var.b) && wen.d(this.c, cdq0Var.c) && wen.d(this.d, cdq0Var.d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f4174a) * 31;
        uen uenVar = wen.b;
        return Long.hashCode(this.d) + rw2.b(rw2.b(iHashCode, 31, this.b), 31, this.c);
    }

    public final String toString() {
        String strM = wen.m(this.b);
        return ua80.m(vqd.r(this.f4174a, "ThrowTimings(shakeCycles=", ", handThrowPoseHold=", strM, ", diceRoll="), wen.m(this.c), ", throwResultHold=", wen.m(this.d), Separators.RPAREN);
    }
}
