package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vh40 implements xh40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37413a;
    public final String b;
    public final int c;

    public vh40(String str, int i, long j) {
        this.f37413a = j;
        this.b = str;
        this.c = i;
    }

    @Override // a.xh40
    public final int a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh40)) {
            return false;
        }
        vh40 vh40Var = (vh40) obj;
        return this.f37413a == vh40Var.f37413a && this.b.equals(vh40Var.b) && this.c == vh40Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(Long.hashCode(this.f37413a) * 31, 31, this.b);
    }

    public final String toString() {
        return vqd.p(axq.o(this.f37413a, "Ban(heroId=", ", heroImage=", this.b), ", teamNumber=", this.c, Separators.RPAREN);
    }
}
