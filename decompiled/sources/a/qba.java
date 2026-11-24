package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class qba implements uba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1i f28439a;
    public final wba b;
    public final mem c;

    public qba(z1i z1iVar, wba wbaVar, mem memVar) {
        this.f28439a = z1iVar;
        this.b = wbaVar;
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
        if (!(obj instanceof qba)) {
            return false;
        }
        qba qbaVar = (qba) obj;
        return this.f28439a.equals(qbaVar.f28439a) && this.b.equals(qbaVar.b) && this.c.equals(qbaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.f28439a.hashCode() + (Long.hashCode(0L) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LargeCardLargeTeamLogo(gameId=0, topBlock=" + ("LargeCardLargeTeamLogo(model=" + this.f28439a + Separators.RPAREN) + ", middleBlock=" + this.b + ", bottomBlock=" + this.c + Separators.RPAREN;
    }
}
