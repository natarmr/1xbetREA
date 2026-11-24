package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fol0 implements kol0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4i f9887a;
    public final u3i b;
    public final u3i c;
    public final u3i d;

    public fol0(c4i c4iVar, u3i u3iVar, u3i u3iVar2, u3i u3iVar3) {
        this.f9887a = c4iVar;
        this.b = u3iVar;
        this.c = u3iVar2;
        this.d = u3iVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fol0)) {
            return false;
        }
        fol0 fol0Var = (fol0) obj;
        return this.f9887a.equals(fol0Var.f9887a) && this.b.equals(fol0Var.b) && this.c.equals(fol0Var.c) && this.d.equals(fol0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + vqd.c(this.c, (this.b.hashCode() + (this.f9887a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "LargeCardLargeSportIcon(labelModel=" + this.f9887a + ", favoriteButton=" + this.b + ", notificationButton=" + this.c + ", broadcastButton=" + this.d + Separators.RPAREN;
    }
}
