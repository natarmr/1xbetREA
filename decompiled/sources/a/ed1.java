package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ed1 implements ud1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7594a;
    public final long b;

    public ed1(int i, long j) {
        this.f7594a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed1)) {
            return false;
        }
        ed1 ed1Var = (ed1) obj;
        return this.f7594a == ed1Var.f7594a && this.b == ed1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.f7594a) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f7594a, this.b, "OnDailyTasksGamesClick(progress=", ", productId=");
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
