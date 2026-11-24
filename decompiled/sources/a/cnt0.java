package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class cnt0 {
    public static final bnt0 Companion = new bnt0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4673a;
    public final long b;
    public final int c;

    public /* synthetic */ cnt0(int i, int i2, long j, long j2) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, ant0.f1171a.getDescriptor());
            throw null;
        }
        this.f4673a = j;
        this.b = j2;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnt0)) {
            return false;
        }
        cnt0 cnt0Var = (cnt0) obj;
        return this.f4673a == cnt0Var.f4673a && this.b == cnt0Var.b && this.c == cnt0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + rw2.b(Long.hashCode(this.f4673a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f4673a, "UpdateTaskRequest(accountId=", ", taskId=");
        ua80.v(sbQ, this.b, ", status=", this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    public cnt0(int i, long j, long j2) {
        this.f4673a = j;
        this.b = j2;
        this.c = i;
    }
}
