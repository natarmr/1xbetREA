package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class gol0 implements kol0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4i f11636a;
    public final u3i b;
    public final u3i c;
    public final u3i d;

    public gol0(c4i c4iVar, u3i u3iVar, u3i u3iVar2, u3i u3iVar3) {
        this.f11636a = c4iVar;
        this.b = u3iVar;
        this.c = u3iVar2;
        this.d = u3iVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gol0)) {
            return false;
        }
        gol0 gol0Var = (gol0) obj;
        return this.f11636a.equals(gol0Var.f11636a) && this.b.equals(gol0Var.b) && this.c.equals(gol0Var.c) && this.d.equals(gol0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + vqd.c(this.c, (this.b.hashCode() + (this.f11636a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "LargeCardLargeTeamLogo(labelModel=" + this.f11636a + ", favoriteButton=" + this.b + ", notificationButton=" + this.c + ", broadcastButton=" + this.d + Separators.RPAREN;
    }
}
