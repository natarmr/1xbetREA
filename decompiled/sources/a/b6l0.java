package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b6l0 implements d6l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2061a;
    public final qzl b;
    public final String c;
    public final d280 d;
    public final d280 e;
    public final String f;
    public final String g;

    public b6l0(long j, qzl qzlVar, String str, d280 d280Var, d280 d280Var2, String str2, String str3) {
        str3.getClass();
        this.f2061a = j;
        this.b = qzlVar;
        this.c = str;
        this.d = d280Var;
        this.e = d280Var2;
        this.f = str2;
        this.g = str3;
    }

    @Override // a.d6l0
    public final long a() {
        return this.f2061a;
    }

    @Override // a.d6l0
    public final qzl c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6l0)) {
            return false;
        }
        b6l0 b6l0Var = (b6l0) obj;
        return this.f2061a == b6l0Var.f2061a && this.b.equals(b6l0Var.b) && this.c.equals(b6l0Var.c) && this.d.equals(b6l0Var.d) && this.e.equals(b6l0Var.e) && this.f.equals(b6l0Var.f) && Intrinsics.d(this.g, b6l0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(twn.e(this.e, twn.e(this.d, ua80.b((this.b.hashCode() + (Long.hashCode(this.f2061a) * 31)) * 31, 31, this.c), 31), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoOpponents(gameId=");
        sb.append(this.f2061a);
        sb.append(", bottomBlock=");
        sb.append(this.b);
        sb.append(", teamOneName=");
        sb.append(this.c);
        sb.append(", teamOneLogo=");
        sb.append(this.d);
        sb.append(", teamTwoLogo=");
        sb.append(this.e);
        sb.append(", teamTwoName=");
        sb.append(this.f);
        return rw2.o(sb, ", infoLabel=", this.g, Separators.RPAREN);
    }
}
