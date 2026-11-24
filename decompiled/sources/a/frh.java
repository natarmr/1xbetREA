package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class frh implements grh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10018a;
    public final zqh b;
    public final wqh c;
    public final mem d;

    public frh(long j, zqh zqhVar, wqh wqhVar, mem memVar) {
        this.f10018a = j;
        this.b = zqhVar;
        this.c = wqhVar;
        this.d = memVar;
    }

    @Override // a.grh
    public final long a() {
        return this.f10018a;
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
        if (!(obj instanceof frh)) {
            return false;
        }
        frh frhVar = (frh) obj;
        return this.f10018a == frhVar.f10018a && this.b.equals(frhVar.b) && this.c.equals(frhVar.c) && this.d.equals(frhVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f10018a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Live(gameId=" + this.f10018a + ", topBlock=" + this.b + ", middleBlock=" + this.c + ", bottomBlock=" + this.d + Separators.RPAREN;
    }
}
