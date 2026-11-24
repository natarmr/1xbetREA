package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class h1z implements ivw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12307a;
    public final ufp0 b;
    public final ArrayList c;
    public final ufp0 d;
    public final ArrayList e;

    public h1z(boolean z, ufp0 ufp0Var, ArrayList arrayList, ufp0 ufp0Var2, ArrayList arrayList2) {
        this.f12307a = z;
        this.b = ufp0Var;
        this.c = arrayList;
        this.d = ufp0Var2;
        this.e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1z)) {
            return false;
        }
        h1z h1zVar = (h1z) obj;
        return this.f12307a == h1zVar.f12307a && this.b.equals(h1zVar.b) && this.c.equals(h1zVar.c) && this.d.equals(h1zVar.d) && this.e.equals(h1zVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.f(this.d, twn.g(this.c, twn.a(5, twn.f(this.b, Boolean.hashCode(this.f12307a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LastGamesUiModel(isPair=");
        sb.append(this.f12307a);
        sb.append(", teamOne=");
        sb.append(this.b);
        sb.append(", maxGamesCount=5, teamOneLastGames=");
        sb.append(this.c);
        sb.append(", teamTwo=");
        sb.append(this.d);
        sb.append(", teamTwoLastGames=");
        return rz4.n(sb, this.e, Separators.RPAREN);
    }
}
