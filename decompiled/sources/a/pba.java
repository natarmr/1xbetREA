package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pba implements uba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26695a;
    public final y1i b;
    public final vba c;
    public final mem d;

    public pba(long j, y1i y1iVar, vba vbaVar, mem memVar) {
        this.f26695a = j;
        this.b = y1iVar;
        this.c = vbaVar;
        this.d = memVar;
    }

    @Override // a.uba
    public final long a() {
        return this.f26695a;
    }

    @Override // a.uba
    public final nem c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pba)) {
            return false;
        }
        pba pbaVar = (pba) obj;
        return this.f26695a == pbaVar.f26695a && this.b.equals(pbaVar.b) && this.c.equals(pbaVar.c) && this.d.equals(pbaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f26695a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f26695a, "LargeCardLargeSportIcon(gameId=", ", topBlock=", "LargeCardLargeSportIcon(model=" + this.b + Separators.RPAREN);
        sbO.append(", middleBlock=");
        sbO.append(this.c);
        sbO.append(", bottomBlock=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
