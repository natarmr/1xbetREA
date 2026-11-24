package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class yji0 implements aki0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42742a;
    public final long b;

    public yji0(int i, long j) {
        this.f42742a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yji0)) {
            return false;
        }
        yji0 yji0Var = (yji0) obj;
        return this.f42742a == yji0Var.f42742a && this.b == yji0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.f42742a) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f42742a, this.b, "Session(unreadMessageCount=", ", updTimeMs=");
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
