package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class e8g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7370a;
    public final ufp0 b;
    public final ufp0 c;
    public final long d;
    public final lho e;
    public final String f;
    public final String g;
    public final n8g0 h;
    public final long i;

    public e8g0(String str, ufp0 ufp0Var, ufp0 ufp0Var2, long j, lho lhoVar, String str2, String str3, n8g0 n8g0Var, long j2) {
        this.f7370a = str;
        this.b = ufp0Var;
        this.c = ufp0Var2;
        this.d = j;
        this.e = lhoVar;
        this.f = str2;
        this.g = str3;
        this.h = n8g0Var;
        this.i = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8g0)) {
            return false;
        }
        e8g0 e8g0Var = (e8g0) obj;
        return this.f7370a.equals(e8g0Var.f7370a) && this.b.equals(e8g0Var.b) && this.c.equals(e8g0Var.c) && this.d == e8g0Var.d && this.e == e8g0Var.e && this.f.equals(e8g0Var.f) && this.g.equals(e8g0Var.g) && this.h == e8g0Var.h && this.i == e8g0Var.i;
    }

    public final int hashCode() {
        return Long.hashCode(this.i) + ((this.h.hashCode() + ua80.b(ua80.b((this.e.hashCode() + rw2.b(twn.f(this.c, twn.f(this.b, this.f7370a.hashCode() * 31, 31), 31), 31, this.d)) * 31, 31, this.f), 31, this.g)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultsGridValueModel(gameId=");
        sb.append(this.f7370a);
        sb.append(", teamModelOne=");
        sb.append(this.b);
        sb.append(", teamModelTwo=");
        sb.append(this.c);
        sb.append(", feedGameId=");
        sb.append(this.d);
        sb.append(", status=");
        sb.append(this.e);
        sb.append(", score1=");
        sb.append(this.f);
        sb.append(", score2=");
        sb.append(this.g);
        sb.append(", winner=");
        sb.append(this.h);
        return rw2.n(sb, this.i, ", dateStart=", Separators.RPAREN);
    }
}
