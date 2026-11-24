package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class sba implements uba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1i f31922a;
    public final yba b;
    public final mem c;

    public sba(z1i z1iVar, yba ybaVar, mem memVar) {
        this.f31922a = z1iVar;
        this.b = ybaVar;
        this.c = memVar;
    }

    @Override // a.uba
    public final long a() {
        return 0L;
    }

    @Override // a.uba
    public final nem c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sba)) {
            return false;
        }
        sba sbaVar = (sba) obj;
        return this.f31922a.equals(sbaVar.f31922a) && this.b.equals(sbaVar.b) && this.c.equals(sbaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.f31922a.hashCode() + (Long.hashCode(0L) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MediumCardSmallTeamLogo(gameId=0, topBlock=" + ("MediumCardSmallTeamLogo(model=" + this.f31922a + Separators.RPAREN) + ", middleBlock=" + this.b + ", bottomBlock=" + this.c + Separators.RPAREN;
    }
}
