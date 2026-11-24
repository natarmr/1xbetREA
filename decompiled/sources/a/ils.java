package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mls f14994a;
    public final long b;
    public final boolean c;
    public final int d;
    public final String e;
    public final String f;
    public final int g;
    public final String h;
    public final String i;

    public ils(mls mlsVar, long j, boolean z, int i, String str, String str2, int i2, String str3, String str4) {
        this.f14994a = mlsVar;
        this.b = j;
        this.c = z;
        this.d = i;
        this.e = str;
        this.f = str2;
        this.g = i2;
        this.h = str3;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ils)) {
            return false;
        }
        ils ilsVar = (ils) obj;
        return this.f14994a == ilsVar.f14994a && this.b == ilsVar.b && this.c == ilsVar.c && this.d == ilsVar.d && this.e.equals(ilsVar.e) && this.f.equals(ilsVar.f) && this.g == ilsVar.g && this.h.equals(ilsVar.h) && this.i.equals(ilsVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ua80.b(twn.a(this.g, ua80.b(ua80.b(twn.a(this.d, brm0.e(rw2.b(this.f14994a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameLogModel(type=");
        sb.append(this.f14994a);
        sb.append(", time=");
        sb.append(this.b);
        cs0.v(this.d, ", radiant=", ", heroId=", sb, this.c);
        f140.v(sb, ", heroName=", this.e, ", heroImage=", this.f);
        w6x.w(this.g, ", targetId=", ", targetName=", this.h, sb);
        return rw2.o(sb, ", targetIcon=", this.i, Separators.RPAREN);
    }
}
