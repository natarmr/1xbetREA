package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class tma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4i f34184a;
    public final b4i b;
    public final u3i c;
    public final u3i d;

    public tma(c4i c4iVar, x3i x3iVar, int i) {
        b4i b4iVar = new b4i((String) null, 3);
        u3i u3iVar = (i & 4) != 0 ? y3i.f41954a : x3iVar;
        this.f34184a = c4iVar;
        this.b = b4iVar;
        this.c = u3iVar;
        this.d = t3i.f33268a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tma)) {
            return false;
        }
        tma tmaVar = (tma) obj;
        return this.f34184a.equals(tmaVar.f34184a) && this.b.equals(tmaVar.b) && this.c.equals(tmaVar.c) && this.d.equals(tmaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f34184a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LargeCardLargeSportIcon(labelModel=" + this.f34184a + ", infoLabelModel=" + this.b + ", favoriteButton=" + this.c + ", accordionButton=" + this.d + Separators.RPAREN;
    }
}
