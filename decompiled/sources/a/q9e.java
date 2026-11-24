package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class q9e implements s9e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28342a;
    public final long b;

    public q9e(int i, long j) {
        this.f28342a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9e)) {
            return false;
        }
        q9e q9eVar = (q9e) obj;
        return this.f28342a == q9eVar.f28342a && this.b == q9eVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.f28342a) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f28342a, this.b, "ProgressTime(progress=", ", timeProgress=");
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
