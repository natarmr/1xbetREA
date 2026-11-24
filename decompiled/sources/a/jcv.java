package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class jcv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16297a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;

    public jcv(long j, long j2, String str, String str2, String str3, String str4, String str5) {
        this.f16297a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = j2;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcv)) {
            return false;
        }
        jcv jcvVar = (jcv) obj;
        return this.f16297a.equals(jcvVar.f16297a) && this.b.equals(jcvVar.b) && this.c.equals(jcvVar.c) && this.d.equals(jcvVar.d) && this.e == jcvVar.e && this.f == jcvVar.f && this.g.equals(jcvVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + rw2.b(rw2.b(ua80.b(ua80.b(ua80.b(this.f16297a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("GrandPrixStageModel(id=", this.f16297a, ", title=", this.b, ", city=");
        f140.v(sbN, this.c, ", logo=", this.d, ", dateStart=");
        sbN.append(this.e);
        kng0.A(sbN, ", dateEnd=", this.f, ", season=");
        return axq.n(sbN, this.g, Separators.RPAREN);
    }
}
