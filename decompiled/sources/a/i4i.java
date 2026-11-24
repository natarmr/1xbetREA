package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class i4i implements m4i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14147a;
    public final c4i b;
    public final b4i c;
    public final u3i d;
    public final u3i e;
    public final u3i f;
    public final u3i g;

    public i4i(boolean z, c4i c4iVar, b4i b4iVar, u3i u3iVar, u3i u3iVar2, u3i u3iVar3, u3i u3iVar4, int i) {
        if ((i & 4) != 0) {
            b4iVar = new b4i((String) null, 3);
        }
        u3iVar = (i & 8) != 0 ? w3i.f38503a : u3iVar;
        u3iVar2 = (i & 16) != 0 ? a4i.f224a : u3iVar2;
        u3iVar4 = (i & 64) != 0 ? t3i.f33268a : u3iVar4;
        u3iVar4.getClass();
        this.f14147a = z;
        this.b = c4iVar;
        this.c = b4iVar;
        this.d = u3iVar;
        this.e = u3iVar2;
        this.f = u3iVar3;
        this.g = u3iVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4i)) {
            return false;
        }
        i4i i4iVar = (i4i) obj;
        return this.f14147a == i4iVar.f14147a && this.b.equals(i4iVar.b) && this.c.equals(i4iVar.c) && this.d.equals(i4iVar.d) && this.e.equals(i4iVar.e) && this.f.equals(i4iVar.f) && this.g.equals(i4iVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + vqd.c(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.f14147a) * 31)) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "Default(liveTag=" + this.f14147a + ", labelModel=" + this.b + ", infoLabelModel=" + this.c + ", broadcastButton=" + this.d + ", notificationButton=" + this.e + ", favoriteButton=" + this.f + ", accordionButton=" + this.g + Separators.RPAREN;
    }
}
