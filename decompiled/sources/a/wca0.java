package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wca0 implements xca0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38916a;
    public final String b;

    public wca0(long j, String str) {
        this.f38916a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wca0)) {
            return false;
        }
        wca0 wca0Var = (wca0) obj;
        return this.f38916a == wca0Var.f38916a && this.b.equals(wca0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f38916a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f38916a, "OnTeamClick(teamId=", ", teamName=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
