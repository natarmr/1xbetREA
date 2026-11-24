package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rhs0 implements ths0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f30505a;
    public final n0x b;
    public final String c;
    public final String d;
    public final String e;

    public rhs0(n0x n0xVar, n0x n0xVar2, String str, String str2, String str3) {
        this.f30505a = n0xVar;
        this.b = n0xVar2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhs0)) {
            return false;
        }
        rhs0 rhs0Var = (rhs0) obj;
        return this.f30505a.equals(rhs0Var.f30505a) && this.b.equals(rhs0Var.b) && this.c.equals(rhs0Var.c) && this.d.equals(rhs0Var.d) && this.e.equals(rhs0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(f140.f(this.b, this.f30505a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(playerImage=");
        sb.append(this.f30505a);
        sb.append(", playerFlag=");
        sb.append(this.b);
        sb.append(", playerNickname=");
        f140.v(sb, this.c, ", playerName=", this.d, ", playerPrizeSum=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
