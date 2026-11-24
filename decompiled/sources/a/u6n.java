package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u6n implements v6n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4d f35144a;
    public final w6n b;
    public final d280 c;

    public u6n(d4d d4dVar, w6n w6nVar, d280 d280Var) {
        d4dVar.getClass();
        w6nVar.getClass();
        d280Var.getClass();
        this.f35144a = d4dVar;
        this.b = w6nVar;
        this.c = d280Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6n)) {
            return false;
        }
        u6n u6nVar = (u6n) obj;
        return this.f35144a == u6nVar.f35144a && this.b == u6nVar.b && Intrinsics.d(this.c, u6nVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f35144a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Square(style=" + ("DsTeamLogoStyle(placeHolderColorKey=" + this.f35144a + Separators.RPAREN) + ", sizeType=" + this.b + ", opponentIcon=" + this.c + Separators.RPAREN;
    }
}
