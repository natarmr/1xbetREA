package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class wfa implements zfa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39061a;
    public final yga b;
    public final tga c;
    public final nem d;

    public wfa(long j, yga ygaVar, tga tgaVar, nem nemVar) {
        this.f39061a = j;
        this.b = ygaVar;
        this.c = tgaVar;
        this.d = nemVar;
    }

    @Override // a.zfa
    public final long a() {
        return this.f39061a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfa)) {
            return false;
        }
        wfa wfaVar = (wfa) obj;
        return this.f39061a == wfaVar.f39061a && this.b.equals(wfaVar.b) && this.c.equals(wfaVar.c) && this.d.equals(wfaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f39061a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LargeCardWatermark(gameId=" + this.f39061a + ", topBlock=" + this.b + ", middleBlock=" + this.c + ", bottomBlock=" + this.d + Separators.RPAREN;
    }
}
