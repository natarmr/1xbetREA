package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class vnn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tdn f37727a;
    public final wdn b;
    public final int c;

    public vnn0(tdn tdnVar, wdn wdnVar, int i) {
        this.f37727a = tdnVar;
        this.b = wdnVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnn0)) {
            return false;
        }
        vnn0 vnn0Var = (vnn0) obj;
        return this.f37727a.equals(vnn0Var.f37727a) && this.b == vnn0Var.b && this.c == vnn0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.f37727a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SwapPlayersTeamStateModel(player=");
        sb.append(this.f37727a);
        sb.append(", currentTeamType=");
        sb.append(this.b);
        sb.append(", oppositeTeamSize=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
