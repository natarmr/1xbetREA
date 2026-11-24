package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class rba implements uba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2i f30174a;
    public final xba b;
    public final mem c;

    public rba(a2i a2iVar, xba xbaVar, mem memVar) {
        this.f30174a = a2iVar;
        this.b = xbaVar;
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
        if (!(obj instanceof rba)) {
            return false;
        }
        rba rbaVar = (rba) obj;
        return this.f30174a.equals(rbaVar.f30174a) && this.b.equals(rbaVar.b) && this.c.equals(rbaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.f30174a.hashCode() + (Long.hashCode(0L) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LargeCardWatermark(gameId=0, topBlock=" + ("LargeCardWatermark(model=" + this.f30174a + Separators.RPAREN) + ", middleBlock=" + this.b + ", bottomBlock=" + this.c + Separators.RPAREN;
    }
}
