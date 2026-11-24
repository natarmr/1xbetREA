package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pmm0 implements umm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jxm f27243a;
    public final jxm b;
    public final String c;
    public final ngm d;
    public final ngm e;

    public pmm0(jxm jxmVar, jxm jxmVar2, String str, ngm ngmVar, ngm ngmVar2) {
        str.getClass();
        this.f27243a = jxmVar;
        this.b = jxmVar2;
        this.c = str;
        this.d = ngmVar;
        this.e = ngmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmm0)) {
            return false;
        }
        pmm0 pmm0Var = (pmm0) obj;
        return this.f27243a.equals(pmm0Var.f27243a) && this.b.equals(pmm0Var.b) && Intrinsics.d(this.c, pmm0Var.c) && this.d.equals(pmm0Var.d) && this.e.equals(pmm0Var.e);
    }

    public final int hashCode() {
        return this.e.f23493a.hashCode() + ((this.d.f23493a.hashCode() + ua80.b((this.b.hashCode() + (this.f27243a.hashCode() * 31)) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        return "MultiGames(firstOpponent=" + this.f27243a + ", secondOpponent=" + this.b + ", infoLabel=" + this.c + ", startResultIndicator=" + this.d + ", endResultIndicator=" + this.e + Separators.RPAREN;
    }
}
