package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ge30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11132a;
    public final tho b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final String h;
    public final int i;
    public final int j;
    public final String k;
    public final String l;

    public ge30(String str, tho thoVar, String str2, String str3, String str4, int i, String str5, String str6, int i2, int i3, String str7, String str8) {
        this.f11132a = str;
        this.b = thoVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = str5;
        this.h = str6;
        this.i = i2;
        this.j = i3;
        this.k = str7;
        this.l = str8;
    }

    public final boolean a() {
        return (this.h.length() > 0 && this.g.length() > 0) || this.l.length() > 0;
    }

    public final boolean b() {
        tho thoVar = tho.FOOTBALL_REPLACE;
        tho thoVar2 = this.b;
        return thoVar2 == thoVar || thoVar2 == tho.HOCKEY_CHANGE || thoVar2 == tho.RUGBY_SUBSTITUTION_IN || thoVar2 == tho.KABADDI_SUBSTITUTION || thoVar2 == tho.REPLACE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge30)) {
            return false;
        }
        ge30 ge30Var = (ge30) obj;
        return this.f11132a.equals(ge30Var.f11132a) && this.b == ge30Var.b && this.c.equals(ge30Var.c) && this.d.equals(ge30Var.d) && this.e.equals(ge30Var.e) && this.f == ge30Var.f && this.g.equals(ge30Var.g) && this.h.equals(ge30Var.h) && this.i == ge30Var.i && this.j == ge30Var.j && this.k.equals(ge30Var.k) && this.l.equals(ge30Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + ua80.b(twn.a(this.j, twn.a(this.i, ua80.b(ua80.b(twn.a(this.f, ua80.b(ua80.b(ua80.b((this.b.hashCode() + (this.f11132a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h), 31), 31), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventModel(minute=");
        sb.append(this.f11132a);
        sb.append(", eventType=");
        sb.append(this.b);
        sb.append(", playerName=");
        f140.v(sb, this.c, ", playerId=", this.d, ", actionImageUrl=");
        twn.w(this.f, this.e, ", playerXbetId=", ", assistantName=", sb);
        f140.v(sb, this.g, ", assistantId=", this.h, ", assistantXbetId=");
        axq.r(this.i, this.j, ", teamIndex=", ", playerImageUrl=", sb);
        return ua80.m(sb, this.k, ", assistantImageUrl=", this.l, Separators.RPAREN);
    }
}
