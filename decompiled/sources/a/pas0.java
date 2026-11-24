package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pas0 implements ras0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26670a;
    public final String b;

    public pas0(long j, String str) {
        this.f26670a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pas0)) {
            return false;
        }
        pas0 pas0Var = (pas0) obj;
        return this.f26670a == pas0Var.f26670a && this.b.equals(pas0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f26670a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f26670a, "ShowBottomSheet(tournamentId=", ", tournamentName=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
