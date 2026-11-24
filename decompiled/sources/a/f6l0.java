package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class f6l0 implements k6l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9018a;
    public final qzl b;
    public final String c;
    public final j83 d;
    public final String e;
    public final j83 f;
    public final String g;

    public f6l0(long j, qzl qzlVar, String str, j83 j83Var, String str2, j83 j83Var2, String str3) {
        this.f9018a = j;
        this.b = qzlVar;
        this.c = str;
        this.d = j83Var;
        this.e = str2;
        this.f = j83Var2;
        this.g = str3;
    }

    @Override // a.k6l0
    public final long a() {
        return this.f9018a;
    }

    @Override // a.k6l0
    public final qzl c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6l0)) {
            return false;
        }
        f6l0 f6l0Var = (f6l0) obj;
        return this.f9018a == f6l0Var.f9018a && this.b.equals(f6l0Var.b) && this.c.equals(f6l0Var.c) && this.d.equals(f6l0Var.d) && this.e.equals(f6l0Var.e) && this.f.equals(f6l0Var.f) && this.g.equals(f6l0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + brm0.f(this.f, ua80.b(brm0.f(this.d, ua80.b((this.b.hashCode() + (Long.hashCode(this.f9018a) * 31)) * 31, 31, this.c), 31), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiTeams(gameId=");
        sb.append(this.f9018a);
        sb.append(", bottomBlock=");
        sb.append(this.b);
        sb.append(", teamOneName=");
        sb.append(this.c);
        sb.append(", teamOneScore=");
        sb.append((Object) this.d);
        sb.append(", teamTwoName=");
        sb.append(this.e);
        sb.append(", teamTwoScore=");
        sb.append((Object) this.f);
        return rw2.o(sb, ", infoLabel=", this.g, Separators.RPAREN);
    }
}
