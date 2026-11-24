package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class abr0 implements bbr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f593a;
    public final rpe b;
    public final int c;
    public final u6n d;
    public final String e;
    public final u6n f;
    public final String g;
    public final String h;
    public final String i;
    public final v12 j;
    public final String k;

    public abr0(String str, rpe rpeVar, int i, u6n u6nVar, String str2, u6n u6nVar2, String str3, String str4, String str5, v12 v12Var) {
        this.f593a = str;
        this.b = rpeVar;
        this.c = i;
        this.d = u6nVar;
        this.e = str2;
        this.f = u6nVar2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = v12Var;
        this.k = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abr0)) {
            return false;
        }
        abr0 abr0Var = (abr0) obj;
        return this.f593a.equals(abr0Var.f593a) && this.b.equals(abr0Var.b) && this.c == abr0Var.c && this.d.equals(abr0Var.d) && this.e.equals(abr0Var.e) && this.f.equals(abr0Var.f) && this.g.equals(abr0Var.g) && this.h.equals(abr0Var.h) && this.i.equals(abr0Var.i) && this.j == abr0Var.j;
    }

    @Override // a.hvk0
    public final Object getKey() {
        return this.k;
    }

    public final int hashCode() {
        return this.j.hashCode() + ua80.b(ua80.b(ua80.b((this.f.hashCode() + ua80.b((this.d.hashCode() + twn.a(this.c, twn.a(this.b.f30883a, this.f593a.hashCode() * 31, 31), 31)) * 31, 31, this.e)) * 31, 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopPlayerCellLUiModel(playerId=");
        sb.append(this.f593a);
        sb.append(", counterValue=");
        sb.append(this.b);
        sb.append(", playerNumber=");
        sb.append(this.c);
        sb.append(", playerLogo=");
        sb.append(this.d);
        sb.append(", playerName=");
        sb.append(this.e);
        sb.append(", teamLogo=");
        sb.append(this.f);
        sb.append(", teamName=");
        f140.v(sb, this.g, ", pointOne=", this.h, ", pointTwo=");
        sb.append(this.i);
        sb.append(", alignmentInSection=");
        sb.append(this.j);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
