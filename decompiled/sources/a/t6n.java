package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class t6n implements v6n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4d f33426a;
    public final w6n b;
    public final c280 c;

    public t6n(d4d d4dVar, w6n w6nVar, c280 c280Var) {
        this.f33426a = d4dVar;
        this.b = w6nVar;
        this.c = c280Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6n)) {
            return false;
        }
        t6n t6nVar = (t6n) obj;
        return this.f33426a == t6nVar.f33426a && this.b == t6nVar.b && this.c.equals(t6nVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f33426a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Circle(style=" + ("DsTeamLogoStyle(placeHolderColorKey=" + this.f33426a + Separators.RPAREN) + ", sizeType=" + this.b + ", opponentIcon=" + this.c + Separators.RPAREN;
    }
}
