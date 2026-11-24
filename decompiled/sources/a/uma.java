package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class uma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4i f35910a;
    public final b4i b;
    public final u3i c;
    public final u3i d;

    public uma(c4i c4iVar, x3i x3iVar, u3i u3iVar, int i) {
        b4i b4iVar = new b4i((String) null, 3);
        u3i u3iVar2 = (i & 4) != 0 ? y3i.f41954a : x3iVar;
        this.f35910a = c4iVar;
        this.b = b4iVar;
        this.c = u3iVar2;
        this.d = u3iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uma)) {
            return false;
        }
        uma umaVar = (uma) obj;
        return this.f35910a.equals(umaVar.f35910a) && this.b.equals(umaVar.b) && this.c.equals(umaVar.c) && this.d.equals(umaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f35910a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LargeCardLargeTeamLogo(labelModel=" + this.f35910a + ", infoLabelModel=" + this.b + ", favoriteButton=" + this.c + ", accordionButton=" + this.d + Separators.RPAREN;
    }
}
