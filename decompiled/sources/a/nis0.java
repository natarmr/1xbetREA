package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nis0 implements pis0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23605a;
    public final String b;

    public nis0(long j, String str) {
        this.f23605a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nis0)) {
            return false;
        }
        nis0 nis0Var = (nis0) obj;
        return this.f23605a == nis0Var.f23605a && this.b.equals(nis0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f23605a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f23605a, "OnTeamClick(teamId=", ", teamName=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
