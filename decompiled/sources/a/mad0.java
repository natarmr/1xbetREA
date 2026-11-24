package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class mad0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21453a;
    public final long b;

    public mad0(String str, long j) {
        this.f21453a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mad0)) {
            return false;
        }
        mad0 mad0Var = (mad0) obj;
        return this.f21453a.equals(mad0Var.f21453a) && this.b == mad0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f21453a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "CyberPartnerTeam(teamName=", this.f21453a, ", feedId=");
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
