package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jhz implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16550a;
    public final long b;
    public final String c;
    public final boolean d;
    public final q8m e;

    public jhz(String str, long j, String str2, boolean z, q8m q8mVar) {
        this.f16550a = str;
        this.b = j;
        this.c = str2;
        this.d = z;
        this.e = q8mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhz)) {
            return false;
        }
        jhz jhzVar = (jhz) obj;
        return this.f16550a.equals(jhzVar.f16550a) && this.b == jhzVar.b && this.c.equals(jhzVar.c) && this.d == jhzVar.d && this.e.equals(jhzVar.e);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f16550a;
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(ua80.b(rw2.b(this.f16550a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "LeaderboardTeamUiModel(key=", this.f16550a, ", teamId=");
        w6x.z(", teamName=", this.c, ", hasStatistic=", sbO, this.d);
        sbO.append(", model=");
        sbO.append(this.e);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
