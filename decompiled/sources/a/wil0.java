package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class wil0 implements bjl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39220a;
    public final m4n b;
    public final cjl0 c;
    public final ynm d;

    public wil0(long j, m4n m4nVar, cjl0 cjl0Var, ynm ynmVar) {
        this.f39220a = j;
        this.b = m4nVar;
        this.c = cjl0Var;
        this.d = ynmVar;
    }

    @Override // a.bjl0
    public final long a() {
        return this.f39220a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wil0)) {
            return false;
        }
        wil0 wil0Var = (wil0) obj;
        return this.f39220a == wil0Var.f39220a && this.b.equals(wil0Var.b) && this.c.equals(wil0Var.c) && this.d.equals(wil0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f39220a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LargeCardLargeSportIcon(gameId=" + this.f39220a + ", topBlock=" + this.b + ", middleBlock=" + this.c + ", bottomBlock=" + this.d + Separators.RPAREN;
    }
}
