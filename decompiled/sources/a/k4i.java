package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class k4i implements m4i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4i f17670a;
    public final b4i b;
    public final u3i c;
    public final u3i d;
    public final u3i e;
    public final u3i f;

    public k4i(c4i c4iVar, b4i b4iVar, u3i u3iVar, u3i u3iVar2, u3i u3iVar3, u3i u3iVar4, int i) {
        b4iVar = (i & 4) != 0 ? new b4i((String) null, 3) : b4iVar;
        u3iVar = (i & 8) != 0 ? w3i.f38503a : u3iVar;
        u3iVar2 = (i & 16) != 0 ? a4i.f224a : u3iVar2;
        u3iVar4 = (i & 64) != 0 ? t3i.f33268a : u3iVar4;
        u3iVar4.getClass();
        this.f17670a = c4iVar;
        this.b = b4iVar;
        this.c = u3iVar;
        this.d = u3iVar2;
        this.e = u3iVar3;
        this.f = u3iVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4i)) {
            return false;
        }
        k4i k4iVar = (k4i) obj;
        return this.f17670a.equals(k4iVar.f17670a) && this.b.equals(k4iVar.b) && this.c.equals(k4iVar.c) && this.d.equals(k4iVar.d) && this.e.equals(k4iVar.e) && this.f.equals(k4iVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + vqd.c(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f17670a.hashCode() * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "V2(liveTag=, labelModel=" + this.f17670a + ", infoLabelModel=" + this.b + ", broadcastButton=" + this.c + ", notificationButton=" + this.d + ", favoriteButton=" + this.e + ", accordionButton=" + this.f + Separators.RPAREN;
    }
}
