package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class umt0 implements vmt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35934a;
    public final int b;

    public umt0(long j, int i) {
        this.f35934a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umt0)) {
            return false;
        }
        umt0 umt0Var = (umt0) obj;
        return this.f35934a == umt0Var.f35934a && this.b == umt0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.f35934a) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f35934a, "UpdateRequired(taskId=", ", taskStatus=");
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
