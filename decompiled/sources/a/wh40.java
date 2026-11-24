package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wh40 implements xh40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39149a;
    public final String b;
    public final int c;

    public wh40(String str, int i, long j) {
        this.f39149a = j;
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
        if (!(obj instanceof wh40)) {
            return false;
        }
        wh40 wh40Var = (wh40) obj;
        return this.f39149a == wh40Var.f39149a && this.b.equals(wh40Var.b) && this.c == wh40Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(Long.hashCode(this.f39149a) * 31, 31, this.b);
    }

    public final String toString() {
        return vqd.p(axq.o(this.f39149a, "Pick(heroId=", ", heroImage=", this.b), ", teamNumber=", this.c, Separators.RPAREN);
    }
}
