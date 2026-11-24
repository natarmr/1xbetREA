package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class tba implements uba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1i f33653a;
    public final zba b;
    public final mem c;

    public tba(z1i z1iVar, zba zbaVar, mem memVar) {
        this.f33653a = z1iVar;
        this.b = zbaVar;
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
        if (!(obj instanceof tba)) {
            return false;
        }
        tba tbaVar = (tba) obj;
        return this.f33653a.equals(tbaVar.f33653a) && this.b.equals(tbaVar.b) && this.c.equals(tbaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.f33653a.hashCode() + (Long.hashCode(0L) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SmallCardNoTeamLogo(gameId=0, topBlock=" + ("SmallCardNoTeamLogo(model=" + this.f33653a + Separators.RPAREN) + ", middleBlock=" + this.b + ", bottomBlock=" + this.c + Separators.RPAREN;
    }
}
