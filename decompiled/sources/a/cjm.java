package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cjm implements ejm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4 f4467a;
    public final xim b;

    public cjm(i4 i4Var, xim ximVar) {
        i4Var.getClass();
        this.f4467a = i4Var;
        this.b = ximVar;
    }

    @Override // a.ejm
    public final xim a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjm)) {
            return false;
        }
        cjm cjmVar = (cjm) obj;
        return Intrinsics.d(this.f4467a, cjmVar.f4467a) && this.b == cjmVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4467a.hashCode() * 31);
    }

    public final String toString() {
        return "Cards(gamesGameCardList=" + this.f4467a + ", style=" + this.b + Separators.RPAREN;
    }
}
