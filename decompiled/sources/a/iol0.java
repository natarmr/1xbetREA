package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class iol0 implements kol0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4i f15123a;
    public final u3i b;
    public final u3i c;
    public final u3i d;

    public iol0(c4i c4iVar, u3i u3iVar, u3i u3iVar2, u3i u3iVar3) {
        this.f15123a = c4iVar;
        this.b = u3iVar;
        this.c = u3iVar2;
        this.d = u3iVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iol0)) {
            return false;
        }
        iol0 iol0Var = (iol0) obj;
        return this.f15123a.equals(iol0Var.f15123a) && this.b.equals(iol0Var.b) && this.c.equals(iol0Var.c) && this.d.equals(iol0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + vqd.c(this.c, (this.b.hashCode() + (this.f15123a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "MediumCardSmallTeamLogo(labelModel=" + this.f15123a + ", favoriteButton=" + this.b + ", notificationButton=" + this.c + ", broadcastButton=" + this.d + Separators.RPAREN;
    }
}
