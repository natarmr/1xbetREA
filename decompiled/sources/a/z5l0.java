package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class z5l0 implements d6l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43823a;
    public final qzl b;
    public final String c;
    public final String d;
    public final String e;

    public z5l0(long j, qzl qzlVar, String str, String str2, String str3) {
        this.f43823a = j;
        this.b = qzlVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // a.d6l0
    public final long a() {
        return this.f43823a;
    }

    @Override // a.d6l0
    public final qzl c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5l0)) {
            return false;
        }
        z5l0 z5l0Var = (z5l0) obj;
        return this.f43823a == z5l0Var.f43823a && this.b.equals(z5l0Var.b) && this.c.equals(z5l0Var.c) && this.d.equals(z5l0Var.d) && this.e.equals(z5l0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b((this.b.hashCode() + (Long.hashCode(this.f43823a) * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiTeams(gameId=");
        sb.append(this.f43823a);
        sb.append(", bottomBlock=");
        sb.append(this.b);
        f140.v(sb, ", teamOneName=", this.c, ", teamTwoName=", this.d);
        return rw2.o(sb, ", infoLabel=", this.e, Separators.RPAREN);
    }
}
