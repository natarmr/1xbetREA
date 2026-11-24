package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xrw {
    public static final ek5 g = new ek5(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41390a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public xrw(String str, String str2, String str3, String str4, String str5, long j) {
        this.f41390a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrw)) {
            return false;
        }
        xrw xrwVar = (xrw) obj;
        return this.f41390a.equals(xrwVar.f41390a) && this.b.equals(xrwVar.b) && this.c.equals(xrwVar.c) && this.d.equals(xrwVar.d) && this.e.equals(xrwVar.e) && znq0.e(this.f, xrwVar.f);
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + ua80.b(ua80.b(ua80.b(ua80.b(this.f41390a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        String strH = znq0.h(this.f);
        StringBuilder sbN = b1j.n("HostVsGuestUiItem(oneTeamName=", this.f41390a, ", oneTeamImageUrl=", this.b, ", twoTeamName=");
        f140.v(sbN, this.c, ", twoTeamImageUrl=", this.d, ", score=");
        return ua80.m(sbN, this.e, ", startMatchDate=", strH, Separators.RPAREN);
    }
}
