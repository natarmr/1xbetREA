package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class bsr implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final esr f3145a;
    public final long b;
    public final double c;

    public bsr(esr esrVar, long j, double d) {
        this.f3145a = esrVar;
        this.b = j;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsr)) {
            return false;
        }
        bsr bsrVar = (bsr) obj;
        return this.f3145a == bsrVar.f3145a && this.b == bsrVar.b && Double.compare(this.c, bsrVar.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + rw2.b(this.f3145a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusIdentifierDetails(bonusType=");
        sb.append(this.f3145a);
        sb.append(", gameTypeId=");
        sb.append(this.b);
        return brm0.m(sb, this.c, ", freeBetSum=", Separators.RPAREN);
    }
}
