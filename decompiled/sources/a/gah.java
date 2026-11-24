package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class gah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10964a;
    public final long b;
    public final int c;
    public final String d;
    public final int e;

    public gah(int i, int i2, long j, String str, boolean z) {
        this.f10964a = z;
        this.b = j;
        this.c = i;
        this.d = str;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gah)) {
            return false;
        }
        gah gahVar = (gah) obj;
        return this.f10964a == gahVar.f10964a && this.b == gahVar.b && this.c == gahVar.c && this.d.equals(gahVar.d) && this.e == gahVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ua80.b(twn.a(this.c, rw2.b(Boolean.hashCode(this.f10964a) * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberPicksModel(banned=");
        sb.append(this.f10964a);
        sb.append(", heroId=");
        sb.append(this.b);
        w6x.w(this.c, ", teamPartType=", ", heroImage=", this.d, sb);
        return vqd.p(sb, ", order=", this.e, Separators.RPAREN);
    }
}
