package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ofa implements tfa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25155a;
    public final mga b;
    public final hga c;
    public final nem d;

    public ofa(long j, mga mgaVar, hga hgaVar, nem nemVar) {
        this.f25155a = j;
        this.b = mgaVar;
        this.c = hgaVar;
        this.d = nemVar;
    }

    @Override // a.tfa
    public final long a() {
        return this.f25155a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofa)) {
            return false;
        }
        ofa ofaVar = (ofa) obj;
        return this.f25155a == ofaVar.f25155a && this.b.equals(ofaVar.b) && this.c.equals(ofaVar.c) && this.d.equals(ofaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f25155a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LargeCardLargeSportIcon(gameId=" + this.f25155a + ", topBlock=" + this.b + ", middleBlock=" + this.c + ", bottomBlock=" + this.d + Separators.RPAREN;
    }
}
