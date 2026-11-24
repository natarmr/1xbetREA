package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class v5l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36830a;
    public final int b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;

    public v5l(String str, int i, String str2, String str3, long j, String str4, String str5) {
        this.f36830a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5l)) {
            return false;
        }
        v5l v5lVar = (v5l) obj;
        return this.f36830a.equals(v5lVar.f36830a) && this.b == v5lVar.b && this.c.equals(v5lVar.c) && this.d.equals(v5lVar.d) && this.e == v5lVar.e && this.f.equals(v5lVar.f) && this.g.equals(v5lVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(rw2.b(ua80.b(ua80.b(twn.a(this.b, this.f36830a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "DotaPlayersLeaderBoardModel(region=", this.f36830a, ", rank=", ", name=");
        f140.v(sbP, this.c, ", image=", this.d, ", teamFeedId=");
        kng0.z(sbP, this.e, ", teamName=", this.f);
        return rw2.o(sbP, ", teamImage=", this.g, Separators.RPAREN);
    }
}
