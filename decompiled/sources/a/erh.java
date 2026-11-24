package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class erh implements grh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8280a;
    public final zqh b;
    public final wqh c;
    public final mem d;

    public erh(long j, zqh zqhVar, wqh wqhVar, mem memVar) {
        this.f8280a = j;
        this.b = zqhVar;
        this.c = wqhVar;
        this.d = memVar;
    }

    @Override // a.grh
    public final long a() {
        return this.f8280a;
    }

    @Override // a.grh
    public final wqh b() {
        return this.c;
    }

    @Override // a.grh
    public final nem c() {
        return this.d;
    }

    @Override // a.grh
    public final zqh d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erh)) {
            return false;
        }
        erh erhVar = (erh) obj;
        return this.f8280a == erhVar.f8280a && this.b.equals(erhVar.b) && this.c.equals(erhVar.c) && this.d.equals(erhVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f8280a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Line(gameId=" + this.f8280a + ", topBlock=" + this.b + ", middleBlock=" + this.c + ", bottomBlock=" + this.d + Separators.RPAREN;
    }
}
