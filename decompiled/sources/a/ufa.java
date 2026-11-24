package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ufa implements zfa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35568a;
    public final wga b;
    public final rga c;
    public final nem d;

    public ufa(long j, wga wgaVar, rga rgaVar, nem nemVar) {
        this.f35568a = j;
        this.b = wgaVar;
        this.c = rgaVar;
        this.d = nemVar;
    }

    @Override // a.zfa
    public final long a() {
        return this.f35568a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufa)) {
            return false;
        }
        ufa ufaVar = (ufa) obj;
        return this.f35568a == ufaVar.f35568a && this.b.equals(ufaVar.b) && this.c.equals(ufaVar.c) && this.d.equals(ufaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f35568a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LargeCardLargeSportIcon(gameId=" + this.f35568a + ", topBlock=" + this.b + ", middleBlock=" + this.c + ", bottomBlock=" + this.d + Separators.RPAREN;
    }
}
