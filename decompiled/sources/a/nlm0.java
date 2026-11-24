package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nlm0 implements slm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ixm f23735a;
    public final ixm b;
    public final String c;
    public final lgm d;
    public final lgm e;

    public nlm0(ixm ixmVar, ixm ixmVar2, String str, lgm lgmVar, lgm lgmVar2) {
        str.getClass();
        this.f23735a = ixmVar;
        this.b = ixmVar2;
        this.c = str;
        this.d = lgmVar;
        this.e = lgmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlm0)) {
            return false;
        }
        nlm0 nlm0Var = (nlm0) obj;
        return this.f23735a.equals(nlm0Var.f23735a) && this.b.equals(nlm0Var.b) && Intrinsics.d(this.c, nlm0Var.c) && this.d.equals(nlm0Var.d) && this.e.equals(nlm0Var.e);
    }

    public final int hashCode() {
        return this.e.f20016a.hashCode() + ((this.d.f20016a.hashCode() + ua80.b((this.b.hashCode() + (this.f23735a.hashCode() * 31)) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        return "MultiGame(firstOpponent=" + this.f23735a + ", secondOpponent=" + this.b + ", infoLabel=" + this.c + ", startResultIndicator=" + this.d + ", endResultIndicator=" + this.e + Separators.RPAREN;
    }
}
