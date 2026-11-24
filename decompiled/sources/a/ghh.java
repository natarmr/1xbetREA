package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ghh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11298a;
    public final long b;
    public final boolean c;
    public final String d;
    public final String e;
    public final int f;

    public ghh(int i, long j, long j2, String str, String str2, boolean z) {
        this.f11298a = j;
        this.b = j2;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghh)) {
            return false;
        }
        ghh ghhVar = (ghh) obj;
        return this.f11298a == ghhVar.f11298a && this.b == ghhVar.b && this.c == ghhVar.c && this.d.equals(ghhVar.d) && this.e.equals(ghhVar.e) && this.f == ghhVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ua80.b(ua80.b(brm0.e(rw2.b(Long.hashCode(this.f11298a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f11298a, "CyberTeamModel(id=", ", feedId=");
        hne.t(this.b, ", partner=", sbQ, this.c);
        f140.v(sbQ, ", teamIconUrl=", this.d, ", teamName=", this.e);
        return vqd.p(sbQ, ", winner=", this.f, Separators.RPAREN);
    }
}
