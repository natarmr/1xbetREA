package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class j4i implements m4i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4i f15885a;
    public final b4i b;
    public final u3i c;
    public final u3i d;
    public final u3i e;
    public final u3i f;

    public j4i(c4i c4iVar, b4i b4iVar, u3i u3iVar, u3i u3iVar2, u3i u3iVar3, int i) {
        b4iVar = (i & 4) != 0 ? new b4i((String) null, 3) : b4iVar;
        u3iVar = (i & 16) != 0 ? a4i.f224a : u3iVar;
        u3iVar3 = (i & 64) != 0 ? t3i.f33268a : u3iVar3;
        u3iVar3.getClass();
        this.f15885a = c4iVar;
        this.b = b4iVar;
        this.c = w3i.f38503a;
        this.d = u3iVar;
        this.e = u3iVar2;
        this.f = u3iVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4i)) {
            return false;
        }
        j4i j4iVar = (j4i) obj;
        return this.f15885a.equals(j4iVar.f15885a) && this.b.equals(j4iVar.b) && this.c.equals(j4iVar.c) && this.d.equals(j4iVar.d) && this.e.equals(j4iVar.e) && this.f.equals(j4iVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + vqd.c(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f15885a.hashCode() * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "V1(liveTag=, labelModel=" + this.f15885a + ", infoLabelModel=" + this.b + ", broadcastButton=" + this.c + ", notificationButton=" + this.d + ", favoriteButton=" + this.e + ", accordionButton=" + this.f + Separators.RPAREN;
    }
}
